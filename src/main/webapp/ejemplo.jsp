<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ejemplo</title>
</head>
<body>
<%
String uno = request.getParameter("fraseuno");
String dos = request.getParameter("frasedos");
//String nUno = uno;
//String nDos = dos;
out.print(uno + dos);
%>
</body>
</html>