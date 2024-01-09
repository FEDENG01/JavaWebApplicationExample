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

		// Obtiene el nombre de usuario del formulario
		String username = request.getParameter("username");

		// Establece el nombre de usuario como atributo en el request
		request.setAttribute("username", username);

		// Redirige a la página JSP que mostrará el nombre de usuario
		request.getRequestDispatcher("saludo.jsp").forward(request, response);
	}

}