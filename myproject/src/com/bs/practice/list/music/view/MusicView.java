package com.bs.practice.list.music.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.bs.practice.list.music.model.vo.Music;
import com.bs.practice.list.music.controller.MusicController;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();

	//사용자가 직접 메인 메뉴를 선택할 수 있음. 종료 전까지 반복실행. 각 메뉴를 누를 시 해당 메소드로 이동. 
	public void mainMenu() {
		while(true) {
		System.out.println("******* 메인 메뉴 *******");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보 수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 가수명 내림차순 정렬");
		System.out.println("9. 종료");
		System.out.print("메뉴 번호 선택 : ");
		int key = sc.nextInt();
		switch(key) {
		case 1:
			addList();
			break;
		case 2:
			addAtZero();
			break;
		case 3:
			printAll();
			break;
		case 4:
			searchMusic();
			break;
		case 5:
			removeMusic();
			break;
		case 6:
			setMusic();
			break;
		case 7:
			ascTitle();
			break;
		case 8:
			descSinger();
			break;
		case 9:
			System.out.println("종료");
			return;
		default:
			System.out.println("잘못입력하셨습니다.");
		}
		}
	}
	public void addList() {
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		sc.nextLine();
		System.out.print("곡명 입력 : ");
		String title = sc.nextLine();
		System.out.print("가수명 입력 : ");
		String author = sc.nextLine();
		Music music = new Music(title,author);
		int result = mc.addList(music);
		if(result==1) {
			System.out.println("추가 성공");
		}else {
			System.out.println("추가 실패");
		}
	}
	public void addAtZero(){
		System.out.println("****** 첫 위치에 곡 추가 ******");
		sc.nextLine();
		System.out.print("곡명 입력 : ");
		String title = sc.nextLine();
		System.out.print("가수명 입력 : ");
		String author = sc.nextLine();
		Music music = new Music(title,author);
		int result = mc.addAtZero(music);
	}
	
	public void printAll(){
		System.out.println("****** 전체 곡 목록 출력 ******");
		List list = new ArrayList();
		list = mc.printAll();
		for(int i=0;i<list.size();i++) {
			System.out.println(((Music)(list.get(i))).getTitle());
			System.out.println(((Music)(list.get(i))).getSinger());
			System.out.println("-----------------------------");
		}
	}
	
	public void searchMusic(){
		System.out.println("****** 특정 곡 검색 ******");
		sc.nextLine();
		System.out.print("곡명 입력 : ");
		String title = sc.nextLine();
		Music searchMusic = new Music();
		searchMusic = mc.searchMusic(title);
		if(searchMusic==null) {
			System.out.println("검색한 곡이 없습니다.");
		}else {
			System.out.println("검색한 곡은 "+searchMusic.getTitle()+" "+searchMusic.getTitle() +"입니다.");
		}
	}
	
	public void removeMusic(){
		sc.nextLine();
		System.out.println("****** 특정 곡 삭제 ******");
		System.out.print("삭제할 곡명 입력 : ");
		String title = sc.nextLine();
		Music remove = new Music();
		remove = mc.removeMusic(title);
		if(remove==null) {
			System.out.println("삭제할 곡이 없습니다.");
		}else {
			System.out.println(remove.getTitle()+" "+remove.getSinger()+"을 삭제 했습니다");
		}
	}
	
	public void setMusic() {
		sc.nextLine();
		System.out.println("****** 특정 곡 정보 수정 ******");
		System.out.print("수정할 곡명 입력 : ");
		String title = sc.nextLine();
		System.out.print("가수명 입력 : ");
		String author = sc.nextLine();
		Music music = new Music(title,author);
		Music setMusic = mc.setMusic(title, music);
		if(setMusic==null) {
			System.out.println("수정할 곡이 없습니다.");
		}else {
			System.out.println(setMusic.getTitle()+" "+setMusic.getSinger()+"이 변경되었습니다");
		}
	}
	
	public void ascTitle(){
		System.out.println("****** 곡 명 오름차순 정렬 ******");
		int result = mc.ascTitle();
		if(result==1) {
			System.out.println("정렬 성공");
		}else {
			System.out.println("정렬 실패");
		}
	}
	
	
	public void descSinger(){
		System.out.println("****** 가수 명 내림차순 정렬 ******");
		int result = mc.descSinger();
		if(result==1) {
			System.out.println("정렬 성공");
		}else {
			System.out.println("정렬 실패");
		}
	}

}
