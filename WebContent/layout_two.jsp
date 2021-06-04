<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
		
<%@ include file="/Language/languageLoader.jsp" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Layout two</title>

    <!-- jquery script -->
    <script src="daniel.min.js?version=0.0.0"></script>

    <!-- minified bootstrap css -->
    <link rel="stylesheet" href="./Assets/bootstrap/css/bootstrap.min.css">

    <!-- font awesome css -->
    <link rel="stylesheet" href="./Assets/fontawesome/css/all.css">
    <link rel="stylesheet" href="./Assets/fontawesome/css/all.min.css">

    <!-- custom css -->
    <link rel="stylesheet" href="./Assets/Dove-CSS/common_pages.css?version=0.1.0">

    <!-- bootstrap js files -->
    <script src="./Assets/bootstrap/js/bootstrap.min.js"></script>

    <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>



    <!-- custom js files -->
    <script src="test.js?version=0.0.0"></script>

</head>
<body>

    <!-- top heading -->
    <div class="d-flex justify-content-between layer2top pt-2 pl-3">

        <!-- company logo and sidebar controller -->
        <div>
            <div class="d-flex justify-content-between">

                <!-- logo -->
                <div class="mr-4">
                    <h5 class="dove-page2-heading">
                        <i class="fas fa-dove"></i>
                         <strong>Dove Payroll</strong>
                    </h5>
                </div>
    
                <!-- sidebar controller -->
                <div>
                    <a href="#" class="header-link-style">
                        <i class="fas fa-bars"></i>
                    </a>
                </div>
                
            </div>
        </div>
        

        <!-- language, notifications and user-profile -->
        <div>

            <div class="d-flex">

                <!-- language -->
                <div class="dropdown mr-3">
                    <span class="dropdown-toggle header-sublink-style" data-target="#languageList" data-toggle="dropdown">
                        <i class="fas fa-globe-africa"></i>
                        English
                    </span>
                    <div class="dropdown-menu" id="languageList">
                        <a href="#" class="dropdown-item">English</a>
                        <a href="#" class="dropdown-item">French</a>
                    </div>
                </div>

                <!--user profile -->
                <div class="dropdown mr-3">
                    <span href="#" class="dropdown-toggle" data-target="#profileMenu" data-toggle="dropdown">
                        <i class="far fa-user"></i>
                    </span>
                    <div class="dropdown-menu" id="profileMenu">
                        <a href="#" class="dropdown-item">Profile</a>
                        <a href="#" class="dropdown-item">Logout</a>
                    </div>
                </div>

                <!-- notifications -->
                <div class="mr-4">
                    <i class="fas fa-bell" title="notifications"></i>
                </div>

            </div>
        </div>

    </div>

    <!-- icons and main content -->
    <div class="d-flex">

        <!-- icons -->
        <div class="pl-2 pr-2" id="dove-side-menu1">
            <div>
                <div class="d-flex flex-column icon-menus">
                    <div>
                        <i class="fas fa-home"></i>
                    </div>
                    <div>
                        <i class="fas fa-building"></i>
                    </div>
                    <div>
                        <i class="fas fa-user-friends"></i>
                    </div>
                    <div>
                        <i class="fas fa-money-bill-wave-alt"></i>
                    </div>
                </div>
            </div>

        </div>

        <!-- menu texts -->
        <div class="pl-2 pr-5 shadow-sm" id="dove-side-menu2">
            <div>
                <div class="d-flex flex-column menu-texts">
                    <div>
                        DASHBOARD
                    </div>
                    <div>
                        COMPANY
                    </div>
                    <div>
                        EMPLOYEES
                    </div>
                    <div>
                        SALARIES
                    </div>
                </div>

            </div>
        </div>
                 
        <!-- main content -->
        <div>
            <div class="d-flex flex-column">
                
                 <!-- breadcrumbs and controlbuttons -->
                 <div>
                    <div class="d-flex justify-content-between align-items-baseline p-2">
                        <!-- breadcrumbs-->
                        <div>
                            <span class="dove-breadcrumbs">
                                <a href="#">Home</a>
                                <a href="#">Employees</a>
                                <a href="#">Employee Profiles</a>
                            </span>
                        </div>

                        <!-- control buttons -->
                        <div>
                            <button type="button" class="btn btn-outline-info btn-sm">
                                <i class="fas fa-save"></i>
                                <span class="saveBtn">Save</span>
                            </button>
                            <button type="button" class="btn btn-outline-danger btn-sm">
                                <i class="fas fa-ban"></i>
                                <span class="saveBtn">Clear</span>
                            </button>
                            <button type="button" class="btn btn-outline-primary btn-sm">
                                <i class="fas fa-arrow-left"></i>
                                <span class="saveBtn">back</span>
                            </button>
                        </div>
                    </div>

                 </div>
                 
                 <!-- other content -->
                 <div class="flex-grow-1 p-3" style="background-color: whitesmoke;">
                    <div class="d-flex flex-column">
                        <!-- column content 1-->
                        <div class="p-2 mb-1">
                            <div class="card dove-card">
                                <div class="card-header dove-card-header">
                                    <span class="dove-header2"><% out.print(labels.get("main_heading")); %></span>
                                </div>

                                <div class="card-body dove-card-body">
                                    <p><% out.print(labels.get("sub_heading")); %></p>
                                    <p>
                                        Lorem ipsum, dolor sit amet consectetur adipisicing elit. Aliquam excepturi repellat, consequuntur ipsum nemo odio laborum nobis tempore unde fuga, ullam, sunt praesentium! Quis eum, saepe sed eveniet soluta minus.
                                    </p>
                                </div>
                            </div>
                            
                        </div>

                        <!-- column content 2-->
                        <div class="p-2 mb-1">
                            <div class="card dove-card">
                                <div class="card-header dove-card-header">
                                    <span class="dove-header2"><% out.print(labels.get("main_heading")); %></span>
                                </div>

                                <div class="card-body dove-card-body">
                                    <p><% out.print(labels.get("sub_heading")); %></p>
                                    <p>
                                        Lorem ipsum, dolor sit amet consectetur adipisicing elit. Aliquam excepturi repellat, consequuntur ipsum nemo odio laborum nobis tempore unde fuga, ullam, sunt praesentium! Quis eum, saepe sed eveniet soluta minus.
                                    </p>
                                </div>
                            </div>
                            
                        </div>
                    </div>
                    
                 </div>

            </div>

        </div>
            

     </div>

        
    </div>

    
    
</body>
</html>