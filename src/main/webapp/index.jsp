<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" />
<title>Learners's Academy</title>


<style>
a, a:hover {
	text-decoration: none;
}

div {
	margin-left: 350px;
}


 span:after {
  width: 100px;
  height: 1px;
  display: block;
  content: "";
  position: relative;
  margin-top: 5px;
 
  background-color: #b80000;
}

</style>
</head>
<body>
	<jsp:include page="includes/header.jsp" />
	<div >
		<h3>Welcome To Learner's Academy</h3>
		<p>An online management tool to view and manage Classes, Subjects
			and Teachers.</p>
		<h3>Master List of Classes</h3>
		<span ><a href="classes">View Classes</a></span>
		<h3>Master List of Subjects</h3>
		<span ><a href="subjects">View Subjects</a></span>
		<h3>Master List of Teachers</h3>
		<span ><a href="teachers">View Teachers</a></span>
		<h3>Student Report</h3>
		<span ><a href="students">View Students Report</a></span>
		<!-- <h3>Class Report</h3>
		<a href="classes">View Class Report</a> -->
	</div>
	
	<br/>
	<jsp:include page="includes/footer.jsp" />

</body>
</html>
