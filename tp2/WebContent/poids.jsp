<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% double t= Double.parseDouble(request.getParameter("t1")); %>
<% String s = request.getParameter("r"); %>
<% double p=0; %>
<%if(s.equals("Homme")){
	p= 62.1 * t - 44.7;
	
}else{
	p= 72.7 * t - 58;
	
} %>
<%= String.format("%.2f", p) %> Kg 

</body>
</html>