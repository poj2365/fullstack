package com.arr.controller;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class ArrayController {

	private static final Scanner sc = new Scanner(System.in);

	public void arrayTest() {

		// 기본 배열 활용하기
		// 배열은 저장고간을 생성해서 사용 -> 할당
		// 선형 구조로 저장순서가있고, 각 저장소는 번호로 구분함(인덱스번호)

		// 배열을 저장하는 변수를 선언
		// 자료형[] 변수명;
		int[] numbers;
		// numbers =10; 참조형 타입
		// 배열 변수에는 타입에 맞는 배열을 생성해서 대입 -> 할당
		numbers = new int[3];
		// int a,b,c,d,e,f .....;

		// 생성된 배열에 접근하기
		// 배열 변수명[인덱스];
		System.out.println("0 : " + numbers[0]);
		System.out.println("1 : " + numbers[1]);
		System.out.println(numbers);

		// 배열 저장소에 값 저장하기
		numbers[0] = 100;
		numbers[1] = 90;

		System.out.println("0 : " + numbers[0]);
		System.out.println("1 : " + numbers[1]);
		System.out.println(numbers);

		// 선언된 배열 변수의 타입과 할당한 배열의 타입은 일치해야 한다.
		// double[] height = new int[10]; -> 불가능
		double[] height = new double[5];
		String[] strArr = new String[5];
		char[] alpha = new char[5];

		// 자료형별 기본값
		// 정수형(byte,short,int,long) : 0
		// 실수형(float, double) : 0.0
		// 문자(char) : ''
		// 문자열(String) : null
		System.out.println("double : " + height[0]);
		System.out.println("char : " + alpha[0]);
		System.out.println("String : " + strArr[0]);

		// 친구들 3명을 저장할 수 있는 변수를 선언한고 각 저장소에 이름을 저장 후 출력하기
		String[] names = new String[3];
		System.out.print("친구들 이름 : ");
		names[0] = sc.nextLine();
		System.out.print("친구들 이름 : ");
		names[1] = sc.nextLine();
		System.out.print("친구들 이름 : ");
		names[2] = sc.nextLine();
		System.out.println("친구들 이름 : " + names[0] + names[1] + names[2]);

		// 반복문과 배열 같이 사용하기
		System.out.println("반복문으로 배열 접근하기");
		for (int i = 0; i < 3; i++) {
			System.out.println(names[i]);
		}
		// for문을 이용해서 names에 사용자가 입력한 이름을 저장하기
		for (int i = 0; i < names.length; i++) {
			System.out.print(i + 1 + "번째 이름 : ");
			names[i] = sc.nextLine();
		}
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]);
		}

		// 배열의 길이(저장소 갯수)를 알려주는 변수
		// 배열명.length -> 변수(필드)에 값을 출력
		// 문자열.length() -> 기능 호출(메소드)
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		// 숫자를 5개 저장하는 배열을 만들고 1~5까지 수를 저장 후 출력하기
		// 저장/호출 반복문은 따로 작성할 것,
		System.out.println("----------------------------------");
		int[] intArr = new int[5];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = i + 1;
		}
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(i + 1 + "번째 숫자 : " + intArr[i]);
		}

	}

	// 데이터 필터 -> 원하는 값을 조회할때, 수정할때
	// 수 10개를 저장하는 저장공간을 확보하고
	// 10개의 저장소에 랜덤으로 1~100까지 수를 저장
	// 저장된 값 중에서 50보다 큰 수가 몇개인지 출력
	public void arrTest() {
		int cnt = 0;
		int[] intArr = new int[10];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = (int) (Math.random() * 100) + 1;
			System.out.println(intArr[i]);
			if (intArr[i] > 50) {
				cnt++;
			}
		}
		System.out.println("50보다 큰 수의 갯수 : " + cnt);

		System.out.println(Arrays.stream(intArr).filter(n -> n > 50).count());

	}

	public void arrayTest2() {
		// 배열과 동시에 초기화하기
		// 자료형[] 변수명={리터럴, 리터럴, ...};
		// 자료형[] 변수명= new 자료형[]{리터럴, 리터럴, ...};

		// 가,나,다로 초기화된 배열 선언하기
		char[] arrChar = { '가', '나', '다' };
		for (int i = 0; i < arrChar.length; i++) {
			System.out.println(arrChar[i]);
		}
		double[] height = new double[] { 180.5, 190.2, 177.3, 164.2, 155.3 };
		for (int i = 0; i < height.length; i++) {
			System.out.println(height[i] + " ");
		}
		System.out.println();

//		arrChar = {'a','b','c'};
		arrChar = new char[] { 'a', 'b', 'c' };

		// 배열은 한번 선언된 길이를 변경할 수 없다.
//		arrChar[3]='d'; 
		String[] studentName = { "김경주", "박서영", "박세웅", "박지송", "양지혁", "염휘건", "오상진", "윤우식", "이난희", "이예찬", "임희석", "장명수",
				"한창규", "황민익" };
		// 저장된 학생 중 박씨 성을 가진 학생을 조회하기
		// 박씨 성을 가진 학생의 이름, 인원 수를 출력하기
		// 사용자가 찾는 성씨의 학생 구하기
		int cnt = 0;
		String resultName = "";
		System.out.print("성을 입력해주세요 : ");
		String msg = sc.next();
		for (int i = 0; i < studentName.length; i++) {
			if (studentName[i].charAt(0) == '박') {
				resultName += studentName[i];
				cnt++;
			}
			if (studentName[i].charAt(0) == msg.charAt(0)) {
				System.out.println("사용자가 찾는 성씨의 학생 : " + studentName[i]);
			}
		}
		System.out.println("박씨 성을 가진 학생 이름 : " + resultName);
		System.out.println("박씨 성을 가진 학생의 인원 수 : " + cnt);

		// height에 저장된 값 중 최대값과 최소값 구하기
		double resultMax = height[0];
		double resultMin = height[0];
		for (int i = 1; i < height.length; i++) {

			if (resultMax < height[i]) {
				resultMax = height[i];
			}
			if (resultMin > height[i]) {
				resultMin = height[i];
			}

		}
		System.out.println("최대값 : " + resultMax);
		System.out.println("최소값 : " + resultMin);

		// 배열 선형 구조 -> 순서가 있음
		// 정렬 : 데이터의 크기에 따라 오름차순, 내림차순으로 순서를 변경하는 것
		for (int i = 0; i < height.length; i++) {
			System.out.println(height[i]);
			for (int j = 0; j < height.length; j++) {
				if (height[i] < height[j]) {
					double temp = height[i];
					height[i] = height[j];
					height[j] = temp;
				}
			}
		}
		System.out.println("오름차순으로 정렬 후 출력하기");
		System.out.println(Arrays.toString(height));

		int[] testArr = { 4, 3, 6, 2, 7, 5, 1 };
		Arrays.sort(testArr);
		System.out.println(Arrays.toString(testArr));

//		Collection.sort(testArr,(pre,next))->pre-next);

	}

	public void arrayCopy() {
		// 배열 복사
		// 얕은 복사 : 주소값을 공유
		// 깊은 복사 : 사본으로 생성
		int[] num = { 1, 2, 3, 4, 5 };
		int[] copyNum = num;
		System.out.println(num);
		System.out.println(copyNum);
		num[0] = 100;
		System.out.println(copyNum[0]);

		// 깊은 복사
		int[] deepCopyNum = new int[num.length + 5];
		for (int i = 0; i < num.length; i++) {
			deepCopyNum[i] = num[i];
		}
		num[1] = 200;
		System.out.println("num: " + Arrays.toString(num));
		System.out.println("copyNum : " + Arrays.toString(copyNum));
		System.out.println("deepCopyNum: " + Arrays.toString(deepCopyNum));

		// 깊은 복사 기능 이용하기(메소드)
		// System.arrayCopy(1,2,3,4,5);
		// 1 : 원본배열 변수명
		// 2 : 원본배열 시작 인덱스 번호
		// 3 : 사본배열 변수명
		// 4 : 사본배열의 시작 인덱스 번호
		// 5 : 복사할 데이터 수
		String[] names = { "유병승", "양지혁", "김경주", "한창규" };
		String[] copyName = new String[7];
		System.arraycopy(names, 2, copyName, 3, 2);
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(copyName));

		System.arraycopy(names, 0, copyName, 0, names.length);
		System.out.println(Arrays.toString(copyName));

		// clone() -> 완전 동일한 배열 사본이 생성
		String[] methodCopy = names.clone();
		System.out.println(Arrays.toString(methodCopy));
	}

	public void doubleArray() {
		// 2차원 배열
		// 배열 저장소가 두개 연결되어 있는구조
		int[][] intArr;
		intArr = new int[3][3];
		System.out.println(intArr);
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[0][0]);
		System.out.println(intArr[0][1]);
		System.out.println(intArr[0][2]);
		System.out.println(intArr[1][0]);
		System.out.println(intArr[1][1]);
		System.out.println(intArr[1][2]);

		for (int i = 0; i < intArr.length; i++) {
			for (int j = 0; j < intArr[i].length; j++) {
				System.out.print(intArr[i][j] + " ");
			}
			System.out.println();
		}

		// 값 대입하기
		intArr[0][0] = 200;
		intArr[1][1] = 200;
//		intArr[2] = 300;
		intArr[2] = new int[5];

		for (int i = 0; i < intArr.length; i++) {
			for (int j = 0; j < intArr[i].length; j++) {
				System.out.print(intArr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("----------------");
		// 5*5 int형 배열을 생성하고
		// 12345
		// 12345
		// 12345
		// 12345
		// 12345
		int[][] intArray = new int[5][5];
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				intArray[i][j] = j + 1;
				System.out.print(intArray[i][j] + " ");
			}
			System.out.println();
		}

		// 1 2 3 4
		// 5 6 7 8
		// 9 10 11 12
		intArray = new int[3][4];
		int count = 1;
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				intArray[i][j] = count++;
				System.out.print(intArray[i][j] + " ");
			}
			System.out.println();
		}

		// 선언과 동시에 초기화
		String[][] strArr = { { "가", "나", "다" }, { "라", "마", "바" } };
		strArr[0] = new String[] { "사랑해", "알러뷰", "쥬뗌므" };
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				System.out.println(strArr[i][j] + " ");
			}
			System.out.println();
		}

		String[][] studentPosition = { { "김경주", "한창규" }, { "양지혁", "박서영" }, { "오상진", "장명수" }, { "박세웅", "황민익" },
				{ "윤우식", "이예찬" }, { "염휘건", "임희석" }, { "박지송", "이난희" } };

		System.out.println("==============================================");
		// 1. 양지혁님의 저장 위치와 짝궁의 이름을 출력하기
		// 출력 : 양지혁님은 0번째 행, 0번째 열에 있습니다. 짝궁은 박서영님입니다.
		// 2. 찾을 사람을 입력받아 처리하기, 입력 받은 이름이 없으면 없는 사람 입니다. 출력
		search: for (int i = 0; i < studentPosition.length; i++) {
			for (int j = 0; j < studentPosition[i].length; j++) {
				if (studentPosition[i][j] == "양지혁") {
					System.out.println(
							"양지혁님은 " + i + "번째 행, " + j + "번째 열에 있습니다. 짝궁은 " + studentPosition[i][j + 1] + "님 입니다.");
					break search;
				}
				System.out.println(studentPosition[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("==============================================");
		// 2. 찾을 사람을 입력받아 처리하기, 입력 받은 이름이 없으면 없는 사람 입니다. 출력
		boolean flag = false;
		System.out.print("찾을 사람을 입력해주세요 : ");
		String inputMsg = sc.next();
		for (int i = 0; i < studentPosition.length; i++) {
			for (int j = 0; j < studentPosition[i].length; j++) {
				if (studentPosition[i][j].equals(inputMsg)) {
					flag = true;
					System.out.println(inputMsg + "님은 " + i + "번째 행, " + j + "번째 열에 있습니다. 짝궁은 "
							+ studentPosition[i][(j + 1) % 2] + "님 입니다.");
//					if (j==0) {
//						System.out.println(inputMsg + "님은 " + i + "번째 행, " + j + "번째 열에 있습니다. 짝궁은 "
//								+ studentPosition[i][j + 1] + "님 입니다.");
//					} else {
//						System.out.println(inputMsg + "님은 " + i + "번째 행, " + j + "번째 열에 있습니다. 짝궁은 "
//								+ studentPosition[i][j - 1] + "님 입니다.");
//					}
				}
			}
		}
		if (!flag) {
			System.out.println("없는 사람입니다.");
		}
		System.out.println();
	}

	public void extraTest() {
		// 배열 데이터 탐색 방법
		// foreach구문 이용하기
		// for(변수선언 : 배열명(List,Set)){ 로직 }
		int[] intArr = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		System.out.println();

		for (int n : intArr) {
			System.out.print(n + " ");
		}

		// 배열의 값을 변경하기
		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] >= 4) {
				intArr[i] *= 100;
			}
		}
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}

		System.out.println();
		for (int n : intArr) {
			n *= 100;
		}
		for (int n : intArr) {
			System.out.print(n + " ");
		}
		System.out.println();
		// foreach 문은 원본 값 변경 불가능
		// for 문을 돌리고 그 안에 변수를 만들어서 복사해서 넣음
		// 2차원 배열에 사용하기
		char[][] chArr = { { '가', '나', '다', '라' }, { 'a', 'b', 'c', 'd' } };
		for (char[] arr : chArr) {
			for (char c : arr) {
				System.out.print(c);
			}
			System.out.println();
		}

		// 정수 5개를 저장할 수 있는 배열에 1~10까지의 랜덤값을 저장
		// 조건 : 중복값 없이 저장
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			int randomNum = (int) (Math.random() * 10) + 1;
			for (int j = 0; j < a.length; j++) {
				if (a[i]==randomNum) {
					randomNum = (int) (Math.random() * 10) + 1;
					continue;
				}
			}
			a[i] = (int) (Math.random() * 10) + 1;
			System.out.println(a[i]);
		}

	}

}
