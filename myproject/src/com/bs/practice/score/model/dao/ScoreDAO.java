package com.bs.practice.score.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class ScoreDAO {
	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
		try (FileOutputStream fis = new FileOutputStream("score"); DataOutputStream dis = new DataOutputStream(fis);) {
			dis.writeUTF(name);
			dis.writeInt(kor);
			dis.writeInt(eng);
			dis.writeInt(math);
			dis.writeInt(sum);
			dis.writeDouble(avg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public DataInputStream readScore() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("score");
		DataInputStream dis = new DataInputStream(fis);
		return new DataInputStream(fis);
	}
}