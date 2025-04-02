package com.bs.practice.generics.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import com.bs.practice.generics.controller.FarmController;
import com.bs.practice.generics.model.vo.Farm;
import com.bs.practice.generics.model.vo.Fruit;
import com.bs.practice.generics.model.vo.Nut;
import com.bs.practice.generics.model.vo.Vegetable;

public class FarmMenu {
	private Scanner sc = new Scanner(System.in);
	private FarmController fc = new FarmController();
	
	public void mainMenu() {
		System.out.println("========== BS 마트 ==========");
        while (true) {
        	System.out.println("******* 메인 메뉴 *******");
            System.out.println("1. 직원메뉴");
            System.out.println("2. 손님 메뉴");
            System.out.println("9. 종료");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
            case 1:
            	adminMenu();
            	break;
            case 2:
            	customerMenu();
            	break;
            case 9 :
            	System.out.println("프로그램 종료.");
            	return;
            	default:
            		System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
            }
        }
    }

    public void adminMenu() {
        while (true) {
        	System.out.println("******* 직원 메뉴 *******");
        	System.out.println("1. 새 농산물 추가");
        	System.out.println("2. 종류 삭제");
        	System.out.println("3. 수량 수정");
        	System.out.println("4. 농산물 목록");
        	System.out.println("9. 메인으로 돌아가기");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
            case 1:
            	addNewKind();
            	break;
            case 2:
            	removeKind();
            	break;
            case 3:
            	changeAmount();
            	break;
            case 4:
            	printFarm();
            	break;
            case 9 :
            	return;
            	default:
            		System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
            }
        }
    }

    public void customerMenu() {
    	System.out.println("현재 BS마트 농산물 수량");
    	fc.printFarm();
        while (true) {
        	System.out.println("******* 고객 메뉴 *******");
        	System.out.println("1. 농산물 사기");
        	System.out.println("2. 농산물 빼기");
        	System.out.println("3. 구입한 농산물 보기");
        	System.out.println("9. 메인으로 돌아가기");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
            case 1:
            	buyFarm();
            	break;
            case 2:
            	removeFarm();
            	break;
            case 3:
            	printBuyFarm();
            	break;
            case 9 :
            	return;
            	default:
            		System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
            }
        }
    }

    public void addNewKind() {
    	int kind =0;
    	while(true) {
        System.out.println("추가할 종류 (1. 과일 / 2. 채소 / 3. 견과): ");
        kind = sc.nextInt();
        sc.nextLine();
        	if(kind!=1 && kind !=2 && kind!=3) {
        		System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
        		continue;
        	}else {
        		break;
        	}
    	}
        System.out.println("이름: ");
        String name = sc.nextLine();
        System.out.println("수량: ");
        int amount = sc.nextInt();
        sc.nextLine();

        Farm f = kind==1 ? new Fruit("과일", name) :	 kind==2 ? new Vegetable("채소", name) : new Nut("견과", name);
        boolean result = fc.addNewKind(f, amount);
        if (result) {
        	System.out.println("새 농산물이 추가되었습니다.");
        }else {
        	System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
        	return;
        }
    }

    public void removeKind() {
    	int kind =0;
    	while(true) {
        System.out.println("추가할 종류 (1. 과일 / 2. 채소 / 3. 견과): ");
        kind = sc.nextInt();
        sc.nextLine();
        	if(kind!=1 && kind !=2 && kind!=3) {
        		System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
        		continue;
        	}else {
        		break;
        	}
    	}
        System.out.println("이름: ");
        String name = sc.nextLine();

        Farm f = kind==1 ? new Fruit("과일", name) :	 kind==2 ? new Vegetable("채소", name) : new Nut("견과", name);
        boolean result = fc.removeKind(f);
        if (result) {
        	System.out.println("농산물 삭제에 성공하였습니다");
        }else {
        	System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
        	return;
        }
    }

    public void changeAmount() {
     	int kind =0;
    	while(true) {
        System.out.println("추가할 종류 (1. 과일 / 2. 채소 / 3. 견과): ");
        kind = sc.nextInt();
        sc.nextLine();
        	if(kind!=1 && kind !=2 && kind!=3) {
        		System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
        		continue;
        	}else {
        		break;
        	}
    	}
        System.out.println("이름: ");
        String name = sc.nextLine();
        System.out.println("수량: ");
        int amount = sc.nextInt();
        sc.nextLine();

        Farm f = kind==1 ? new Fruit("과일", name) :	 kind==2 ? new Vegetable("채소", name) : new Nut("견과", name);
        boolean result = fc.changeAmount(f, amount);
        if (result) {
        	System.out.println("농산물 수량이 수정되었습니다.");
        }else {
        	System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
        	return;
        }
    }

    public void printFarm() {
    	HashMap<Farm, Integer> hm = fc.printFarm();
    	for(Farm f: hm.keySet()) {
    		 String name = "";
    		if (f instanceof Fruit) {
                name = ((Fruit) f).getName();
            } else if (f instanceof Vegetable) {
                name = ((Vegetable) f).getName();
            } else if (f instanceof Nut) {
                name = ((Nut) f).getName();
            }
    		System.out.println("종류 : "+f.getKind()+"이름("+ hm.get(f) + "개) : "+name);
    	}
    }

    public void buyFarm() {
    	int kind =0;
    	while(true) {
        System.out.println("추가할 종류 (1. 과일 / 2. 채소 / 3. 견과): ");
        kind = sc.nextInt();
        sc.nextLine();
        	if(kind!=1 && kind !=2 && kind!=3) {
        		System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
        		continue;
        	}else {
        		break;
        	}
    	}
        System.out.println("이름: ");
        String name = sc.nextLine();

        Farm f = kind==1 ? new Fruit("과일", name) :	 kind==2 ? new Vegetable("채소", name) : new Nut("견과", name);
        boolean result = fc.buyFarm(f);
        if (result) {
        	System.out.println("구매에 성공하였습니다.");
        }else {
        	System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.");
        	return;
        }
    }

    public void removeFarm() {
    	int kind =0;
    	while(true) {
        System.out.println("추가할 종류 (1. 과일 / 2. 채소 / 3. 견과): ");
        kind = sc.nextInt();
        sc.nextLine();
        	if(kind!=1 && kind !=2 && kind!=3) {
        		System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
        		continue;
        	}else {
        		break;
        	}
    	}
        System.out.println("이름: ");
        String name = sc.nextLine();

        Farm f = kind==1 ? new Fruit("과일", name) :	 kind==2 ? new Vegetable("채소", name) : new Nut("견과", name);
        boolean result = fc.removeFarm(f);
        if (result) {
        	System.out.println("구매 취소에 성공하였습니다");
        }else {
        	System.out.println("구매 목록에 존재하지 않습니다. 다시 입력해주세요.");
        	return;
        }
    }

    public void printBuyFarm() {
    	ArrayList<Farm> farmList = fc.printBuyFarm();
    	Iterator<Farm> farmIt = farmList.iterator();
    	while(farmIt.hasNext()) {
    		System.out.println(farmIt.next());
    	}
    }
}
