

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 * @param <RequestDispatcher>
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet<RequestDispatcher> extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
			PrintWriter write = response.getWriter();	
			response.setContentType("text/html");
					String uname,pass,email;
					int uid;
						uname = request.getParameter("uname");
						pass = request.getParameter("pass");
						email = request.getParameter("email");
						String ii = request.getParameter("uid");
						uid = Integer.parseInt(ii);
						
					// DB connection
						
						DBConnection connect = new DBConnection();
						int row_insert = connect.insert(uname, email, pass, uid);
						if(row_insert==1)
						{
							response.sendRedirect("userpage.jsp");
						}
						else
						{
							write.print("can not save the user, please check again");
						request.getRequestDispatcher("registerpage.jsp").include(request, response);
//							RequestDispatcher dispatch = request. getRequestDispatcher("register.jsp");
//							dispatch.include(request, response);
						}
						
						
		}
		catch(Exception ex) {
			System.out.println("Servlet error:"+ex);
		}
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
