<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 조회 결과</title>
</head>
<body>
	<h3>
		전체 회원 수 :
		<c:out value="${count }" />
	</h3>
	<h4>아이디 값으로 회원 조회하기</h4>
	<form action="${pageContext.request.contextPath }/searchmember.do"
		method="get">
		아이디 <input type="text" name="userId"><br> <input
			type="submit" value="회원조회">
	</form>
	<c:if test="${member!=null }">
		<c:out value="${member }"></c:out>
	</c:if>

	<form
		action="${pageContext.request.contextPath }/searchmemberbyname.do"
		method="get">
		아이디 <input type="text" name="userName"><br> <input
			type="submit" value="회원이름조회">
	</form>
	<button onclick="searchMemberAll();">DTO없이 데이터 가져오기 -> Map이용</button>
	<button onclick="searchMemberAllPage();">페이징 처리하기</button>

	<div id="member-container">
		<table>
			<tr>
				<th>아이디</th>
				<th>비밀번호</th>
				<th>이름</th>
				<th>성별</th>
				<th>나이</th>
				<th>이메일</th>
				<th>휴대폰번호</th>
				<th>주소</th>
				<th>취미</th>
				<th>가입일</th>
			</tr>
			<c:if test="${not empty memberList }">

				<c:forEach var="member" items="${memberList}">
					<tr>
						<td><c:out value="${member.userId}" /></td>
						<td><c:out value="${member.password}" /></td>
						<td><c:out value="${member.userName}" /></td>
						<td><c:out value="${member.gender}" /></td>
						<td><c:out value="${member.age}" /></td>
						<td><c:out value="${member.email}" /></td>
						<td><c:out value="${member.phone}" /></td>
						<td><c:out value="${member.address}" /></td>
						<td><c:out value="${member.hobby}" /></td>
						<td><c:out value="${member.enrollDate}" /></td>
					</tr>
				</c:forEach>
			</c:if>
		</table>
		<c:if test="${memberList.isEmpty() }">
		조회된 회원이 없습니다.
	</c:if>
	</div>

	<div>
		<table>
			<tr>
				<th>아이디</th>
				<th>비밀번호</th>
				<th>이름</th>
				<th>성별</th>
				<th>나이</th>
				<th>이메일</th>
				<th>휴대폰번호</th>
				<th>주소</th>
				<th>취미</th>
				<th>가입일</th>
			</tr>
			<c:choose>
				<c:when test="${not empty memberMap}">
					<c:forEach var="members" items="${memberMap}">
						<tr>
							<td><c:out value="${members.MEMBER_ID}" /></td>
							<td><c:out value="${members.MEMBER_PWD}" /></td>
							<td><c:out value="${members.MEMBER_NAME}" /></td>
							<td><c:out value="${members.GENDER}" /></td>
							<td><c:out value="${members.AGE}" /></td>
							<td><c:out value="${members.EMAIL}" /></td>
							<td><c:out value="${members.PHONE}" /></td>
							<td><c:out value="${members.ADDRESS}" /></td>
							<td><c:out value="${members.HOBBY}" /></td>
							<td><c:out value="${members.ENROLL_DATE}" /></td>
						</tr>
					</c:forEach>
				</c:when>
				<c:otherwise>
					<td colspan="9">조회된 회원이 없습니다.</td>
				</c:otherwise>
			</c:choose>
		</table>
	</div>

	<script>
	const searchMemberAll=()=>{
		location.assign("${pageContext.request.contextPath}/searchmemberall.do");
	}
	
	const searchMemberAllPage=()=>{
		location.assign("${pageContext.request.contextPath}/searchmemberallpage.do");
	}
	</script>
</body>
</html>