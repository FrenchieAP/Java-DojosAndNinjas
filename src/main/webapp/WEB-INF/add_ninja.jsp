<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
	<div class="container">
		<a href="/dojos"> Dashboard</a>
		<h1>New Ninja</h1>
		
		<form:form action="/ninjas" method="post" modelAttribute="ninja">
			<div class="form-group-row">
				<form:label path="firstName">First Name:</form:label>
				<form:input type="text" path="firstName"/>
			</div>
			<div class="form-group-row">
				<form:label path="lastName">Last name:</form:label>
				<form:input type="text" path="lastName"/>
			</div>
			<div class="form-group-row">
				<form:label path="dojo">Select Dojo:</form:label>
				<form:select path="dojo">
					<form:option value="${dojo}">
						<c:out value="${dojo.name}"/>
					</form:option>
				</form:select>
				</div>
				<button>Create</button>
			</form:form>
			</div>
	</body>
</html>