package Export;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExportVitals
 */
@WebServlet("/ExportVitals")
public class ExportVitals extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExportVitals() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/csv");
        response.setHeader("Content-Disposition", "attachment; filename=\"vitals.csv\"");

	// Retrieve the data from the database using Vitals_dao or any other appropriate method
       java.util.List<Vitals> list = dao.getAllVitals();

        // Create a StringBuilder to store the CSV content
        StringBuilder csvData = new StringBuilder();
        
        // Append the header row
        csvData.append("Sr.No,Name,Phone,BP Low,BP High,SPO2,Recorded On\n");

        // Append the data rows
        for (ExportVitals v : list) {
            csvData.append(v.getId()).append(",")
                    .append(v.getSelect_patients()).append(",")
                    .append(v.getPhone()).append(",")
                    .append(v.getLow_bp()).append(",")
                    .append(v.getHigh_bp()).append(",")
                    .append(v.getSpo2()).append(",")
                    .append(v.getRecordedon()).append("\n");
        }

        // Write the CSV content to the response output stream
        PrintWriter writer = response.getWriter();
        writer.write(csvData.toString());
        writer.flush();
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
