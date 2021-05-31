<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
		
<%@ include file="/Language/languageLoader.jsp" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Dove General Page</title>

		<!-- minified bootstrap css -->
		<link rel="stylesheet" href="./Assets/bootstrap/css/bootstrap.css">
		<link rel="stylesheet" href="./Assets/bootstrap/css/bootstrap.min.css">

		<!-- font awesome css -->
		<link rel="stylesheet" href="./Assets/fontawesome/css/all.css">
		<link rel="stylesheet" href="./Assets/fontawesome/css/all.min.css">

		<!-- jquery script -->
		<script src="daniel.min.js?version=0.0.0"></script>

		<!-- bootstrap js files -->
		<script src="./Assets/bootstrap/js/bootstrap.js"></script>
		<script src="./Assets/bootstrap/js/bootstrap.min.js"></script>

		<!-- custom js files -->
		<script src="test.js?version=0.0.0"></script>
	</head>
	<body>
		
		<!-- first row with logo, search box, notifications, user profile and language. This header is common to all pages -->
		<div class="d-flex justify-content-between align-items-baseline p-4">

			<!-- logo and page title -->
			<div class="">
				<div class="d-flex">
					<!-- menu icon -->
					<div class="pl-3 pr-2">
						<i class="fas fa-bars"></i>
					</div>
	
					<!-- company logo -->
					<div class="pl-2 pr-2">
						<h5 style="color: rgba(7, 124, 202, 0.993);">
							<i class="fas fa-dove"></i>
							 <strong>Dove Payroll</strong>
							 <span>|</span>
						</h5>
					</div>
	
					<!-- page title -->
					<div class="pl-2 pr-3">
						<h5>Dove Payroll All</h5>
					</div>
				</div>
			</div>

			<!-- search box notification userprofile and language -->
			<div class="">
				<div class="d-flex justify-content-end align-items-baseline">

					<!-- the search box -->
					<div class="pr-4">
						<div class="input-group">
							<div class="input-group-prepend">
								<span class="input-group-text">
									<i class="fas fa-search"></i>
								</span>
							</div>
							<input type="text" name="dove_search" id="dove_search" class="form-control">
						</div>
					</div>
	
					<!-- the notification icon -->
					<div class="pr-4">
						<i class="fas fa-bell"></i>
					</div>
	
					<!-- the user profile dropdown -->
					<div class="pr-4">
						<div class="dropdown">
							<img src="./Images/dannie.jpg" alt="user_image" class="rounded-circle" style="width: 30px; height: 35px;">
							<a href="#dropdown-menu" class="dropdown-toggle" data-toggle="dropdown"></a>
							<div class="dropdown-menu">
								<a href="#" class="dropdown-item">Profile</a>
								<a href="#" class="dropdown-item">Logout</a>
							</div>
						</div>
					</div>
	
					<!-- the language selector -->
					<div>
						<select onchange="changeLanguage()" name="langSelector" id="langSelector" class="form-control">
							<option value=""></option>
							<option value="English">English</option>
							<option value="French">French</option>
							<option value="Krio">Krio</option>
						</select>
					</div>
				</div>
			</div>
			
		</div>

		<div class="container-fluid">
			<div class="row mt-2">
				<div class="col-sm-7"></div>
				<div class="col-sm-5">
					
				</div>
			</div>
			<div class="row">
				<div class="col-12">
					<h3><% out.print(labels.get("main_heading")); %></h3>
				</div>
			</div>
			<div class="row">
				<div class="col-12">
					<h4>
						<i class="fas fa-user"></i>
						<% out.print(labels.get("sub_heading")); %>
					</h4>
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