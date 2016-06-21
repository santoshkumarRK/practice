<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<spring:url value="/resources/css/bootstrap.min.css" var="bootstapCss" />
<spring:url value="/resources/js/bootstrap.min.js" var="bootstapCssJS" />
<spring:url  value="/resources/js/jquery.min.js" var="jqueryJS" />
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
      <li class="active"><a href="<c:out value="${pageContext.request.contextPath}"/>">Home</a></li>
    </ul>
  </div>
  </div>
   <div class="form-container" style=" margin:25px;">
    <h1>Enrollment Form</h1>
    <form:form method="POST" modelAttribute="message" class="form-horizontal" data-toggle="validator" role="form">
    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="Message Summary">Summary</label>
                <div class="col-md-7">
                    <form:input type="text" path="summary" id="summary" pattern=".{10,15}"  title="10 to 15 characters" maxlength="15" placeholder="summary" class="form-control input-sm"  required="required"/>
                    <div class="has-error">
                        <form:errors path="summary" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="Message Summary" >Description</label>
                <div class="col-md-7">
                    <form:input type="text" path="description" id="description" pattern=".{10,25}"  title="10 to 15 characters" placeholder="Description" maxlength="25"   class="form-control input-sm"  required="required"/>
                    <div class="has-error">
                        <form:errors path="description" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-actions">
                <input type="submit" value="Register" class="btn btn-primary btn-sm">
            </div>
        </div>
    </form:form>
   </div>
   </div>
</body>
</html>