package Presentation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;


@WebServlet("/SupprimerLangueLivreServlet")
public class SupprimerLangueLivreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SupprimerLangueLivreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Client client = javax.ws.rs.client.ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/Biblio3AmjahdiRESTServer/LangueLivreDAOImpl/removeLangueLivre");
		Long idLangue = Long.valueOf(Integer.parseInt(request.getParameter("id")));
		target.path("/"+idLangue).request().delete();
		this.getServletContext().getRequestDispatcher("/SupprimerLangue.jsp").forward(request, response);
	}

}
