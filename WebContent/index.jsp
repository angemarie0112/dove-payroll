<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
		
<%@ include file="/Language/languageLoader.jsp" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Dove General Page</title>

		<link rel="stylesheet" href="/Assets/bootstrap/css/mdb.min.css">

		<script src="daniel.min.js?version=0.0.0"></script>
		<script src="test.js?version=0.0.0"></script>
		<script src="../../Assets/bootstrap/js/mdb.min.js"></script>
		<script src="../../Assets/bootstrap/js/mdb.min.js.map"></script>
	</head>
	<body>
	
		<div>
			
		</div>

		<div class="container-fluid">
			<div class="row">
				<div class="col-sm-7"></div>
				<div class="col-sm-5">
					<select onchange="changeLanguage()" name="langSelector" id="langSelector" class="form-control">
						<option value=""></option>
						<option value="English">English</option>
						<option value="French">French</option>
						<option value="Krio">Krio</option>
					</select>
				</div>
			</div>
			<div class="row">
				<div class="col-12">
					<h3><% out.print(labels.get("main_heading")); %></h3>
				</div>
			</div>
			<div class="row">
				<div class="col-12">
					<h4><% out.print(labels.get("sub_heading")); %></h4>
				</div>
			</div>
			<div class="row">
				<div class="col-12">
					<h3><% out.print(labels.get("footer_heading")); %></h3>
				</div>
			</div>
		</div>
		
		
	</body>
</html>