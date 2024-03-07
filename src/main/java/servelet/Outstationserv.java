package servelet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import controler.Hourbookcontrol;
import controler.Outstationcontrole;

/**
 * Servlet implementation class Outstationserv
 */
public class Outstationserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Outstationserv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 String pickup=request.getParameter("pickupLocationOutstation");
		    String dest=request.getParameter("dropLocationOutstation");
		  Outstationcontrole sc=new Outstationcontrole (pickup,dest);
		    sc.Store();
		    request.setAttribute("pickupLocationOutstation", pickup);
		    request.setAttribute("pickupLocationOutstation", dest);
		    
		    
		    request.getRequestDispatcher("Conformoutview.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
