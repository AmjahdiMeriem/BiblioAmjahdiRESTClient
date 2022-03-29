package Presentation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;

import Model.GenreLivre;

@WebServlet("/AjouterGenreServlet")
public class AjouterGenreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AjouterGenreServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		GenreLivre genre = new GenreLivre();
		try {
			genre.setNomGenreLivre(request.getParameter("nameKind"));
			Client client = javax.ws.rs.client.ClientBuilder.newClient();
			WebTarget target = client.target("http://localhost:8080/Biblio3AmjahdiRESTServer/GenreLivreDAOImpl");
			target.path("/addGenreLivre").request().post(Entity.json(genre));
			this.getServletContext().getRequestDispatcher("/AjouterGenre.jsp" ).forward( request, response );
		} catch (Exception e) {
			System.out.println("Erreur");
		}
	}

}
