package com.bs.practice.file.view;

import java.io.File;
import java.util.Scanner;

import com.bs.practice.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();

	public void mainMenu() {
		while (true) {

			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			switch (sc.nextInt()) {
			case 1:
				fileSave();
				break;
			case 2:
				fileOpen();
				break;
			case 3:
				fileEdit();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void fileSave() {
		sc.nextLine();
		StringBuilder sb = new StringBuilder();
		while (true) {
			System.out.println("파일에 저장할 내용을 입력해주세요");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String str = sc.nextLine();
			if (str.equals("ex끝it")) {
				while (true) {
					System.out.println("저장할 파일명을 입력해주세요");
					String name = sc.next();
					File f = new File(name);
					if (f.exists()) {
						System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까? (y/n)");
						String chk = sc.next();
						if (chk.equals("y")) {
							fc.fileSave(name, sb);
							return;
						} else {
							continue;
						}
					}else {
						fc.fileSave(name, sb);
						return;
					}
				}
			} else {
				sb.append(str).append("\n");
			}

		}
	}

	public void fileOpen() {
		StringBuilder sb = new StringBuilder();
		System.out.print("열 파일 명 : ");
		String name = sc.next();
		if(fc.checkName(name)) {
			sb = fc.fileOpen(name);
			System.out.println(sb.toString());
		}else {
			System.out.println("없는 파일입니다.");
			return;
		}
	}

	public void fileEdit() {
		sc.nextLine();
		System.out.print("수정할 파일 명 : ");
		String name = sc.next();
		if(fc.checkName(name)) {
			while (true) {
				StringBuilder sb = new StringBuilder();
				System.out.println("파일에 저장할 내용을 입력해주세요");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
				System.out.print("내용 : ");
				String str = sc.nextLine();
				if (str.equals("ex끝it")) {
					fc.fileEdit(name, sb);
					return;
				}else {
					sb.append(str).append("\n");
				}
			}
		}else {
			System.out.println("없는 파일입니다.");
			return;
		}
	}
}
