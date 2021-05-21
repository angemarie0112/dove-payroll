<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "com.dovePayroll.languages.*" %>
<%!
	Language eng = new Language();
	String location = "";
%>
<%
	eng.setLanguageName("English");
	eng.setModuleName("TaxRegion");
	eng.setClassName("taxRegion_lang");
			
	location = eng.fetchFileLocation();
%>
		
<%@ include file="/Language/languageLoader.jsp" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Home Page</title>
		<script src="test.js"></script>
		<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
	</head>
	<body>
	
		
		
		<div class="w3-container w3-cyan">
			<h3><% out.print(labels.get("main_heading")); %></h3>
		</div>
		<div class="w3-container w3-pale-blue">
			<h4><% out.print(labels.get("sub_heading")); %></h4>
			<p>
				The location of the language file is: <% out.print(location); %>
			</p>
		</div>
		<div class="w3-container w3-teal">
			<h3><% out.print(labels.get("footer_heading")); %></h3>
		</div>
		
		
	</body>
</html>