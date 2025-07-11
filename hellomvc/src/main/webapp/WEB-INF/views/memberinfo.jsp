<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/header.jsp"%>
<%
 String hobbyList = Arrays.toString(m.getHobby()); 
%>
<section id=enroll-container>
       <h2>회원 정보</h2>
       <table>
		<tr>
			<th>아이디</th>
			<td>
				<input type="text" placeholder="4글자이상" name="userId" id="userId_" readonly value="<%=m.getUserId()%>">
			</td>
		</tr>
		<tr>
			<th>패스워드</th>
			<td>
				<input type="password" name="password" id="password_" readonly value="<%=m.getPassword()%>"><br>
			</td>
		</tr>  
		<tr>
			<th>이름</th>
			<td>	
			<input type="text"  name="userName" id="userName" readonly value="<%=m.getUserName()%>"><br>
			</td>
		</tr>
		<tr>
			<th>나이</th>
			<td>	
			<input type="number" name="age" id="age" readonly value="<%=m.getAge()%>"><br>
			</td>
		</tr> 
		<tr>
			<th>이메일</th>
			<td>	
				<input type="email" placeholder="abc@xyz.com" name="email" id="email" readonly value="<%=m.getEmail()%>"><br>
			</td>
		</tr>
		<tr>
			<th>휴대폰</th>
			<td>	
				<input type="tel" placeholder="(-없이)01012345678" name="phone" id="phone" maxlength="11" readonly value="<%=m.getPhone()%>"><br>
			</td>
		</tr>
		<tr>
			<th>주소</th>
			<td>	
				<input type="text" placeholder="상세주소" name="address" id="address" readonly value="<%=m.getAddress()%>"><br>
			</td>
		</tr>
		<tr>
			<th>성별 </th>
			<td>
				<input type="radio" name="gender" id="gender0" value="M" onclick="return false" <%= m.getGender().equals("M") ? "checked" : "" %>>
				<label for="gender0">남</label>
				<input type="radio" name="gender" id="gender1" value="F" onclick="return false" <%= m.getGender().equals("F") ? "checked" : "" %>>
				<label for="gender1">여</label>
			</td>
		</tr>
		<tr>
			<th>취미 </th>
			<td>
				<input type="checkbox" name="hobby" id="hobby0" value="운동" onclick="return false" <%= hobbyList.contains("운동") ? "checked" : "" %>><label for="hobby0">운동</label>
				<input type="checkbox" name="hobby" id="hobby1" value="등산" onclick="return false" <%= hobbyList.contains("등산") ? "checked" : "" %>><label for="hobby1">등산</label>
				<input type="checkbox" name="hobby" id="hobby2" value="독서" onclick="return false" <%= hobbyList.contains("독서") ? "checked" : "" %>><label for="hobby2">독서</label><br />
				<input type="checkbox" name="hobby" id="hobby3" value="게임" onclick="return false" <%= hobbyList.contains("게임") ? "checked" : "" %>><label for="hobby3">게임</label>
				<input type="checkbox" name="hobby" id="hobby4" value="여행" onclick="return false" <%= hobbyList.contains("여행") ? "checked" : "" %>><label for="hobby4">여행</label><br />
			</td>
		</tr>
	</table>
	<input type="submit" value="수정">
	<input type="button" value="비밀번호수정">+
	<input type="reset" value="취소">
  </form>
</section>
<%@ include file="/WEB-INF/views/common/footer.jsp"%>