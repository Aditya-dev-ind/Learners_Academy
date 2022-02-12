<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" />
<title>Teacher | Learners's Academy</title>
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
			<h3>Details of ${teacher.name }</h3>
			<p>Here you will find complete details of the teacher.</p>


			<table border=1>
				<tbody>
					<tr>
						<th>S.No</th>
						<td>${teacher.teacherId }</td>
					</tr>
					<tr>
						<th>Teacher Name</th>
						<td>${teacher.name }</td>
					</tr>
					<tr>
						<th>Age</th>
						<td>${teacher.age }</td>
					</tr>
					<tr>
						<th>Gender</th>
						<td>${teacher.gender }</td>
					</tr>
					<tr>
						<th>Email ID</th>
						<td>${teacher.emailId }</td>
					</tr>
					<tr>
						<th>Subjects</th>
						<td><c:forEach var="subject" items="${teacher.subjects}">
								<span>${subject.name }</span>
							</c:forEach></td>
					</tr>
					<tr>
						<th>Classes</th>
						<td><c:forEach var="classes" items="${teacher.classes}">
								<span>${classes.name }</span>
							</c:forEach></td>
					</tr>
				</tbody>
			</table>
			
		</div>
</div>
</body>
</html>
