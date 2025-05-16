<%@page import="java.util.List"%>
<%@page import="com.web.notice.model.dto.Notice"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/header.jsp"%>
<%
	List<Notice> notices = (List<Notice>)request.getAttribute("notices");
%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
 <style>
    section#notice-container{width:600px; margin:0 auto; text-align:center;}
    section#notice-container h2{margin:10px 0;}
    table#tbl-notice{width:100%; margin:0 auto; border:1px solid black; border-collapse:collapse;}
    table#tbl-notice th, table#tbl-notice td {border:1px solid; padding: 5px 0; text-align:center;} 
    </style>
<section id="notice-container">
        <h2>공지사항</h2>
        <table id="tbl-notice">
            <tr>
            
                <th>번호</th>
                <th>제목</th>
                <th>작성자</th>
                <th>첨부파일</th>
                <th>작성일</th>
            </tr>
            <% if(!notices.isEmpty()){ 
            	for(Notice n : notices){
            %>
            	<tr>
            		<td><%=n.getNoticeNo() %></td>
            		<td><%=n.getNoticeTitle() %></td>
            		<td><%=n.getNoticeWriter() %></td>
            		<td><%if(n.getFilepath()!=null){ %>
            			<img src="<%=request.getContextPath()%>/resources/images/file.png" width="20">
            		<%}else{ %>
						<span>첨부파일 없음</span>        		
            		<%} %>
            		</td>
            		<td><%=n.getNoticeDate() %></td>
            	</tr>	
            <%} 
            	}else{ %>
            	<tr>
            		<td colspan="5">조회된 데이터가 없습니다.</td>
            	</tr>
            <% } %>
        </table>
        <div id="pageBar">
        	<%=request.getAttribute("pageBar") %>
        </div>
    </section>
<%@ include file="/WEB-INF/views/common/footer.jsp"%>