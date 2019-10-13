<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="toadd">添加</a>
	<table>
		<tr>
			<td>编号</td>
			<td>商品名称</td>
			<td>价格</td>
			<td>总量</td>
			<td>售出</td>
			<td></td>
		</tr>
		<c:forEach items="${goods }" var="g">
			<tr>
			<td>${g.gid }</td>
			<td>${g.gname }</td>
			<td>${g.price }</td>
			<td>${g.gcount }</td>
			<td>${g.saleCount }</td>
			<td></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>