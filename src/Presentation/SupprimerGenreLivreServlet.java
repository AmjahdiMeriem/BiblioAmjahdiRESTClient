package Presentation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

@WebServlet("/SupprimerGenreLivreServlet")
public class SupprimerGenreLivreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SupprimerGenreLivreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Client client = javax.ws.rs.client.ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/Biblio3AmjahdiRESTServer/GenreLivreDAOImpl/removeGenreLivre");
		Long idGenreLivre = Long.valueOf(Integer.parseInt(request.getParameter("id")));
		target.path("/"+idGenreLivre).request().delete();
		this.getServletContext().getRequestDispatcher("/SupprimerGenre.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
