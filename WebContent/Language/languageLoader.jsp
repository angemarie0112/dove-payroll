<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%! 
	String userLang = new String("languageKey");
	String selectedModule = "TaxRegion";
	HashMap<String, String> labels = new HashMap<String, String>();
%>
<%
	String selection = request.getParameter("selectedLang");
	if(selection != null){
		// set the selected language in session
		String userLanguage = new String(selection);
		session.setAttribute(userLang, userLanguage);	
	}else {
		String currSelection = (String)session.getAttribute(userLang);
		session.setAttribute(userLang, currSelection);
	}
%>
 <% if(selectedModule == "TaxRegion"){ %>
 	<%@ include file = "/Language/taxRegion_module_loader.jsp" %>
 <%} %>
 <% if(selectedModule == "Company"){ %>
 	<%@ include file = "/Language/company_module_loader.jsp" %>
 <%} %>