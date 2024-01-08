package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		response.setContentType("text/html");
		response.setContentType("text/html");
		out.println("<html><body>");
		out.println("<form action='myServlet2' method='post'>");
		out.println("Nombre de usuario: <input type='text' name='username'><br>");
		out.println("<input type='submit' value='Enviar'>");
		out.println("</form>");
		out.println("</body></html>");

	}

}