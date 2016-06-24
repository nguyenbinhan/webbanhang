<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   Hello An!
   <P>The ID is ${id}.</P><br/>
   <P>The ID_2 is <%=request.getAttribute("user")%>.</P><br/>
   <P>The PASS is ${pass}.</P>
</body>
</html>