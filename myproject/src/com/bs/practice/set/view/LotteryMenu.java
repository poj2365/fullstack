package com.bs.practice.set.view;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import com.bs.practice.set.controller.LotteryController;
import com.bs.practice.set.model.vo.Lottery;


public class LotteryMenu {
	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("========== BS 추첨 프로그램 ==========");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 당첨 대상 확인");
			System.out.println("4. 정렬된 당첨 대상 확인");
			System.out.println("5. 당첨 대상 검색");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int key = sc.nextInt();
			switch(key) {
			case 1:
				insertObject();
				break;
			case 2:
				deleteObject();
				break;
			case 3:
				winObject();
				break;
			case 4:
				lc.sortedWinObject();
				break;
			case 5:
				searchWinner();				
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
			}
	}
	


	public void insertObject() {
			System.out.print("추첨 대상 수 입력 : ");
			int length = sc.nextInt();
			for(int i =0;i<length;i++) {
				System.out.print("추첨자 이름 : ");
				String name = sc.next();
				sc.nextLine();
				System.out.print("추첨자 핸드폰번호 : ");
				String phone = sc.nextLine();
				Lottery lt = new Lottery(name,phone);
				boolean result = lc.insertObject(lt);
				if(!result) {
					System.out.println("중복된 대상입니다. 다시 입력하세요.");
				}
			}
			System.out.println("추가 완료되었습니다");
	}
	
	public void deleteObject() {
		System.out.print("삭제할 이름 : ");
		String name = sc.next();
		sc.nextLine();
		System.out.print("삭제할 핸드폰번호 : ");
		String phone = sc.nextLine();
		Lottery lt = new Lottery(name,phone);
		boolean result = lc.deleteObject(lt);
		if(result) {
			System.out.println("삭제 완료 되었습니다.");
		}else {
			System.out.println("존재하지 않는 대상입니다.");
		}
	}
	
	public void winObject() {
		HashSet hs = new HashSet();
		hs = lc.winObject();
		hs.forEach(System.out::println);
	}

	
	public void searchWinner() {
		System.out.print("추첨자 이름 : ");
		String name = sc.next();
		sc.nextLine();
		System.out.print("추첨자 핸드폰번호 : ");
		String phone = sc.nextLine();
		Lottery lt = new Lottery(name,phone);
		boolean result = lc.searchWinner(lt);
		if(result) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		}else {
			System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다");
		}
	}
}
