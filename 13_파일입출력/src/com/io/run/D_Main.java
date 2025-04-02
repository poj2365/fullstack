package com.io.run;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.io.controller.B_IOStreamController;
import com.io.controller.C_SubStreamController;
import com.io.model.vo.Animal;
import com.io.model.vo.Snack;

public class D_Main {
	public static void main(String[] args) {
		// Files -> nio 패키지 -- 8버전
		// 데이터 입출력 클래스
		// 메소드 호출하면 다 쓸 수 있음
		try {
			String data =Files.readString(Path.of("snack.bs"));
			System.out.println(data);
			List<String> datas = Files.readAllLines(Path.of("snack.bs"));
			datas.forEach(System.out::println);
			
			datas.stream()
			.map(s->s.split(","))
			.map(arr->{
				return new Snack(arr[0], Integer.parseInt(arr[1]),arr[2]);})
			.forEach(System.out::println);
			
//			Files.move(Path.of("myfile"), Path.of("filetest"), StandardCopyOption.ATOMIC_MOVE);
			if(Files.exists(Path.of("myfile"))) {
				System.out.println("있다");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
