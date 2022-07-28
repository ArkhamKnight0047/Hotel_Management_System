/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package PUSL2024G77;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 
@WebServlet("/feedback_servlet")
public class FeedbackServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    public FeedbackServlet() {
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String feeEmail = request.getParameter("feeEmail");
        String feeName = request.getParameter("feeName");
        String feeMsg = request.getParameter("feeMsg");
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pusl2024g77","root","");
            Statement st=conn.createStatement();

            final int t=st.executeUpdate("insert into feedback(feeEmail,feeName,feeMsg)values('"+feeEmail+"','"+feeName+"','"+feeMsg+"')");
            response.sendRedirect("index.html");
        } catch (Exception ex) {
            request.setAttribute("errorMessage", ex.getMessage());
            ex.printStackTrace();
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
}