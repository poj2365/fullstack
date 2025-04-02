package com.bs.practice.file.model.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	public boolean checkName(String file) {
		File f = new File(file);
		return f.exists();
	}
	
	public void fileSave(String file, String s) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
//		FileWriter fw = new FileWriter(file);
			bw.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		try {
			FileReader fr = new FileReader(file);
			int data = 0;
			while((data=fr.read())!=-1) {
				sb.append((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb;
	}
	
	public void fileEdit(String file, String s) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
				bw.write(s);
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
}
