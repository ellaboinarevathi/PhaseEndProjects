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
<h2>Add Patients</h2>
<form action="PatientController" method="post">
	<input type="hidden" name="operation" value="add">
<label>Name</label>
<input type="text" name="pname"/><br/>
<label>Email</label>
<input type="email" name="Email"/><br/>
<label>Phone</label>
<input type="number" name="Phone"/><br/>
<label>Age</label>
<input type="number" name="Age"/><br/>
<label>Diagnosis</label>
<input type="text" name="Diagnosis"/><br/>
<label>Remarks</label>
<input type="text" name="Remark"/><br/>
<label>Gender</label>
<input type="text" name="Gender"/><br/><br/>

<input type="submit" value="Add Patient" class="btn btn-success"/>
</form>
<br/>
</body>
</html>