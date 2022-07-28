package PUSL2024G77Admin;

				
import PUSL2024G77Admin.UserAdminDAO;
import PUSL2024G77Admin.UserBean;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet {


public void doGet(HttpServletRequest request, HttpServletResponse response) 
			           throws ServletException, java.io.IOException {

try
{	    

     UserBean userAk = new UserBean();
     userAk.setUserName(request.getParameter("un"));
     userAk.setPassword(request.getParameter("pw"));

     userAk = UserAdminDAO.login(userAk);
	   		    
     if (userAk.isValid())
     {
	        
          HttpSession session = request.getSession(true);	    
          session.setAttribute("currentSessionUser",userAk); 
          response.sendRedirect("UserServlet");      		
     }
	        
     else 
          response.sendRedirect("UserServlet");
} 
		
		
catch (Throwable theException) 	    
{
     System.out.println(theException); 
}
       }
	}
