package app;

import java.io.IOException;
import java.net.InetAddress;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cabecalho")
public class AppServletcabe extends HttpServlet{
	private static final long serialVersionUID = 2L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//host
		String host = InetAddress.getLocalHost ().getHostName();
		//user-agent
		String userAgent = req.getHeader("user-agent");
		//acept-encoding
		String acepptEncoding = req.getHeader("acept-encoding");
		//accept-language
		String aceptLanguage = req.getHeader("accept-language");
				
		resp.getWriter().print("<p>This is my host: " + host + "<p>");
		resp.getWriter().print("<p>This is my user-agent: " + userAgent + "<p>");
		resp.getWriter().print("<p>This is my aceppt-encoding: " + acepptEncoding + "<p>");
		resp.getWriter().print("<p>This is my accept-language: " + aceptLanguage + "<p>");
		
	}
}
