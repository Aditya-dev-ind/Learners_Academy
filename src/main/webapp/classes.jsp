<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" />
<title>Classes | Learners's Academy</title>
<style>
a, a:hover {
	text-decoration: none;
}

div {
	margin-left: 50px;
}
</style>
</head>

<body>
	<div>
		<jsp:include page="includes/header.jsp" />
		<div>
				<h3>Master List Of Classes</h3>
				<p>You can click on any class to view detailed report of the
					class.</p>
				<table border=1>
					<thead>
						<tr>
							<th >S.No</th>
							<th >Class Name</th>
							<th >No.of Seats</th>
							<th>Total Strength</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${classes}" var="cls">
							<tr>
								<th >${cls.classId }</th>
								<td><a href="report?classId=${cls.classId }">${cls.name }</a>
								</td>
								<td>${cls.seats }</td>
								<td>${cls.strength }</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<br />
			</div>
</body>
</html>
