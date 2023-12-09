package cl.litscl.responderjson;

import java.io.IOException;
import java.io.PrintWriter;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;

/**
 * Servlet implementation class ResponderJSON
 */
@WebServlet("/ResponderJSON")
public class ResponderJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResponderJSON() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. Crear el builder (Necesario para asignar valores al objeto JSON).
		JsonObjectBuilder builder = Json.createObjectBuilder();
		
		//2. Crear un objeto JSON utilizando el builder.
		JsonObject objetoJSON = builder.add("Nombre", "Daniel")
			.add("correo", "daniel@ejemplo.local")
			.add("telefonos", Json.createArrayBuilder() //En este caso se esta añadiendo como valor un Array de objetos.
			.add(Json.createObjectBuilder() //Añadiendo objetos al Array.
			.add("tipo", "Casa").add("numero", "451245")
			.add("tipo", "Particular").add("numero", "847219305"))).build();
	
		//3. Asignar el tipo de respuesta (La respuesta es de tipo JSON).
		response.setContentType(MediaType.APPLICATION_JSON);
		
		//4. Responder con el objeto JSON.
		try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
			pw.println(objetoJSON.toString());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
