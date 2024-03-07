package servelet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import controler.Taxibookcontrole;

/**
 * Servlet implementation class taxibookservelet
 */
public class taxibookservelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public taxibookservelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String dt=request.getParameter("pickupDateTime");
	    String p=request.getParameter("pickupLocation");
	    String d=request.getParameter("dropLocation");
	    String t=request.getParameter("carType");
		Taxibookcontrole ts=new Taxibookcontrole(dt, p, d, t);
		ts.Store();
		request.setAttribute("pickupDateTime", dt);
	    request.setAttribute("pickupLocation", p);
	    request.setAttribute("dropLocation", d);
	    request.setAttribute("carType", t);
	    
	    request.getRequestDispatcher("Conformbookview.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
