<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
		
<%@ include file="/Language/languageLoader.jsp" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Home Page</title>
		<script src="daniel.min.js?version=0.0.0"></script>
		<script src="test.js?version=0.0.0"></script>
		<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
	</head>
	<body>
	
		<div>
			<select onchange="changeLanguage()" name="langSelector" id="langSelector">
				<option value=""></option>
				<option value="English">English</option>
				<option value="French">French</option>
				<option value="Krio">Krio</option>
			</select>
		</div>
		
		<div class="w3-container w3-cyan">
			<h3><% out.print(labels.get("main_heading")); %></h3>
		</div>
		<div class="w3-container w3-pale-blue">
			<h4><% out.print(labels.get("sub_heading")); %></h4>
		</div>
		<div class="w3-container w3-teal">
			<h3><% out.print(labels.get("footer_heading")); %></h3>
		</div>
		
		
	</body>
</html>