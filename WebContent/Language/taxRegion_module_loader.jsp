<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String ss = String.valueOf(session.getAttribute(userLang));
%>
<% if(ss.equalsIgnoreCase("Krio")){ %>
    <%@ include file = "/Language/Krio/TaxRegion/taxRegion/taxRegion_kri.jsp" %>
<%} %>
<% if(ss.equalsIgnoreCase("English")){ %>
    <%@ include file = "/Language/English/TaxRegion/taxRegion/taxRegion_eng.jsp" %>
<%} %>
<% if(ss.equalsIgnoreCase("French")){ %>
    <%@ include file = "/Language/French/TaxRegion/taxRegion/taxRegion_fr.jsp" %>
<%} %>