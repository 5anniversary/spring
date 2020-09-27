<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <style>
      table {
        width: 100%;
      }
      th, td {
        border: 1px solid #bcbcbc;
      }
    </style>

</head>
<body>
<table>
<tr>
<td>${ student.id }</td>
<td>${ student.studentNumber }</td>
<td>${ student.studentName }</td>
<td>${ student.email }</td>
</tr>
</table>
</body>
</html>
