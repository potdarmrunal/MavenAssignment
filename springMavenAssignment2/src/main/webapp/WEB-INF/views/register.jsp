<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<style>
<
style>.error {
	color: red
}
</style>
</style>
</head>
<body>
	<h2>Register User</h2>
	<div class="container row">
		<div class="col-sm-4"></div>
		<div class="col-sm-8">
			<form:form method="GET" modelAttribute="userss" action="validateuser">
  			 Username: <form:input path="username" />
				<br />
				<br />
				<form:errors path="username" cssClass="error" />
				<br />
   			 Password: <form:input path="password" />
				<br />
				<br />
				<form:errors path="password" cssClass="error" />
				<br />
  			 Email   :    <form:input path="email" />
				<br />
				<br />
				<form:errors path="email" cssClass="error" />
				<br />
   			Contact   :  <form:input path="phone" />
				<br />
				<br />
    		City    :   <form:input path="city" />
				<br />
				<br />
				<input type="submit" value="Submit">
			</form:form>
		</div>
	</div>


	<%--  	<form action="validateuser" method="get" modelAttribute="userss">
		<div class="form-group">
			<input class="form-control" placeholder="Name" name="username">
		</div>
		<div class="form-group">
			<input type="email" class="form-control" placeholder="Email"
				name="email">
		</div>
		<div class="form-group">
			<input type="password" class="form-control" placeholder="Password"
				name="password">
		</div>
		<div class="form-group">
			<input type="number" class="form-control" placeholder="Contact"
				maxlength="10" size="10" name="phone">
		</div>
		<div class="form-group">
			<input type="text" class="form-control" placeholder="City"
				name="city">
		</div>

		<button type="submit" name="submit" class="btn btn-primary">Register</button>
	</form>  --%>
</body>
</html>
