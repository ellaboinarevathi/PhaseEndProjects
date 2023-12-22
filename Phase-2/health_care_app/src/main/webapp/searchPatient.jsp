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
<h2>Doctor Home Page</h2>
<form action="addPatients.jsp"></form>
	<input type="submit" value="Add Patients" class="btn btn-secondary"><br/></form>
	<form action="Searchpatients" method="post">
	<input type="hidden" name="operation" value="search">
<label>Search Patient</label><br/>
<input type="text" name="Search Patient class="form-control"><br/><br/>

<input type="submit" value="Search" class="btn btn-success"/>
<h2>Patients</h2>
<form action="displayPatient.jsp">
	<input type="submit" value="Display Patients" class="btn btn-secondary"></form><br/>
</body>
</html>