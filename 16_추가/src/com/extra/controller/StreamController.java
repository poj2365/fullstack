package com.extra.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import static java.util.stream.Collectors.*;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.extra.common.Gender;
import com.extra.model.dao.StudentDao;
import com.extra.model.vo.Student;

public class StreamController {
	public static void main(String[] args) {
		// Stream API 사용하기
		// Stream 클래스가 제공하는 메소드를 이용해서
		// 저장된 데이터를 관리하는 기능
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
		System.out.println(stream);
		// 배열, List, Set 에 저장된 데이터를 Stream 클래스로 변경해서 이용
		// 배열 : Arrays.stream(배열) -> Stream
		// List / Set : List / Set.stream() -> Stream
		String[] lang = { "Java", "Oracle", "JDBC", "HTML/CSS", "Javascript", "Jquery", "github", "tomcat", "servlet",
				"jsp", "websocket", "EL/JSTL", "mybatis", "springlegacy", "JPA", "springBOOT", "vue", "docker/AWS" };

		Stream<String> stream2 = Arrays.stream(lang);
		List<Student> stu = List.of(new Student("1"), new Student("2"));
		Stream<Student> stream3 = stu.stream();

		// stream이 제공하는 메소드 이용
		List<Student> students = StudentDao.getStudents();
		System.out.println("==== 전체 학생 출력하기 ====");
		students.forEach(System.out::println);

		// stream 을 이용해서 전체학생 출력하기
		// forEach 메소드를 이용
		System.out.println("==== 전체 학생 출력하기 -Stream 이용- ====");
		students.stream().forEach(System.out::println);

		// 전체 학생 중 나이가 20대인 학생 출력하기
		System.out.println("==== 20대 학생 출력하기 ====");
		List<Student> temp = new ArrayList();
		for (Student s : students) {
			if (s.getAge() >= 20 && s.getAge() < 30) {
//				System.out.println(s);
				temp.add(s);
			}
		}
		temp.sort((o1, o2) -> o1.getAge() - o2.getAge());

		// Stream API 이용하기
		// filter(Predicate)메소드 이용
		// boolean test(T t)
		students.stream().filter(s -> s.getAge() >= 20 && s.getAge() < 30)
//		.collect(Collectors.toList());
				.toList();
//		.forEach(System.out::println);
		// Stream API 이용 했으면 collect로 조합을 하든 forEach로 소비를 하든 해야한다.

		// 정렬하는 메소드 이용하기
		System.out.println("==== 나이가 적은 사람부터 정렬 ====");
//		students.sort((o1, o2) -> o1.getAge()-o2.getAge());
		students.stream().filter(s -> s.getAge() >= 20 && s.getAge() < 30).sorted((o1, o2) -> o1.getAge() - o2.getAge())
				.forEach(System.out::println);

		// 키가 180 이상인 학생을 내림차순으로 조회하기
		// 조회한 결과를 출력
		System.out.println("==== 키가 180 이상인 학생을 내림차순으로 조회하기 ====");
		temp = students.stream().filter(s -> s.getHeight() >= 180)
				.sorted((o1, o2) -> (int) Math.ceil(o1.getHeight() - o2.getHeight())).toList();

		temp.forEach(System.out::println);
		System.out.println("==== limit 이용하기 ====");
		// 원하는 수 만큼 조회
		// limit(숫자) 메소드 이용
		students.stream().limit(5).forEach(System.out::println);

		// 나이가 많은 학생 5명 출력하기
		System.out.println("==== 나이가 많은 학생 5명 출력하기 ====");
		temp = students.stream().sorted((o1, o2) -> o2.getAge() - o1.getAge()).limit(5).toList();

		temp.forEach(System.out::println);

		// 데이터의 수를 확인하는 메소드
		// 종합 메소드(맨 끝) count() -> long
		long totalStu = students.stream().count();
		System.out.println(totalStu);

		// 서울 사는 학생 수 구하기
		totalStu = students.stream()
				.filter((s) -> s.getAddress()
						.contains("서울")).count();
		System.out.println(totalStu);

		// 특정 데이터 이전 / 이후 까지의 값만 가져오기
		// takeWhile() : 매개변수 조건에 첫번째 false가 나오기 전까지의 값을 가져온다.
		// dropWhile() : 매개변수 조건에 첫번째 false가 나온 다음 값들을 가져온다.
		Stream<Integer> numbers = Stream.of(10, 20, 30, 40, 50, 60, 70, 80, 90);
		List<Integer> numberResult = numbers.takeWhile(n -> n < 50).toList();
		System.out.println("numberResult 출력");
		numberResult.forEach(System.out::println);
		System.out.println();
		numbers = Stream.of(10, 20, 30, 40, 50, 60, 70, 80, 90);
		numberResult = numbers.dropWhile(n -> n < 50).toList();
		System.out.println("numberResult 출력");
		numberResult.forEach(System.out::println);
		System.out.println();

		// 특정 데이터 건너뛰기
		// skip(int)
		System.out.println("===== 건너뛰기 =====");
		temp = students.stream().skip(90).toList();
		temp.forEach(System.out::println);

		// 특정 데이터가 있는지 확인하는 메소드
		// allMatch(predicate) : 결과를 boolean 형으로 반환
		// -> AND : 전체 데이터의 매개변수의 연산결과가 true 면 true
		// anyMahtch(predicate) : 결과를 boolean 형으로 반환
		// -> OR : 한개라도 매개변수의 연산 결과가 true면 true
		numbers = Stream.of(10, 20, 30, 40, 50, 60, 70, 80, 90);
//		boolean result = numbers.allMatch(n->n<100);
//		System.out.println(result);
		if (numbers.allMatch(n -> n < 100)) {
			System.out.println("모든 수는 100보다 작다");
		}
		numbers = Stream.of(10, 20, 30, 40, 50, 60, 70, 80, 90);
		if (numbers.anyMatch(n -> n == 30)) {
			System.out.println("스트림 데이터에 30이 있네!");
		}
		// findAny() : 특정 데이터를 찾는 메소드
		// 다른 중간 연산이랑 같이 사용
		numbers = Stream.of(10, 20, 30, 40, 50, 60, 70, 80, 90);
		// Optional 클래스를 반환
		// null 값에 대해 예외처리할 수 있는 클래스
		Optional<Integer> resultOp = numbers.filter(t -> t >= 90).findAny();
		System.out.println(resultOp);
		// 기본데이터 가져오기 -> get()
//		int resultInt = resultOp.get();
//		int resultInt = resultOp.orElse(200);
//		int resultInt = resultOp.orElseThrow();
//		System.out.println(resultInt);
		resultOp.ifPresent(System.out::println);

		// 집계 결과를 구하는 메소드
		// 합계, 평균, 갯수 등을 구하는 메소드
		// Collectors 클래스에서 제공함.
		// collect(Collectors.메소드())
		// 학생들의 평균 나이 구하기
		Double avg = students.stream()
				.collect(Collectors.averagingDouble(s -> s.getAge()));
		System.out.println(avg);

		// 학생들의 평균 키 구하기
		Double avgHeight = students.stream()
				.collect(Collectors.averagingDouble(s -> s.getHeight()));
		System.out.println("학생들의 평균 키 \n" + avgHeight);
		
		// 30대 학생들의 평균 나이는?
		Double avgAge = students.stream()
				.filter(s->s.getAge()>=30 && s.getAge()<40)
				.collect(Collectors.averagingInt(Student::getAge));
		// Collectors.* 로 임포트 시  -> Student::getAge 쓸수있음
		System.out.println("30대 학생들의 평균 나이는? : " + avgAge);
		// 여학생의 평균 키는?
		avgHeight = students.stream()
//				.filter(s->s.getGender().getGender().equals("여자"))
				.filter(s->s.getGender()==Gender.F)
				.collect(Collectors.averagingDouble(Student::getHeight));
		System.out.println("여학생의 평균 키는? : " + avgHeight);
		
		// 합계, 평균, 데이터 수를 한번에 가져오기
		//IntSummaryStatistics 클래스
		IntSummaryStatistics iss = students.stream().collect(Collectors.summarizingInt(Student::getAge));
		// getSum(), getAverage(), getCount(), getMax(), getMin()
		System.out.println("합계 : "+iss.getSum());
		System.out.println("평균 : "+iss.getAverage());
		System.out.println("갯수 : "+iss.getCount());
		System.out.println("최고령 : "+iss.getMax());
		System.out.println("어린사람 : "+iss.getMin());
		
		// 그룹별 집계하기
		// 나이대별 그룹
		Map<String,List<Student>> ageStudent = students.stream().
				collect(Collectors
						.groupingBy(s->{
							if(s.getAge()/10==1) return "10대";
							else if(s.getAge()/10==2) return "20대";
							else if(s.getAge()/10==3) return "30대";
							else if(s.getAge()/10==4) return "40대";
							else if(s.getAge()/10==5) return "50대";
							else return "그 외";
						}));
		System.out.println(ageStudent);
		System.out.println(ageStudent.keySet());
		for(Map.Entry<String,List<Student>> all : ageStudent.entrySet()) {
			System.out.println(all.getKey() + " : "+ all.getValue().size());
		}
		
		// 성별로 분류하기
		Map<Gender, List<Student>> genderStudent = students.stream()
				.filter(s->s.getAge()/10==2)
				.collect(Collectors
						.groupingBy(Student::getGender));
		genderStudent.entrySet().forEach(e->{
			System.out.println(e.getKey() + " : "+ e.getValue().size());
		});
		
		// map() : 새로운 형태(타입)의 데이터를 생성해서 활용할때 사용
		List<String> resultStudent = students.stream().map(s ->s.getName()+"님 환영합니다. 이번에 우리 회사에...").toList();
		resultStudent.forEach(System.out::println);
		
		List<Map<String, String>> data =students.stream()
			.map(s->Map.of("name",s.getName(), "address",s.getAddress()))
			.toList();
		data.forEach(System.out::println);
		
		// reduce() : 값을 누적시키거나, 최대값, 최소값 구할 때, 
		// (prev,next)->{return 값}
		Stream<Integer> intStream = Stream.of(1,2,3,4,5,6,7,8,9,10);
//		int total = intStream.reduce((prev,next)->prev+next).orElse(0);
		int total = intStream.reduce(100,(prev,next)->prev+next);
		System.out.println(total);
		intStream = Stream.of(1,2,3,4,5,6,7,8,9,10);
		int max = intStream.reduce((p,n)-> p>n?p:n).orElse(0);
		System.out.println(max);
		
		// 병렬로 stream 이용하기
		students.parallelStream().filter(t -> t.getGender()==Gender.M).toList();
	}
}
