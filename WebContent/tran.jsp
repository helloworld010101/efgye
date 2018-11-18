<%@ page language="java" import="beans.Triangle" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>获取</title>
</head>
<body>
	<jsp:useBean id="tri" class="beans.Triangle" scope="page"/>
	
	三角形的三边长分别为
	D1:<jsp:getProperty name="tri" property="d11"><br>
	D2:<jsp:getProperty name="tri" property="d21"><br>
	D3:<jsp:getProperty name="tri" property="d31"><br>
	<%
		if(tri.isTriangle()){
			out.print("三边可以构成三角形");
			out.print("周长为："+tri.getCir());
			out.print("面积为："+tri.getArea());
		}
		else{
			out.print("三边不能构成三角形");
		}
	%>
</body>
</html>