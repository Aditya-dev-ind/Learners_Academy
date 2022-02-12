<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" />
<title>Teachers | Learners's Academy</title>


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
			
				<h3>Master List Of Teachers</h3>
				<p>Here you have the master list of all the Teachers with
					respective Subjects with pagination support. Click on the teacher
					to find more details.</p>
			
			<table border=1>
				<thead>
					<tr>
						<th>S.No</th>
						<th>Teacher Name</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${teachers}" var="teacher">
						<tr>
							<th>${teacher.teacherId }</th>
							<td><a href="teacher?teacherId=${teacher.teacherId }">${teacher.name }</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</div>

</body>
</html>
