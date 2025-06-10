<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>DB접속 테스트</h2>
	<h4>
		<a href="${pageContext.request.contextPath }/dbconnect.do">
		DB접속
		</a>
	</h4>
	<h2>회원등록하기</h2>
	<h4>
		<a href="${pageContext.request.contextPath }/insertmember.do">
			회원등록
		</a>
	</h4>
	<h2>파라터값 처리하기</h2>
	<h4>
		<a href="${pageContext.request.contextPath }/insertmemberparam.do?userId=user88">
			회원등록
		</a>
	</h4>
	<h2>아이디와 패스워드를 입력받아 회원저장하기</h2>
	<form action="${pageContext.request.contextPath }/insertmemberparam2.do" method="post">
		<input type="text" name="userId" ><br>
		<input type="password" name="password" ><br>
		<input type="submit" value="회원저장">
	</form>
	<h2>전체 데이터 입력 받아 회원저장하기</h2>
	<form action="${pageContext.request.contextPath }/insertmemberall.do" method="post">
		아이디 <input type="text" name="userId" ><br>
		패스워드 <input type="password" name="password" ><br>
		이름 <input type="text" name="userName" ><br>
		나이 <input type="text" name="age" ><br>
		성별
		<input type="radio" name="gender" value="M">남
		<input type="radio" name="gender" value="F">여
		<br>
		이메일 <input type="email" name="email" ><br>
		전화번호 <input type="text" name="phone" ><br>
		주소 <input type="text" name="address" ><br>
		취미
		<input type="checkbox" name="hobby" value="운동">운동
		<input type="checkbox" name="hobby" value="코딩">코딩
		<input type="checkbox" name="hobby" value="등산">등산
		<input type="checkbox" name="hobby" value="독서">독서
		<br>
		<input type="submit" value="회원저장">
	</form>
	<!-- 회원 삭제 및 수정 구현하기  -->
	<h3>DB에 저장된 데이터 가져오기 - select 문 실행</h3>
	<p>
		select 문 실행 -> resultSet 가져옴 -> DTO 객체에 맵핑(저장)
		-> mybatis가 설정에 다라 알아서 처리해줌
	</p> 
	<h4>저장된 회원 수 조회하기</h4>
	<h4>
		<a href="${pageContext.request.contextPath }/searchcount.do" >저장된 회원 수 조회</a>
	</h4>
	
</body>
</html>











