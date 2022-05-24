<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JoinForm</title>
</head>
<body>
	<h1>JoinForm</h1>
	<form action="joinCheck.jsp" method="post">
		<table border="1">
			<tr >
				<td style="text-align: center">아이디</td>
				<td><input type="text" name="id"/></td>
			</tr>
			<tr>
				<td style="text-align: center">비밀번호</td>
				<td><input type="text" name="pw"/></td>
			</tr>
			<tr>
				<td style="text-align: center">이름</td>
				<td><input type="text" name="name"/></td>
			</tr>
			<tr>
				<td style="text-align: center">전화번호</td>
				<td>
					<select>
					<option>010</option>
					<option>011</option>
					<option>012</option>
					<option>013</option>
					</select> - 
					<input type="text" name="tel"/> - 
					<input type="text" name="tel"/>
				</td>
			</tr>
			<tr>
				<td style="text-align: center">성별</td>
				<td>
					<input type="radio" name="gender" value="girl">여자
					<input type="radio" name="gender" value="men">남자
				</td>
			</tr>
			<tr>
				<td style="text-align: center">나이</td>
				<td>
					<input type="text" name="age">
				</td>
			</tr>
			<tr>
				<td colspan="2" align="left">
				<input type="submit" value="가입">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>