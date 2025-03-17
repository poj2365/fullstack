package com.bs.hw.member.view;

import java.util.Scanner;

import com.bs.hw.member.controller.MemberController;
import com.bs.hw.member.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public MemberMenu() {
		int memberCnt = mc.existMemberNum();
		while (true) {
			if (memberCnt != 10) {
				System.out.println("1. 새 회원 등록");
			} else {
				System.out.println("회원 수가 모두 꽉 찾기 때문에 일부 메뉴만 오픈됩니다.");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				if (memberCnt != 10) {
					insertMember();
				}
				break;
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAll();
				break;
			case 9:
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");

			}
		}
	}

	public void MainMenu() {

	}

	public void insertMember() {
		String id = "";
		String gender = "";
		System.out.println("----- 회원가입 -----");
		while (true) {
			System.out.print("아이디를 입력해주세요");
			id = sc.next();
			if (mc.checkId(id)) {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
				continue;
			} else {
				break;
			}
		}
		System.out.println("이름을 입력해주세요");
		String name = sc.next();
		System.out.println("비밀번호을 입력해주세요");
		String pw = sc.next();
		System.out.println("이메일을 입력해주세요");
		String email = sc.next();
		while (true) {
			System.out.println("성별을 입력해주세요");
			gender = sc.next();
			if (gender.equals("M") || gender.equals("F") || gender.equals("f") || gender.equals("m")) {
				break;
			} else {
				System.out.println("성별을 다시 입력해주세요.");
				continue;
			}
		}
		System.out.println("나이을 입력해주세요");
		int age = sc.nextInt();
		mc.insertMember(id, name, pw, email, gender, age);

	}

	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			searchId();
			break;
		case 2:
			searchMember();
			break;
		case 3:
			searchEmail();
			break;
		case 9:
			return;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
		}
	}

	public void searchId() {
		System.out.println("아이디를 입력해주세요");
		String id = mc.searchId(sc.next());
		if (id.equals("")) {
			System.out.println("검색 결과가 없습니다");
			return;
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(id);
		}
	}

	public void searchName() {
		System.out.println("이름을 입력해주세요");
		String name = sc.next();
		Member[] searchMember = mc.searchName(name);
		for (int i = 0; i < searchMember.length; i++) {
			if (searchMember[i].getName().equals(name)) {
				System.out.println("찾으신 회원 조회 결과입니다.");
				System.out.println(searchMember[i].inform());
			} else {
				System.out.println("검색 결과가 없습니다");
				return;
			}
		}
	}

	public void searchEmail() {
		System.out.println("이름을 입력해주세요");
		String email = sc.next();
		Member[] searchEmail = mc.searchEmail(email);
		for (int i = 0; i < searchEmail.length; i++) {
			if (searchEmail[i].getEmail().equals(email)) {
				System.out.println("찾으신 회원 조회 결과입니다.");
				System.out.println(searchEmail[i].inform());
			} else {
				System.out.println("검색 결과가 없습니다");
				return;
			}
		}
	}

	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			updatePassword();
			break;
		case 2:
			updateName();
			break;
		case 3:
			updateEmail();
			break;
		case 9:
			return;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
		}
	}

	public void updatePassword() {
		System.out.println("아이디를 입력해주세요");
		String id = sc.next();
		System.out.println("비밀번호를 입력해주세요");
		String pw = sc.next();
		Boolean update = mc.updatePassword(id, pw);
		if (update) {
			System.out.println("수정이 성공적으로 되었습니다");
			return;
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
			return;
		}
	}

	public void updateName() {
		System.out.println("아이디를 입력해주세요");
		String id = sc.next();
		System.out.println("이름을 입력해주세요");
		String name = sc.next();
		Boolean update = mc.updateName(id, name);
		if (update) {
			System.out.println("수정이 성공적으로 되었습니다");
			return;
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
			return;
		}
	}

	public void updateEmail() {
		System.out.println("아이디를 입력해주세요");
		String id = sc.next();
		System.out.println("이메일을 입력해주세요");
		String email = sc.next();
		Boolean update = mc.updateEmail(id, email);
		if (update) {
			System.out.println("수정이 성공적으로 되었습니다");
			return;
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
			return;
		}
	}

	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			deleteOne();
			break;
		case 2:
			deleteAll();
			break;
		case 9:
			return;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
		}
	}

	public void deleteOne() {
		System.out.println("아이디를 입력해주세요");
		String id = sc.next();
		System.out.println("정말 삭제하세겠습니까?(Y/N)");
		char chk = sc.next().charAt(0);
		if (chk == 'Y' || chk == 'y') {
			Boolean delete = mc.delete(id);
			if (delete) {
				System.out.println("성공적으로 삭제 되었습니다");
				return;
			} else {
				System.out.println("존재하지 않는 아이디입니다.");
				return;
			}
		}
	}

	public void deleteAll() {
		System.out.println("정말 삭제하세겠습니까?(Y/N)");
		char chk = sc.next().charAt(0);
		if (chk == 'Y' || chk == 'y') {
			mc.deleteAll();
		}
	}

	public void printAll() {
		int cnt = 0;
		Member[] member = mc.printAll();
		for(int i =0; i <member.length;i++) {
			if(member[i]!=null) {
				member[i].inform();
			}
			if(member[i]==null) {
				cnt++;
			}
		}
		if(cnt==0) {
			System.out.println("저장된 회원이 없습니다.");
		}
	}
}
