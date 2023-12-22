<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.healthcare.dao.VitalDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<h2>Vital Alerts</h2>
<h2>Vitals</h2>
<form action="managePatients.jsp">
	<input type="submit" value="Manage Patients" class="btn btn-secondary"></form><br/>
		<a href="ExportVitals"></a>&emsp;
	<input type="submit" value="Export" class="btn btn-secondary"><br/><br/>
	<form action="addvitals.jsp">
	<input type="submit" value="Record New Vital" class="btn btn-secondary"></form><br/><br/>
	<tr>
	 </div><br><br>
        <div class="vital_table">
            <table>
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Phone</th>
                        <th>BP Low</th>
                        <th>BP High</th>
                        <th>SPO2</th>
                        <th>Recorded On</th>
                        <th>Action</th>
                    </tr>
                </thead>
                    <tbody>
                    
                    <%
                        VitalsDao dao = new VitalsDao();
                        java.util.List<Vitals> list = dao.getSpVitals();
	 try{
                        for(Vitals v: list) {
                            %>
                                
                                <td><%=v.getId()%></td>
                                <td><%=v.getSelect_patients()%></td>
                                <td><%=v.getPhno()%></td>
                               <% if (v.getLow_bp() <= 70) { %>
                                 <td style = "color:red; font-weight:bold"><%= v.getLow_bp() %></td>
                                <% } else { %>
                                <td><%= v.getLow_bp() %></td>
                                <% } %>
                                 <% if (v.getHigh_bp()>= 140) { %>
                                 <td style = "color:red; font-weight:bold"><%= v.getLow_bp() %></td>
                                <% } else { %>
                                <td><%= v.getHigh_bp() %></td>
                                <% } %>
                                 <% if (v.getSpo2()<= 89 || v.getSpo2() >=101) { %>
                                 <td style = "color:red; font-weight:bold"><%= v.getLow_bp() %></td>
                                <% } else { %>
                                <td><%= v.getSpo2() %></td>
                                <% } %>
                                <td><%=v.getRecordedon()%></td>
                                
                            <td> <form action="delete_vitals" method="GET">
                            <input type="hidden" name="patientId" value="<%= v.getId() %>">
						       <input type="submit" value="Delete"></form>
                           </td>
                        </tr>
                         <%
                        }
                        }catch(Exception e) {
                            e.printStackTrace();
                        }
                        
                        %>
                        
                       

</body>
</html>