<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! 
	String selectedLanguage = "English";
%>
 <% if(selectedLanguage == "Krio"){ %>
 	<%@ include file = "/Language/Krio/TaxRegion/taxRegion/taxRegion_kri.jsp" %>
 <%} %>
 <% if(selectedLanguage == "English"){ %>
 	<%@ include file = "/Language/English/TaxRegion/taxRegion/taxRegion_eng.jsp" %>
 <%} %>