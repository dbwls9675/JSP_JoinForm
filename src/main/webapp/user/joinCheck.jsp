<%@page import="basic.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");
%>

<jsp:useBean id="dto" class="basic.MemberDTO" />
<jsp:setProperty property="*" name="dto" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>joinCheck</title>
</head>
<body>

	<%
		int no = new MemberDAO().insert(dto);
	%>
	<h1>joinCheck</h1>
	<table>
		<tr>
			<td>아이디 :</td>

			<td><jsp:getProperty property="id" name="dto" /></td>
		</tr>
		<tr>
			<td>암호 :</td>
			<td><jsp:getProperty property="pw" name="dto" /></td>
		</tr>
		<tr>
			<td>이름 :</td>
			<td><jsp:getProperty property="name" name="dto" /></td>
		</tr>
		<tr>
			<td>전화번호 :</td>
			<td><jsp:getProperty property="tel" name="dto" /></td>
		</tr>
		<tr>
			<td>성별 :</td>
			<td><jsp:getProperty property="gender" name="dto" /></td>
		</tr>
		<tr>
			<td>나이 :</td>
			<td><jsp:getProperty property="age" name="dto" /></td>
		</tr>
	</table>
</body>
</html>