package Presentation;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;

@WebServlet("/AjouterLivrePannierServlet")
public class AjouterLivrePannierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AjouterLivrePannierServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Client client = javax.ws.rs.client.ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/Biblio3AmjahdiRESTServer/PannierDAOImpl/addLivrePannier");
		Long ISBN = Long.valueOf(Integer.parseInt(request.getParameter("isbn")));
		
		HttpSession session = request.getSession();
		Long idUser = (Long) session.getAttribute("idUser");
		target.path("/"+ISBN+"/"+idUser).request().get();
		this.getServletContext().getRequestDispatcher("/AfficherLivrePannierServlet" ).forward( request, response );
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Client client = javax.ws.rs.client.ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/Biblio3AmjahdiRESTServer/PannierDAOImpl/addLivrePannier");
		Long ISBN = Long.valueOf(Integer.parseInt(request.getParameter("isbn")));
		
		HttpSession session = request.getSession();
		Long idUser = (Long) session.getAttribute("idUser");
		target.path("/"+ISBN+"/"+idUser).request().get();
		this.getServletContext().getRequestDispatcher("/AfficherLivrePannierServlet" ).forward( request, response );
		
	}

}
