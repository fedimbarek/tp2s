<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String t= request.getParameter("t1"); %>
<% String s = request.getParameter("r"); %>
<% String st = request.getParameter("r1"); %>
html
<% int sc = 0;
		String m;
		if (s.equals("faibles")&& sc < 3) {
			m = "Vous êtes un débutant";
		} else if (s.equals("moyennes")&& sc < 5) {
			m = " html Vous avez un niveau moyen";
		} else {
			m = "html Vous êtes un expert !";
		}
		out.println("<p>" +" "+t+" "+ m + "</p>");
	%>programme
	<% 
		if (st.equals("ab")&& sc < 3) {
			m = "Vous êtes un débutant";
		} else if (st.equals("moyennes")&& sc < 5) {
			m = "prog Vous avez un niveau moyen";
		} else {
			m = " Vous êtes un expert !";
		}
		out.println("<p>" +" "+t+" "+ m + "</p>");
	%>
</body>
</html>