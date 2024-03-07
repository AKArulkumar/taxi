package servelet;

import java.io.IOException;

import controler.Signupcontrol;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Signupserv
 */
public class Signupserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signupserv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//.getWriter().append("Served at: ").append(request.getContextPath());
		   String name=request.getParameter("uname");
		    String pass=request.getParameter("pass");
		    String email=request.getParameter("email");
		    String pno=request.getParameter("phno");
		    Signupcontrol sc=new Signupcontrol(name,pass,email,pno);
		    sc.toStore();
		    response.sendRedirect("signinview.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
