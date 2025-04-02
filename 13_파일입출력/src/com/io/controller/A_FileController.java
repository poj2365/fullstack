package com.io.controller;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;

public class A_FileController {
	public void fileTest() {
		// File 클래스를 이용해서 파일 다루기
		// filesysystem에 저장되어 있는 file 들을 이용할 수 있게 해주는 클래스
		// 1. File 클래스 생성
		// 매개변수 생성자를 이용해서 생성
		File f = new File("test.ppt");
		// 매개변수에 경로 + 파일명으로 작성
		// 절대경로 : 운영체제의 파일 시스템에서 root 경로부터 작성하는 것
		// win -> c:\ d:\ C:\\Users\\user\\Downloads
		// 리눅스/맥 -> /Users/bslove/Downloads
		// 상대경로 : 현재 파일이 있는 위치를 기준으로 경로를 설정하는 것
		// ./ : 현재 폴더 -> ./test.txt
		// ../ : 상위 폴더 -> ../../test.txt
		File f2 = new File("c:\\Users\\poj23\\test.txt");

		try {
			boolean result = f.createNewFile();
			f2.createNewFile();
			System.out.println(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		File dir = new File("filetest/test/a/b");
//		System.out.println(dir.mkdir());
//		System.out.println(dir.mkdirs());

		// 파일, 폴더 삭제하기
		File delFile = new File("test.ppt");
		System.out.println(delFile.delete() ? "파일삭제완료" : "파일삭제실패");
		File delDir = new File("filetest/test/a");
		// 폴더를 삭제할때는 폴더내에 파일이나 폴더가 없어야함
		System.out.println(delDir.delete() ? "폴더삭제" : "폴더삭제실패");

		// 기존에 있는 파일에 대한 정보 확인하기
		File infoFile = new File("c:\\Users\\poj23\\FruitFilter.java");
		// 파일명 확인하기
		// getName()
		System.out.println(infoFile.getName());
		// 부모파일명 확인하기
		// getParent()
		System.out.println(infoFile.getParent());
		// 부모 폴더를 파일 객체로 가져오기
		// getParrentFile
		File parent = infoFile.getParentFile();
		System.out.println(parent);
		System.out.println(parent.getParent());

		// 파일 경로 출력하기
		// getPath() / getAbsolutePath()
		System.out.println(infoFile.getPath());
		System.out.println(infoFile.getAbsolutePath());

		// 파일인지 폴더인지 확인
		System.out.println(infoFile.isFile());
		System.out.println(infoFile.isDirectory());
		System.out.println(parent.isFile());
		System.out.println(parent.isDirectory());

		// 파일 속성 정보 확인
		// 읽기, 쓰기, 숨김파일, 수정날짜, 파일크기
		System.out.println("읽기 : " + infoFile.canRead());
		System.out.println("쓰기 : " + infoFile.canWrite());
		System.out.println("실행 : " + infoFile.canExecute());
		System.out.println("숨김파일 : " + infoFile.isHidden());
		System.out.println("파일크기 : " + infoFile.length());
		System.out.println("수정날짜 : " + infoFile.lastModified());

		// 폴더내부에 파일리스트 가져오기
		File target = new File("C:/Users/poj23/Downloads/");
		// list() : String[], listFiles() : File[]
		String[] fileNames = target.list();
		for (String name : fileNames) {
			System.out.println(name);
		}
		File[] files = target.listFiles();
		for (File f1 : files) {
			if (f1.isFile()) {
//				System.out.println("파일명 : "f1.getName());
//				System.out.println("수정가능 : "f1.canWrite());
//				System.out.println("파일여부 : "f1.isFile());
			}
		}

		// list(FilenameFilter), listFiles(FilenameFilter)

		String[] filename2 = target.list((dir1, name) -> name.length() > 20);
		System.out.println("----- 20글자 이상 -----");
		for (String name : filename2) {
			System.out.println(name);
		}

		filename2 = target.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.length() > 10;
			}
		});

		File[] files2 = target.listFiles((dir1, name) -> {
			return dir1.isFile();
		});
	}
	
	
	// 사용자가 원하는 폴더를 생성하고 그 폴더에 파일을 생성하는 기능
	// 폴더명, 파일명을 전달받아 생성해주는 기능
	// public boolean createMyfile()
	public boolean createMyfile1() throws IOException {// 내 풀이
		Scanner sc = new Scanner(System.in);
		System.out.print("폴더명을 입력해주세요 : ");
		String dir = sc.next();
		System.out.print("파일명을 입력해주세요 : ");
		String file = sc.next();
		
		File f = new File(dir);
		String result = f.mkdirs()?"폴더가 생성되었습니다.\n":"폴더 생성에 실패하였습니다.\n";
		if(f.isDirectory()) {
			if(f.getName().equals(dir)) {
				return true;
			}
		}
		f = new File(dir+"\\"+file);
		result += f.createNewFile()?"파일이 생성되었습니다.":"파일 생성에 실패하였습니다.";
		if(f.isFile()) {
			if(f.getName().equals(file)) {
				return true;
			}
		}
		System.out.println(result);

		
		return false;
	}
	
	public boolean createMyfile(String path, String fileName) {
		File dir = new File(path);
		File file = new File(path+"/"+fileName);
		if(dir.mkdir()) {
			try {
				return file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}else {
			return false;
		}
	}
}
