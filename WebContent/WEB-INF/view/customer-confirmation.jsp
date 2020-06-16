<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head><title>Customer Confirmation</title></head>
	<body>
	Registration Confirmed!<br><br>
	
	Customer Name: ${Customer.firstName} ${Customer.lastName} <br>
	Free Passes: ${Customer.freePasses} <br>
	Postal Code: ${Customer.postalCode}<br>
	Course Code: ${Customer.courseCode}
	</body>
</html>