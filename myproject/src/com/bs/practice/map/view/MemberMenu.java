package com.bs.practice.map.view;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

import com.bs.practice.map.controller.MemberController;
import com.bs.practice.map.model.vo.Member;

public class MemberMenu {
	  private Scanner sc = new Scanner(System.in);
	   private MemberController mc = new MemberController();
	   
	    public void mainMenu() {
	    	System.out.println("========== BS 사이트 ==========");
	        while (true) {
	            System.out.println("******* 메인 메뉴 *******");
	            System.out.println("1. 회원가입");
	            System.out.println("2. 로그인");
	            System.out.println("3. 같은 이름 회원 찾기");
	            System.out.println("9. 종료");
	            System.out.print("메뉴 번호 선택 : ");
	            int choice = sc.nextInt();
	            sc.nextLine();
	            switch (choice) {
	                case 1: 
	                	joinMembership();
	                	break;
	                case 2: 
	                	logIn(); 
	                	break;
	                case 3: 
	                	sameName();
	                	break;
	                case 9: 
	                	System.out.println("프로그램을 종료."); 
	                	return;
	                default: 
	                	System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
	            }
	        }
	    }

	    public void joinMembership() {
	        System.out.print("아이디 입력: ");
	        String id = sc.nextLine();
	        System.out.print("비밀번호 입력: ");
	        String password = sc.nextLine();
	        System.out.print("이름 입력: ");
	        String name = sc.nextLine();

	        Member member = new Member(password, name);
	        if (mc.joinMembership(id, member)) {
	            System.out.println("성공적으로 회원가입 완료하였습니다.");
	        } else {
	            System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
	        }
	    }

	    private void logIn() {
	        System.out.print("아이디 입력: ");
	        String id = sc.nextLine();
	        System.out.print("비밀번호 입력: ");
	        String password = sc.nextLine();

	        boolean result = mc.logIn(id, password);
	        if(result) {
	        	System.out.println(id+"님, 환영합니다!");
	        	memberMenu();
	        }else {
	        	System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요");
	        	return;
	        }
	    }

	    private void memberMenu() {
	    	   while (true) {
		            System.out.println("******* 회원 메뉴 *******");
		            System.out.println("1. 비밀번호 바꾸기");
		            System.out.println("2. 이름 바꾸기");
		            System.out.println("3. 로그아웃");
		            System.out.print("메뉴 번호 선택 : ");
		            int choice = sc.nextInt();
		            sc.nextLine();
		            switch (choice) {
		                case 1: 
		                	changePassword();
		                	break;
		                case 2: 
		                	changeName();
		                	break;
		                case 3: 
		                	System.out.println("로그아웃 되었습니다.");
		                	return;
		                default: 
		                	System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
		            }
		        }
		}

		private void changePassword() {
	        System.out.print("아이디 입력: ");
	        String id = sc.nextLine();
	        System.out.print("현재 비밀번호 입력: ");
	        String oldPw = sc.nextLine();
	        System.out.print("변경할 비밀번호 입력: ");
	        String newPw = sc.nextLine();

	        if (mc.changePassword(id, oldPw, newPw)) {
	            System.out.println("비밀번호 변경에 성공했습니다.");
	        } else {
	            System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
	            return;
	        }
	    }

	    private void changeName() {
	        System.out.print("아이디 입력: ");
	        String id = sc.nextLine();
	        System.out.print("비밀번호 입력: ");
	        String password = sc.nextLine();
	        boolean result = mc.logIn(id, password);
	        if(result) {
		        System.out.println(result);
		        System.out.print("변경할 이름 입력: ");
		        String newName = sc.nextLine();
		        mc.changeName(id, newName);
		        System.out.println("이름 변경에 성공하였습니다.");
	        }else {
	        	System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요");
	        	return;
	        }

	    }

	    private void sameName() {
	        System.out.print("조회할 이름 입력: ");
	        String name = sc.nextLine();

	        TreeMap members = mc.sameName(name);
	        if (members.isEmpty()) {
	            System.out.println("해당 이름을 가진 회원이 없습니다.");
	        } else {
	            System.out.println("같은 이름의 회원들:");
	            for (Object o : members.entrySet()) {
	            	Map.Entry e = (Map.Entry)o;
//	                System.out.println(members.get(name)+" - "+members.get(e.getValue()));
	                System.out.println(e.getKey()+" - "+e.getValue());
	            }
	        }
	    }
}
