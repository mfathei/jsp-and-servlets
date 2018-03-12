<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
	String name = null;
	ServletContext context = null;
	public void jspInit(){
		name = getServletConfig().getInitParameter("defaultUser");
		context = getServletContext();
		context.setAttribute("test", "Hello");
	}

%>
<br>
The default user name is : <%= name %>
<br>
The default user name in context is : <%= context.getAttribute("test") %>
</body>
</html>