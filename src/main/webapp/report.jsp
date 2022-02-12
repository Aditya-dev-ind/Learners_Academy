<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" />
<title>Report | Learners's Academy</title>


<style>
a, a:hover {
	text-decoration: none;
}
</style>
</head>

<body>

	<div>

		<jsp:include page="includes/header.jsp" />
		<div>

			<h3>Detailed Report of ${cls.name }</h3>
			<p>You can click on the following links to view the respective
				details.</p>




			<h2 class="mb-0">
				<button
					class="btn btn-link btn-block text-left text-decoration-none"
					type="button" data-toggle="collapse" data-target="#overview"
					aria-expanded="true" aria-controls="overview">Overview</button>
			</h2>


			<h5>Overview of ${cls.name }</h5>
			<strong>This tab shows brief info about the class.</strong>

			<table border=1>
				<tbody>
					<tr>
						<th>Class Id</th>
						<td>${cls.classId }</td>
					</tr>
					<tr>
						<th>Class Name</th>
						<td>${cls.name }</td>
					</tr>
					<tr>
						<th>No.Of Seats</th>
						<td>${cls.seats }</td>
					</tr>
					<tr>
						<th>No.Of Students</th>
						<td>${cls.strength }</td>
					</tr>
					<tr>
						<th>No.Of Teachers</th>
						<td>${cls.teachers.size() }</td>
					</tr>
				</tbody>
			</table>
			<h2>
				<button
					class="btn btn-link btn-block text-left text-decoration-none collapsed"
					type="button" data-toggle="collapse" data-target="#students"
					aria-expanded="false" aria-controls="students">Students</button>
			</h2>

			<h5>List of Students</h5>
			<strong>This tab shows List of all Students belongs to this
				class.</strong>

			<table border=1>
				<thead>
					<tr>
						<th>S.No</th>
						<th>Student Name</th>
						<th>Age</th>
						<th>Gender</th>
						<th>Email ID</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="student" items="${cls.students}">
						<tr>
							<th scope="row">${student.studentId }</th>
							<td>${student.name }</td>
							<td>${student.age }</td>
							<td>${student.gender }</td>
							<td>${student.emailId }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>



			<h2>
				<button type="button" data-toggle="collapse"
					data-target="#subjectsTeachers" aria-expanded="false"
					aria-controls="subjectsTeachers">Subjects & Teachers</button>
			</h2>

			<h5>List of Subjects and respective Teachers</h5>
			<strong>This tab shows List of all Subjects and respective
				Teachers. Click on the Teacher name for more details.</strong>

			<table border=1>
				<thead>
					<tr>
						<th>S.No</th>
						<th>Subject Name</th>
						<th>Teacher Name</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach begin="0" end="${cls.teachers.size() - 1}"
						varStatus="loop">
						<tr>
							<th>${loop.index + 1}</th>
							<td>${cls.subjects[loop.index].name }</td>
							<td><a
								href="teacher?teacherId=${cls.teachers[loop.index].teacherId }">${cls.teachers[loop.index].name }</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>
