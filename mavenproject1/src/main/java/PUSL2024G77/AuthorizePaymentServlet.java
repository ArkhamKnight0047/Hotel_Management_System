package PUSL2024G77;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import static java.lang.Integer.parseInt;
import java.util.List;
 
@WebServlet("/authorize_payment") 
public class AuthorizePaymentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String productTyp = request.getParameter("roomType");
        List<DBdetail> roomList = DBselect.fetchAllEmployeesInfo(productTyp);
        List<DBdetail> room=roomList.subList(0,1);
        StringBuilder strbul=new StringBuilder();
        for(DBdetail str : room)
        {
            strbul.append(str);
            strbul.append(",");
        }
        String str=strbul.toString();
        
        String[] SplitS = str.split(",");
       
        String product = SplitS[1];
        String subtotal = SplitS[2];
        String tax = SplitS[3];
        String shipping="0";
        String total = String.valueOf(parseInt(subtotal)+parseInt(tax)+parseInt(shipping));
         
        OrderDetail orderDetail = new OrderDetail(product,subtotal,shipping, tax, total);
 
        try {
            PaymentServices paymentServices = new PaymentServices();
            String approvalLink = paymentServices.authorizePayment(orderDetail);
            response.sendRedirect(approvalLink);
             
        } catch (Exception ex) {
            request.setAttribute("errorMessage", ex.getMessage());
            ex.printStackTrace();
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
 
}
