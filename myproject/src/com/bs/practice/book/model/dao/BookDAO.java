package com.bs.practice.book.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.StringTokenizer;

import com.bs.practice.book.model.vo.Book;

public class BookDAO {
	private Book[] bArr = new Book[10];

	public void fileSave(Book[] bArr) {
		try (FileOutputStream fos = new FileOutputStream("book.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			for(int i=0;i<bArr.length;i++) {
				if(bArr[i]!=null) {
					oos.writeObject(bArr[i]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Book[] fileRead() {
		Book[] book = new Book[10];
		try (FileInputStream fis = new FileInputStream("book.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
				for(int i=0;i<bArr.length;i++) {
					book = (Book[])ois.readObject();
				}
				
//		try (FileInputStream fis = new FileInputStream("book.txt"); 
//				DataInputStream dis = new DataInputStream(fis);) {
//			for (int i=0;i<book.length;i++) {
//				try {
//					String title = dis.readUTF();
//					String author = dis.readUTF();
//					int price = dis.readInt();
//					String date = dis.readUTF();
//					Calendar c;
//					c = Calendar.getInstance();
//					StringTokenizer st = new StringTokenizer(date,"-");
//					while(st.hasMoreTokens()) {
//						c.set(Calendar.YEAR,Integer.parseInt(st.nextToken()));
//						c.set(Calendar.MONTH,Integer.parseInt(st.nextToken()));
//						c.set(Calendar.DAY_OF_MONTH,Integer.parseInt(st.nextToken()));
//					}
//					double discount = dis.readChar();
//					book[i] = new Book(title, author, price, c, discount);
//					System.out.println(title);
//				}
//			}
		} catch (EOFException e) {
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return bArr;

	}

}
