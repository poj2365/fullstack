package com.io.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.rmi.server.UID;
import java.util.Arrays;
import java.util.Scanner;

import com.io.model.vo.Animal;

public class C_SubStreamController {
	public void changeStream() {
		// byte 기반 stream을 문자열 기반으로 변경해주는 보조스트림
		// InputStreamReader / OutputStreamWriter
		try (FileInputStream fis = new FileInputStream("snack.bs");
				InputStreamReader isr = new InputStreamReader(fis);) {
			int data = 0;
//			while((data=fis.read())!=-1) {
//				System.out.println((char)data);
//			} 데이터 깨짐
			while ((data = isr.read()) != -1) {
				System.out.println((char) data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 인터넷에서 특정 사이트가 주는 데이터(html 파일)를 가져올 때
		// byte 기반으로 가져옴
		try {
			URL url = new URL("https://www.genia.academy/");
			HttpURLConnection connect = (HttpURLConnection) url.openConnection();
			InputStream input = connect.getInputStream();
			InputStreamReader isr = new InputStreamReader(input);
			int data = 0;
			StringBuffer sb = new StringBuffer();
			while ((data = isr.read()) != -1) {
				sb.append((char) data);
			}
			System.out.println(sb);
			FileWriter writer = new FileWriter("index.html");
			writer.write(new String(sb));
			writer.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// 입출력 고속화처리 스트림
	// BufferedInputStream / BufferedOutputStream
	public void bufferedSave() {
		try (FileOutputStream fos = new FileOutputStream("testfile");
				BufferedOutputStream bos = new BufferedOutputStream(fos);) {

			bos.write("우와 오늘은 금요일~ 주말에 날씨가 화창하대요".getBytes());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void bufferedLoad() {
		try (FileInputStream fis = new FileInputStream("testfile");
				BufferedInputStream bis = new BufferedInputStream(fis);) {
			byte[] data = new byte[1024];
			bis.read(data);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 데이터기반으로 파일에 저장하는 스트림
	// DataInputStream / DataOutputStream
	public void dataOutputStream() {
		Animal[] animals = { new Animal("도토리", "햄스터", 3, 0.2, '여'), new Animal("뽀비", "강아지", 5, 3.4, '남'),
				new Animal("야옹이", "고양이", 2, 2.4, '여'), new Animal("킥킥이", "원숭이", 10, 30, '남'),
				new Animal("토롱이", "토끼", 30, 70.5, '남') };

		try (FileOutputStream fos = new FileOutputStream("animal.bs");
				DataOutputStream dos = new DataOutputStream(fos);) {// 보조스트림을 쓸때는 기본스트림을 먼저 넣어줘야됨

			for (Animal a : animals) {
				dos.writeUTF(a.getName());
				dos.writeUTF(a.getType());
				dos.writeInt(a.getAge());
				dos.writeDouble(a.getWeight());
				dos.writeChar(a.getGender());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Animal[] dataInputStream() {
		try (FileInputStream fis = new FileInputStream("animal.bs"); 
				DataInputStream dis = new DataInputStream(fis);) {
			Animal[] animals = new Animal[10];
			int i = 0;
			while (true) {
				try {
					String name = dis.readUTF();
					String type = dis.readUTF();
					int age = dis.readInt();
					double weight = dis.readDouble();
					char gender = dis.readChar();
					animals[i++] = new Animal(name, type, age, weight, gender);
					System.out.println(name + " " + type + " " + age + " " + weight + " " + gender);

				} catch (EOFException e) {
					e.printStackTrace();
					System.out.println("파일 다 읽음");
					return animals;
				}
			}
			// EOFException

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	// 객체를 저장하는 보조스트림
	// ObjectOutputStream / ObjectInputStream
	// 저장할 클래스가 Serializerable 인터페이스를 구현
	public Animal[] objectOutputStream() {
		try (FileOutputStream fos = new FileOutputStream("animalObj.bs");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			Animal[] animals = { new Animal("덕만이", "강아지", 7, 5, '여'), new Animal("춘식이", "고양이", 4, 5.2, '남'),
					new Animal("삼식이", "고양이", 2, 4, '여'), new Animal("예삐", "강아지", 17, 3, '여'),
					new Animal("토롱이", "토끼", 30, 70.5, '남') };
//			oos.writeObject(new Animal("덕만이","강아지",7,5,'여'));
//			for(int i =0;i<animals.length;i++) {
//				oos.writeObject(animals[i]);
//			}
			return animals;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void objectinputStream(Animal[] animal) {
		try(FileInputStream fis = new FileInputStream("animalObj.bs");
				ObjectInputStream ois = new ObjectInputStream(fis);
		) {
			for(int i =0;i<animal.length;i++) {
//				Animal a =(Animal)ois.readObject();
				Animal[] animals = (Animal[])ois.readObject();
				System.out.println(animals);
			}
		}catch (EOFException e) {
				e.printStackTrace();
		}catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

}
