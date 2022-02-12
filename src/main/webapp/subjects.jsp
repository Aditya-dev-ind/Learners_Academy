<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" />
<title>Subjects | Learners's Academy</title>

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
			
				<h3>Master List Of Subjects</h3>
				<p>Here is the master list of all the subjects.</p>
		
			<table border=1>
				<thead>
					<tr>
						<th>S.No</th>
						<th>Subject Name</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${subjects}" var="sub">
						<tr>
							<th>${sub.subjectId}</th>
							<td>${sub.name}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>
