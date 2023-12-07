package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * EJERCICIO 1 PARTE A
 * David Kuguk
 * subido a github
 */
@WebServlet(urlPatterns = "/myServlet3")
public class MyServlet3 extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // send HTML page to client
        out.println("<html>");
        out.println("<head><title>EJERCICIO OPCIONAL</title></head>");
        out.println("<body>");
        out.println("<h1>EJERCICIO OPCIONAL 1</h1>");
        out.println("<form action=\"/myServlet4\" method=\"post\">");  // Agregué el atributo method y corregí la etiqueta <form>
        out.println("<label for=\"nombre\">Nombre:</label>");
        out.println("<input type=\"text\" id=\"nombre\" name=\"nombre\" required>");  // Agregué un campo de texto
        out.println("<br>");
        out.println("<input type=\"submit\" value=\"Enviar\">");
        out.println("</form>");  // Agregué la etiqueta de cierre para el formulario
        out.println("</body>");
        out.println("</html>");


    }
}
