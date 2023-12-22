package com.search;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.healthcare.entity.Patient;
import com.healthcare.service.PatientService;
import com.pms.service.ProductService;

/**
 * Servlet implementation class Searchpatient
 */
@WebServlet("/Searchpatient")
public class Searchpatient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Searchpatient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();				// object created. 

		// created service class object. 
		PatientService ps = new PatientService();
		
		// receive the value from form 
		
		String operation = request.getParameter("operation");
		
		if(operation.equals("search")) {
			String Name = request.getParameter("Name");
			String searchresult = ps.searchPatient(Name);
			pw.println(searchresult);
			RequestDispatcher rd;
			rd.include(request, response);
		}
                
                Patient.setName(searchresult.getString("Name"));
                Patient.setEmail(searchresult.getString("Email"));
                Patient.setPhone(searchresult.getString("Phone"));
                Patient.setAge(searchresult.getInt("Age"));
                Patient.setDiagnosis(searchresult.getString("Diagnosis"));
                Patient.setRemarks(searchresult.getString("Remark"));
                Patient.setGender(searchresult.getString("Gender"));

                searchresult.add(Patient);
            }

            request.setAttribute("searchresult", searchResults);
            request.getRequestDispatcher("searchPatient.jsp").forward(request, response);
}
        



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}