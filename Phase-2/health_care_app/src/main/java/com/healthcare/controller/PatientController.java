package com.healthcare.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.healthcare.entity.Patient;
import com.healthcare.service.PatientService;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class PatientController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public PatientController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PatientService ps = new PatientService();
		List<Patient> listOfPatient = ps.findAllPatient();
		
		HttpSession hs = request.getSession();
		hs.setAttribute("patient", listOfPatient);
		
		response.sendRedirect("displayPatient.jsp");
		response.setContentType("text/html");
	
		//pw.println("<table>");

		//pw.println("</table>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();				// object created. 

		// created service class object. 
		PatientService ps = new PatientService();
		
		// receive the value from form 
		
		String operation = request.getParameter("operation");
		
		if(operation.equals("add")) {
		String Name = request.getParameter("Name");
		String Email = request.getParameter("Email");
		int Phone = Integer.parseInt(request.getParameter("Phone"));
		int Age = Integer.parseInt(request.getParameter("Age"));
		String Diagnosis = request.getParameter("Diagnosis");
		String Remark = request.getParameter("Remark");
		String Gender=request.getParameter("Gender");
		
		// convert those value to objects. 
		
		Patient p = new Patient();
		p.setName(Name);
		p.setEmail(Email);
		p.setPhone(Phone);
		p.setAge(Age);
		p.setDiagnosis(Diagnosis);
		p.setRemark(Remark);
		p.setGender(Gender);
		
		

		String result = ps.storePatient(p);
		pw.print(result);
		RequestDispatcher rd = request.getRequestDispatcher("addPatients.jsp");
		rd.include(request, response);
		
		}else if(operation.equals("delete")) {
			int Name = Integer.parseInt(request.getParameter("Name"));
			String result = ps.deletePatient(Name);
			pw.println(result);
			RequestDispatcher rd = request.getRequestDispatcher("deletePatient.jsp");
			rd.include(request, response);
		}
		else if(operation.equals("update")) {
			int Name = Integer.parseInt(request.getParameter("Name"));
			String result = ps.deletePatient(Name);
			pw.println(result);
			RequestDispatcher rd = request.getRequestDispatcher("addvitals.jsp");
			rd.include(request, response);
		}
		
		
		response.setContentType("text/html");
	}

	
}
