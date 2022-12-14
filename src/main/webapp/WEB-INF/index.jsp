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
	<div style="margin-left: 600px;">
		<h1>New Dojo</h1>
		<form:form action="/dojos" method="post" modelAttribute="dojo">
			<div class="form-group row">
				<form:errors path="location" class="errors"></form:errors>
				<form:label path="location">Location:</form:label>
				<form:input type="text" path="location"/>
			</div>
			<button class="btn btn-success">Create</button>
				
		</form:form>
	</div>
					
	

</body>
</html>