import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Se extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("boton");
		if(name.equals("ALTA"))
			response.sendRedirect("http://localhost:8080/ejercicio/Alta.jsp");
		if(name.equals("CAMBIO"))
			response.sendRedirect("http://localhost:8080/ejercicio/Cambio.jsp");
		if(name.equals("BAJA"))
			response.sendRedirect("http://localhost:8080/ejercicio/Baja.jsp");
		if(name.equals("CONSULTA"))
			response.sendRedirect("http://localhost:8080/ejercicio/Alta.jsp");
		if(name.equals("BUSCAR"))
			response.sendRedirect("http://localhost:8080/ejercicio/Cambio2.jsp");
		
	}
}
