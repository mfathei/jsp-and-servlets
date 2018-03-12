<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

	String name = request.getParameter("name");
	if (name != null && name != ""){
		session.setAttribute("name", name);
		// application.setAttribute("name", name);// = context in servlets
		pageContext.setAttribute("name", name);
		pageContext.setAttribute("name", name, PageContext.APPLICATION_SCOPE);// can replace the previous two scopes session and application
	}

%>

<br>
The name parameter in url is : <%= name %>
<br>
The name parameter in session is : <%= session.getAttribute("name") %>
<br>
The name parameter in context is : <%= application.getAttribute("name") %>
<br>
The name parameter in pageContext is : <%= pageContext.getAttribute("name") %>

</body>
</html>