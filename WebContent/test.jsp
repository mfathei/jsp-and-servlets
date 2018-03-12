<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello Jsp</h1>

	<%!public int add(int x, int y) {

		return x + y;
	}%>

	<%
		int i = 1;
		int j = 2;
		int k;

		k = i + j;
		out.write("The value of k is : " + k);
	%>
	<br> The value of k is :
	<%=k%>

	<%
		k = add(2164, 7816);
	%>

	<br> The value of k is :
	<%=k%>

</body>
</html>