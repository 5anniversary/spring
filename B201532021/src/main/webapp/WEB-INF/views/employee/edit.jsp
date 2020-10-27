<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:url var="R" value="/" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="${R}common.js"></script>
<link rel="stylesheet" href="${R}common.css">
<style>
form {
	width: 600px;
	margin: auto;
	box-shadow: 0 0 4px lightgray, 2px 2px 4px gray;
	overflow: auto;
}

div.title {
	font-size: 20pt;
	padding: 10px;
	background-color: #eee;
}

table {
	margin: 20px;
}

td {
	min-width: 100;
	padding: 5px;
}

td:nth-child(1) {
	text-align: right;
}

button {
	margin: 5px 0 20px 20px;
}

div.message {
	border-radius: 10px;
	padding: 12px;
	margin: 10px;
	background-color: #ffa;
	border: 1px solid #cc0;
}
</style>
</head>
<body>
	<div class="container">
		<form method="post" modelAttribute="employee">
			<div class="title">직원 등록</div>
			<table>
				<tr>
					<td>사번</td>
					<td><input type="text" name="employeeNo"
						value="${ employee.employeeNo }" /></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="name" value="${ employee.name }" /></td>
				</tr>
				<tr>
					<td>부서</td>
					<td><select name="departmentId">
							<c:forEach var="d" items="${ departments }">
								<option value="${ d.id }"
									${  employee.departmentId == d.id ? "selected" : "" }>${ d.title }
								</option>
							</c:forEach>
					</select></td>
				<tr>
					<td>월급</td>
					<td><input type="text" name="salary" value="${ employee.salary }" /></td>
				</tr>
				<tr>
					<td>성별</td>
					<td><input type="text" name="sex" value="${ employee.sex }" /></td>
				</tr>
			</table>
			<hr/>
			<button type="submit" class="btn">저장</button>
			<c:if test="${ not empty message }">
				<div class="message">${ message }</div>
			</c:if>
			<a href="list" class="btn">목록으로</a>
		</form>
	</div>
</body>
</html>