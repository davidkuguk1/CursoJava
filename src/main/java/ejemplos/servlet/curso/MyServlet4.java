package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * EJERCICIO 1 PARTE B
 */
@WebServlet(urlPatterns = "/myServlet4")
public class MyServlet4 extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        String nombre = request.getParameter("nombre");

        String mensaje = "Bienvenid@ " + nombre + "!";

        // Enviar el mensaje como respuesta
        response.setContentType("text/html");
        response.getWriter().println("<html><body><h1>" + mensaje + "</h1></body></html>");
    }
}
