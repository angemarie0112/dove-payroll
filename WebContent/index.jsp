<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "com.dovePayroll.languages.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Home Page</title>
		<script src="test.js"></script>
		<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
	</head>
	<body>
	
		<%!
			Language eng = new Language();
			String location = "";
		%>
		<%
			eng.setLanguageName("English");
			eng.setModuleName("TaxRegion");
			eng.setClassName("paye");
			
			location = eng.fetchFileLocation();
		%>
		
		<div id="pageInclues"><%@ include file = "english.jsp" %></div>
		<div class="w3-container w3-cyan">
			<h3><% out.print(labels.get("main_heading")); %></h3>
		</div>
		<div class="w3-container w3-pale-blue">
			<h4><% out.print(labels.get("sub_heading")); %></h4>
			<p>
				<% out.print(name); %> <br /> 
				<% out.print(address); %> <br /> 
			</p>
			<p>
				The location of the language file is: <% out.print(location); %>
			</p>
		</div>
		<div class="w3-container w3-teal">
			<h3><% out.print(labels.get("footer_heading")); %></h3>
		</div>
		
		
	</body>
</html>