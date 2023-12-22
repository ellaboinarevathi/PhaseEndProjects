<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<h2>Delete Patient</h2>
<form action="PatientController" method="post">
	<input type="hidden" name="operation" value="delete">
<label>Name</label>
<input type="text" name="Name"/><br/>
<input type="submit" value="Delete Patient" class="btn btn-success"/>
</form>
<br/>
</body>
</html>
