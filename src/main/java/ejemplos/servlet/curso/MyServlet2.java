package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet2")
public class MyServlet2 extends HttpServlet {

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("username");
		PrintWriter out = response.getWriter();

		response.setContentType("text/html");
		out.println("<html><body>");
		out.println("Hola, " + username + "!");
		out.println("</body></html>");

	}

}