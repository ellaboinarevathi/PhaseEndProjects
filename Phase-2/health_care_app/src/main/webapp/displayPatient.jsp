<%@page import="java.util.Iterator"%>
<%@page import="com.healthcare.entity.Patient"%>
<%@page import="java.util.List"%>
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
<table border="1">
	<tr>
		<th>Name</th>
		<th>Age</th>
		<th>Email</th>
		<th>Phone</th>
		<th>Diagnosis</th>
		<th>Remark</th>
		<th>Gender</th>
	</tr>
	<%
		Object obj = session.getAttribute("Patient");
		List<Patient> listOfPatient = (List<Patient>)obj;
		Iterator<Patient> li = listOfPatient.iterator();
		while(li.hasNext()){
			Patient p = li.next();
			%>
			<tr>
				<td><%=p.getName()%> </td>
				<td><%=p.getAge()%> </td>
				<td><%=p.getEmail()%> </td>
				<td><%=p.getPhone()%> </td>
				<td><%=p.getDiagnosis()%> </td>
				<td><%=p.getRemark()%> </td>
				<td><%=p.getGender()%> </td>
				<td>
				<form action="PatientController" method="post">
				<input type="hidden" name="operation" value="delete">
				<input type="hidden" name="Name" value="<%=p.getName()%>"><br/>
				<input type="hidden" name="operation" value="update">
				<input type="hidden" name="Name" value="<%=p.getName()%>"><br/>
				</form>
				<label>Name</label>
				<input type="text" name="Name"/><br/>
				<input type="submit" value="Update Patient" class="btn btn-success"/><br/>
				</form>
				
				<input type="submit" value="Manage Vitals" class="btn btn-success"/>
				<input type="hidden" name="operation" value="Manage Vitals">
				
				</td>
			</tr>
			<%
		}
	%>
</table>
<br/>
</body>
</html>
