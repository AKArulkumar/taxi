package servelet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import controler.Hourbookcontrol;

/**
 * Servlet implementation class Hourbookservlet
 */
public class Hourbookservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hourbookservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String pickup=request.getParameter("pickupLocation");
	    String dest=request.getParameter("dropLocation");
	    String type=request.getParameter("carType");
	    String hours=request.getParameter("numberOfHours");
	    Hourbookcontrol sc=new Hourbookcontrol (pickup,dest,type,hours);
	    sc.Store();
	    System.out.println(pickup);
	    System.out.println(dest);
	    System.out.println(type);
	    System.out.println(hours);
	    request.setAttribute("pickup", pickup);
	    request.setAttribute("dest", dest);
	    request.setAttribute("type", type);
	    request.setAttribute("hours", hours);
	    
	    request.getRequestDispatcher("Conformhourview.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
