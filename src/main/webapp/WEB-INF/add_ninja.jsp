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
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<title>Insert title here</title>
</head>
	<body>
	<div style="margin-left: 400px" class="container">
		<a href="/dojos"> Add Dojo</a>
		<h1>New Ninja</h1>
		
			<div>
		<form:form action="/ninjas/new" method="post" modelAttribute="ninjaObj">
				<div class="form-group-row">
					<form:label path="dojo">Select Dojo:</form:label>
					<form:select path="dojo">
				<c:forEach var="oneDojo" items="${allDojos}">
						<form:option value="${oneDojo}">
							<c:out value="${oneDojo.name}"/>
						</form:option>
					</c:forEach> 
					</form:select>
					</div>
				<div class="form-group-row">
					<form:label path="firstName">First Name:</form:label>
					<form:input type="text" path="firstName"/>
				</div>
				<div class="form-group-row">
					<form:label path="lastName">Last name:</form:label>
					<form:input type="text" path="lastName"/>
				</div>
				<div class="form-group-row">
					<form:label path="age">Age:</form:label>
					<form:input type="text" path="age"/>
				</div>
					<button class="btn btn-success">Create</button>
				</form:form>
				</div>
			</div>	
	</body>
</html>