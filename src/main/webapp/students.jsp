<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" />
<title>Students | Learners's Academy</title>

<style>
a, a:hover {
	text-decoration: none;
}

div {
	margin-left: 150px;
}
</style>
</head>

<body>
	<div>
		<jsp:include page="includes/header.jsp" />
		<div>
			<h3>Master List Of Students</h3>
			<p>Here you have the master list of all the Students with
				respective Class with pagination support.</p>
			<table border=1>
				<thead>
					<tr>
						<th>S.No</th>
						<th>Students Name</th>
						<th>Age</th>
						<th>Gender</th>
						<th>Email ID</th>
						<c:if test="${showClass }">
							<th>Class</th>
						</c:if>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${students}" var="student">
						<tr>
							<th>${student.studentId }</th>
							<td>${student.name }</td>
							<td>${student.age }</td>
							<td>${student.gender }</td>
							<td>${student.emailId }</td>
							<c:if test="${showClass }">
								<td><span>${student.cls.name }</span></td>
							</c:if>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>
