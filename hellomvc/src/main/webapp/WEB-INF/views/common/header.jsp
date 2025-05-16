<%@page import="com.web.model.dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%
	Member m = (Member)session.getAttribute("result"); 
	Cookie[] cookies= request.getCookies();
	String saveId =null;
	for(Cookie c : cookies){
		if(c.getName().equals("saveId")){
		saveId=c.getValue();
		break;
		}
	}
%>

<head>
<meta charset="UTF-8">
<title>나의 첫 프로젝트</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/style.css">
<script src="<%=request.getContextPath()%>/resources/js/jquery-3.7.1.min.js"></script>
</head>
<body>
	<div id="header">
		<header>
			<h1>HelloMVC</h1>
			<div class="login-container">
					<%
					if(m==null){
					%>
				<form action="<%=request.getContextPath() %>/member/login.do" method="post">
					<table>
						<tr>
							<td>
								<input type="text" name="userId" id="userId"
								placeholder="아이디입력" value="<%=saveId!=null?saveId:"" %>"
								>
							</td>
							<td></td>
						</tr>
						<tr>
							<td>
								<input type="password" name="password" id="passwod"
								placeholder="패스워드입력">
							</td>
							<td>
								<input type="submit" value="로그인" >
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<input type="checkbox" name="saveId" 
								id="saveId" <%=saveId!=null?"checked":"" %>>
								<label for="saveId">아이디저장</label>
								<input type="button" value="회원가입"
								onclick="enroll()">
							</td>
						</tr>
						<%}else{ %>
						<table>
							<tr>
								<td colspan="2">
									<h4><%=m.getUserName()%>님 환영합니다.</h4>
								</td>
							</tr>
							<tr>
								<td>
								<input type="button" value="내정보보기" onclick="myinfo()">
								</td>
							</tr>
							<tr>
								<td>
								<input type="button" value="로그아웃" onclick="logout()">
								</td>
							</tr>
						</table>
							<%}%>
					</table>
				</form>
			</div>
			<nav>
				<ul class="main-nav">
					<li class="home">
						<a href="">Home</a>
					</li>
					<li id="notice">
						<a href="<%=request.getContextPath()%>/notice/noticelist.do">공지사항</a>
					</li>
					<li>
						<a href="">게시판</a>
					</li>
				</ul>
			</nav>
		</header>
	</div>
<script>
 const enroll = ()=>{
	 location.assign("<%=request.getContextPath()%>/member/enrollmember.do");
 }
 const logout = ()=>{
	 location.assign("<%=request.getContextPath()%>/member/logout.do");
 }
 const myinfo=()=>{
	 location.assign("<%=request.getContextPath()%>/member/memberinfo.do");
 }

</script>





