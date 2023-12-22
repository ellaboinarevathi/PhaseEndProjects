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
<h2>Health Logger</h2>
<form action="PatientController" method="post">
	<input type="hidden" name="operation" value="update">

<label>Select Patient</label>
<input type="text" name="Select Patient" class="form-control"><br/>
<label>BP Low</label>
<input type="number" name="BP Low" class="form-control"><br/>
<label>BP High</label>
<input type="number" name="BP High" class="form-control"><br/>
<label>SPO2</label>
<input type="number" name="SPO2" class="form-control"><br/>

<input type="submit" value="submit" class="btn btn-success"/>


</body>
</html>