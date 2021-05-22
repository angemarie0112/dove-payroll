<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%! 
	String selectedLanguage = "Krio";
	String selectedModule = "TaxRegion";
	HashMap<String, String> labels = new HashMap<String, String>();
%>
 <% if(selectedModule == "TaxRegion"){ %>
 	<%@ include file = "/Language/taxRegion_module_loader.jsp" %>
 <%} %>
 <% if(selectedModule == "Company"){ %>
 	<%@ include file = "/Language/company_module_loader.jsp" %>
 <%} %>