package PUSL2024G77;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
 
import com.paypal.api.payments.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 
@WebServlet("/execute_payment")
public class ExecutePaymentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    public ExecutePaymentServlet() {
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String paymentId = request.getParameter("paymentId");
        String payerId = request.getParameter("PayerID");
 
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pusl2024g77","root","");
            Statement st=conn.createStatement();

            PaymentServices paymentServices = new PaymentServices();
            Payment payment = paymentServices.executePayment(paymentId, payerId);
             
            PayerInfo payerInfo = payment.getPayer().getPayerInfo();
            Transaction transaction = payment.getTransactions().get(0);
             
            request.setAttribute("payer", payerInfo);
            request.setAttribute("transaction", transaction);
            final int i=st.executeUpdate("insert into users(name,email,country)values('"+payerInfo.getFirstName()+" "+payerInfo.getLastName()+"','"+payerInfo.getEmail()+"','"+transaction.getAmount().getDetails().getSubtotal()+" ("+transaction.getDescription()+")')");
            request.getRequestDispatcher("receipt.jsp").forward(request, response);
             
        } catch (Exception ex) {
            request.setAttribute("errorMessage", ex.getMessage());
            ex.printStackTrace();
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
}