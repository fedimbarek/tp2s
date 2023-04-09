package isetjServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.rmi.server.Dispatcher;

/**
 * Servlet implementation class FormulaireServlet
 */
@WebServlet("/FormulaireServlet")
public class FormulaireServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormulaireServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op1 = request.getParameter("t1");
		String op2 = request.getParameter("t2");
		String op = request.getParameter("r");
		
		String page = "";
		if (op1.equals("") || op2.equals("") || op == null || !op1.matches("[0-9]*") || !op2.matches("[0-9]*")) {
			page = "erreur.jsp";
		} else {
			page = "reponse.jsp";
			int opt1 = Integer.parseInt(op1);
			int opt2 = Integer.parseInt(op2);
			int r = 0;
			if (op.equals("+")) {
				r = opt1 + opt2;
			} else if (op.equals("-")) {
				r = opt1 - opt2;
			} else if (op.equals("*")) {
				r = opt1 * opt2;
			} else if (op.equals("/")) {
				if (opt2 != 0) {
					r = opt1 / opt2;
					} else {
						page = "erreur.jsp";
					}
					
			}
			request.setAttribute("resultat", r);
		}
		
		RequestDispatcher disp = request.getRequestDispatcher(page);
		disp.forward(request, response);
	}
}
