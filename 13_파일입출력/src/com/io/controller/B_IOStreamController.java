package com.io.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.StringTokenizer;

import com.io.model.vo.Snack;

public class B_IOStreamController {

	public void fileSave() {
		// 프로그램에서 사용하는 데이터를 지정된 file에 저장하는 기능
		// 변수에 있는 값을 저장
		// 1. FileOutputStream 클래스 생성
		// 매개변수 있는 생성자를 이용해서 생성
		// File 객체를 전달하거나 문자열(경로+파일명)을 전달
		// new FileOutputStream(new File("test/myfile"));
		// new FileOutputStream("test/myfile");

		// 2. FileOutpoutStream 클래스가 제공하는 메소드를 이용해서 내용을 저장
		// write(int || byte[]) 를 이용

		// 3. 반드시 생성된 스트림을 반환
		// close() 메소드

		// 스트림 객체의 메소드는 checkedException 을 throws 하고 있음.
		// 예외 처리 필수
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("text.txt");
			fos.write(65);
			fos.write(66);
			fos.write(67);
			String name = "유병승";
			fos.write(name.charAt(0));
			fos.write(name.charAt(1));
			fos.write(name.charAt(2));

			String alpha = "banana";
			for (int i = 0; i < alpha.length(); i++) {
				fos.write(alpha.charAt(i));
			}

			byte[] testName = name.getBytes(Charset.forName("UTF-8"));
			fos.write(testName);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public void fileLoad() {
		// 특정 파일에 저장된 데이터를 가져오는 기능
		// 1. FileInputStream 클래스를 생성
		// 매개변수 있는 생성자를 이용
		// "경로+파일명" / new File("경로+파일명")
		// 2. read() 메소드를 이용해서 데이터를 가져옴
		// 3. 스크림을 반환 -> close()

		FileInputStream fis = null;

		try {
			fis = new FileInputStream(new File("text.txt"));
//			int data = 0;
//			while((data=fis.read())!=-1) {
//				System.out.println(data);
//			}
			byte[] data2 = new byte[1024];
			fis.read(data2);
			String data = new String(data2);
			System.out.println(data);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		}
	}

	// 문자열 전용 스트림 이용하기
	// Writer, Reader 클래스를 상속받은 클래스
	// FileWriter, FileReader 클래스를 이용
	public void stringSaveFile() {
//		FileWriter fw = null;
		try (FileWriter fw = new FileWriter("test2.txt")) {// finally 안써도됨
			String msg = "여러분 힘내세요~ 오늘 지나면 금요일이에요! 유후~";
			fw.write(msg);
			int age = 19;
			fw.write("19");
			double height = 180.5;
			fw.write(String.valueOf(height));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void stringFileLoad() {
		try (FileReader fr = new FileReader("test2.txt")) {
			int data = 0;
			while ((data = fr.read()) != -1) {
				System.out.println((char) data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 파일에 데이터를 저장하는 메소드 만들기
	// 파일에 저장도니 데이터 가져오는 메소드 만들기
	// 1. 파일명, 저장할 데이터(문자열)을 전달 받아 파일에 저장하는 기능
	// 2. 파일명을 전달 받아 그 파일에 있는 데이터를 출력하는 기능
	// 내 풀이
	public void saveFile(String name, String content) {
		try (FileWriter sf = new FileWriter(name + ".txt")) {
			sf.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void loadFile(String name) {
		try (FileReader frr = new FileReader(name + ".txt")) {
			int data = 0;
			while ((data = frr.read()) != -1) {
				System.out.println((char) data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 선생님 풀이
	public void fileSaveStr(String fileName, String data) {
		try (FileWriter fw = new FileWriter(fileName, true)) {
			fw.write(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void fileLoadStr(String fileName) {
		File f = new File(fileName);
		if (f.exists()) {

			try (FileReader fr = new FileReader(fileName)) {
				int data = 0;
				StringBuffer sb = new StringBuffer();
				while ((data = fr.read()) != -1) {
					sb.append((char) data);
				}
				System.out.println(sb);
			} catch (Exception e) {
				e.printStackTrace();
				if (e.getMessage().contains("액세스")) {
					File f1 = new File(fileName);
					if (f1.isDirectory()) {
						System.err.println("폴더에는 데이터를 저장할 수 없습니다.");
					}
				}
			}
		}
	}

	public void saveSnack(String fileName, Object o) {
		try (FileWriter fw = new FileWriter(fileName)) {
//			fw.write(o);
			Snack[] snack = (Snack[]) o;
			for (Snack s : snack) {
				fw.write(s.toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void loadSnack(String name) {
		String[] str1 = new String[9];
		try (FileReader fr = new FileReader(name)){
			int data = 0;
			StringBuffer sb = new StringBuffer();
			while((data=fr.read())!=-1) { 
				sb.append((char) data);
			}
			StringTokenizer st = new StringTokenizer(sb.toString(),"\n");
			while (st.hasMoreTokens()) {
				String snackName = st.nextToken();
				int price = Integer.parseInt(st.nextToken());
				String maker = st.nextToken();

				System.out.println(snackName + "," + price + "," + maker);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		/*
		try (BufferedReader br = new BufferedReader(new FileReader(name))) {
			String str;
			String[] snackList = new String[99];
			while ((str = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(str, ",");
				while (st.hasMoreTokens()) {
					String snackName = st.nextToken();
					int price = Integer.parseInt(st.nextToken());
					String maker = st.nextToken();

					System.out.println(snackName + "," + price + "," + maker);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/
	
	public Snack[] loadSnack1(String name) {
		Snack[] returnSnack=null;
		try (FileReader fr = new FileReader(name)){
			int data = 0;
			StringBuffer sb = new StringBuffer();
			while((data=fr.read())!=-1) { 
				sb.append((char) data);
			}
			String[] snacks = new String(sb).split("\n");
			returnSnack = new Snack[snacks.length];
//			int index =0;
//			for(String s : snacks) {
//			String[] snackData = s.split(",");
			for(int i=0;i<snacks.length;i++) {
			String[] snackData = snacks[i].split(",");
				System.out.println(Arrays.toString(snackData));
				Snack snackObj = new Snack(snackData[0],
						Integer.parseInt(snackData[1]),
						snackData[2]
						);
				returnSnack[i]= snackObj;
			}
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return returnSnack;
	}
}
