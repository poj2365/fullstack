package com.bs.controller.Main;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.bs.model.dto.Trader.Trader;
import com.bs.model.dto.Transaction.Transaction;
import com.bs.model.dto.TransactionDao.TransactionDao;

public class Main {
	public static void main(String[] args) {
		List<Transaction> transList = new TransactionDao().getList();

		// 1. 2022년 일어난 모든 트렌젝션을 값이 높은순으로 정렬하여 출력하기
		System.out.println("1. 2022년 일어난 모든 트렌젝션을 값이 높은순으로 정렬하여 출력하기");
		transList.stream()
				.filter(t -> t.getYear() == 2022)
				.sorted((o1, o2) -> o2.getValue() - o1.getValue())
				.forEach(System.out::println);
		// 2. 거래자가 근무하는 모든 도시를 중복없이 나열하기
		System.out.println("2. 거래자가 근무하는 모든 도시를 중복없이 나열하기");
		Set<String> cities = transList.stream()
			    .map(t -> t.getTrader().getCity())
			    .collect(Collectors.toSet());
		cities.forEach(System.out::println);
		// 3. 서울에서 근무하는 사람을 모두 찾아서 이름순으로 정렬하기
		System.out.println("3. 서울에서 근무하는 사람을 모두 찾아서 이름순으로 정렬하기");
		transList.stream()
		.filter(t->t.getTrader().getCity().contains("서울"))
		.sorted((o1, o2) -> o1.getTrader().getName().compareTo(o2.getTrader().getName()))
		.forEach(System.out::println);
		// 4. 제주의 거래자가있는지 확인하기
		System.out.println("4. 제주의 거래자가있는지 확인하기");
		if(transList.stream().anyMatch(t -> t.getTrader().getCity().equals("제주"))){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		// 5. 대전에서 근무하는 거래자의 모든 거래값을 출력하기
		System.out.println("5. 대전에서 근무하는 거래자의 모든 거래값을 출력하기");
		transList.stream()
		.filter(t->t.getTrader().getCity().contains("대전"))
		.forEach(System.out::println);
		// 6. 모든 거래자를 이름순으로 정렬하여 출력하기
		System.out.println("6. 모든 거래자를 이름순으로 정렬하여 출력하기");
		transList.stream()
		.sorted((o1, o2) -> o1.getTrader().getName().compareTo(o2.getTrader().getName()))
		.forEach(System.out::println);
		// 7. 전체거래의 최대값을 출력하기
		System.out.println("7. 전체거래의 최대값을 출력하기");
		IntSummaryStatistics iss = transList.stream()
				.collect(Collectors.summarizingInt(Transaction::getValue));
		System.out.println(iss.getMax());
		// 8. 전체거래의 최소값을 출력하기
		System.out.println("8. 전체거래의 최소값을 출력하기");
		System.out.println(iss.getMin());
		// 9. 년도별 인원으로 분리하여 Map방식으로 출력하기
		Map<Integer, List<Transaction>> map = transList.stream()
				.collect(Collectors.groupingBy(t->t.getYear()));
		map.forEach((t, u) ->{
			System.out.println("년도 : " + t);
			System.out.println("거래 : " + u);
		});
	}
}
