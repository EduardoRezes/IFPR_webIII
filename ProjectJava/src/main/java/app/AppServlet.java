package app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/requisicao")
public class AppServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//metod
		String metod = req.getMethod();
		//URI do Pedido
		String protocol = req.getProtocol();
		//Protocolo
		String URI = req.getRequestURI();

		resp.getWriter().print("<p>This is my Protocol: " + protocol + "<p>");
		resp.getWriter().print("<p>This is my URI: " + URI + "<p>");
		resp.getWriter().print("<p>This is my Method: " + metod + "<p>");
		
		System.out.println(metod);
		System.out.println(protocol);
		System.out.println(URI);
	}
}
