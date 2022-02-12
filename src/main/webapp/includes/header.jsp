<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- Toast Begins -->


<html>
<head>
<style>
.navigation-menu ul {
	padding: 0px;
	margin: 0px;
}

ul {
	padding: 0;
	overflow: hidden;
	background-color: skyblue;
	margin: 10px 370px 20px 0px;
}

li {
	float: left;
}

li a {
	display: inline-block;
	color: black;
	text-align: center;
	padding: 10px 20px;
	text-decoration: none;
}

li a:hover {
	background-color: slateblue;
}

#navigation ul {
	font-size: 1.4em;
}

#navigation ul li {
	display: inline;
	color: white;
}

#navigation li:not (:first-child ):before {
	content: " | ";
}
div {
	margin-left: 150px;
}
</style>
</head>
<body>
	<div>
		
			<strong><h2><a href="home">Learner's Academy</a></h2></strong>
		
	</div>

	<% String user = (String) session.getAttribute("user"); %>
	<div>
		<h5></h5>
		<ul>
			<li><a href="classes">Classes</a></li>
			<li><a href="subjects">Subjects</a></li>
			<li><a href="teachers">Teachers</a></li>
			<li><a href="students">Students</a></li>
			<!-- <li><a href="report">Class Report</a></li> -->

			<% if(user == null || user.equals("")) {%>
			<button><a href="login">Login</a></button>
			<%}else { %>
			<div>
				<button>
					<%=user %>
				</button>
				<button>
					<a href="logout">Logout</a>
				</button>

			</div>
		</ul>
		<%} %>
	</div>
</body>
</html>
