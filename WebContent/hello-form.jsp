<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css" />
<title>Coucou</title>
</head>
<body>
	<form action="simple-hello" method="post">
		<label for="fname">First name:</label>
		<input type="text" id="fname" name="fname">
		<label for="lname">Last name:</label>
		<input type="text" id="lname" name="lname">
		<label for="hour">C'est pour quelle heure pr�vu pour ?</label>
		<input type="text" id="hour" name="hour">
		<input type="submit" value="Submit">
	</form>
</body>
</html>