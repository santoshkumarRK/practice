<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<spring:url value="/resources/css/bootstrap.min.css" var="bootstapCss" />
<spring:url value="resources/js/bootstrap.min.js" var="bootstapCssJS" />
<spring:url value="resources/js/jquery.min.js" var="jqueryJS" />
<script src="${jqueryJS}"></script> 
<script src="${bootstapCssJS}"></script> 
<link href="${bootstapCss}" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>home</title>
</head>
<body>
<div id="main" class="container"   style=" margin:20px;">
   <div class="navbar navbar-inverse" style="margin:20px;">
   
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Message Portal</a>
      <a href="#" class="navbar-brand pull-right"><strong>Logout</strong></a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="home">Home</a></li>
    </ul>
  </div>
</div>
    
  <div class="table-responsive"  style=" margin:20px;">
    <table class="table table-hover">
      <tr class="thead-inverse">
       	<th>Id </th>
       	<th>Summary </th>
       	<th>Description </th> 
       	<th>Action</th>
    </tr>
    
    <c:forEach var="message" items="${messageList}">
    <c:set var="rowId" scope="request" value="0"/>
    <tr>
    	<td>${message.id}</td>
        <td>${message.summary}</td>
        <td>${message.description}</td>
        <td> <button class = "btn btn-primary"> View </button> 
        <button class = "btn btn-danger navbar-btn"> Delete </button> 
       <a href="message/edit?${rowId}"> <button class = "btn btn-warning navbar-btn">Edit</button> </a>        
    </tr>
    <c:set var="rowId" scope="request" value="${rowId+1}"/>
    </c:forEach>   
    </table>
  </div>
  </div>
</body>
</html>