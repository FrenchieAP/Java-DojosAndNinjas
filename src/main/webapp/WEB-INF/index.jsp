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
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<body>
	<div style="margin-left: 600px;">
		<h1>All Ninjas</h1>
			<table class="table" style=" width: 700px; color: white; background: linear-gradient(90deg, rgba(131,58,180,1) 0%, rgba(253,29,29,1) 50%, rgba(252,176,69,1) 100%); display: flex; flex-direction: column; justify-content: space-evenly; border:2px solid grey; border-radius: 25px;">
			<thead>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Age</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="oneNinja" items="${allNinjas}">
					<tr>
						<td><c:out value="${oneNinja.firstName}" /></td>
						<td><c:out value="${oneNinja.lastName}" /></td>
						<td style="margin-left: 50px" ><c:out value="${oneNinja.age}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
					
	

</body>
</html>