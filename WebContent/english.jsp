<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.*, com.dovePayroll.languages.*" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<%!
		// Language english = new Language();
		HashMap<String, String> labels = new HashMap<String, String>();
		
		String name = "Bockarie Daniel Marah"; 
		String address = "140 British Road, Kossoh Town, New London";
	%>
	<%
		labels.put("main_heading", "Main Page Heading");
		labels.put("sub_heading", "welcome to my new page. You can do anything you want and get away with it on this site");
		labels.put("footer_heading", "Main footer Heading");
	%>
</body>
</html>