<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head><title>Customer Registration Form</title>
	<style type="text/css">
		.error{color:red;}
	</style>
	</head>
	<body>
	Fill the form.Arterisk(*) are required!<br><br>
	<form:form action="processForm" modelAttribute="Customer">
		FirstName: <form:input path="firstName"/>
		
		<br><br>
		
		LastName(*): <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"></form:errors>
		<br><br>
		
		Free Passes: <form:input path="freePasses"/>
		<form:errors path="freePasses" cssClass="error"></form:errors>
		<br><br>
		
		Postal Code:: <form:input path="postalCode"/>
		<form:errors path="postalCode" cssClass="error"></form:errors>
		<br><br>
		
		Course Code:: <form:input path="courseCode"/>
		<form:errors path="courseCode" cssClass="error"></form:errors>
		<br><br>
		
		<input type="submit" value="Submit"/>
	</form:form>
	</body>
</html>