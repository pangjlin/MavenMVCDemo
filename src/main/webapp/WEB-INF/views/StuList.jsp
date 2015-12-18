<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生成绩</title>
</head>
<body>
	<h2>所有学生的成绩</h2>
    <table border="1">
        <tr>
            <th>序号</th>
            <th>姓名</th>
            <th>成绩</th>
        </tr>
        <c:forEach items="${students}" var="stu">
            <tr>
                <td>${stu.id}</td>
                <td>${stu.name}</td>
                <td>${stu.score}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>