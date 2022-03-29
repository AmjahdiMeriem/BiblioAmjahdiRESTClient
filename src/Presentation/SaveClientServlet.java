package Presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;

import Model.User;

@WebServlet("/SaveClientServlet")
public class SaveClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SaveClientServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user=new User();
		
		user.setNameUser(request.getParameter("name"));
		user.setEmailUser(request.getParameter("email"));
		user.setPasswordUser(request.getParameter("password"));
		user.setIdRoleUser(1L);
		
		Client client = javax.ws.rs.client.ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/Biblio3AmjahdiRESTServer/UserDAOImpl");
		target.path("/saveClient").request().post(Entity.json(user));
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Index.jsp");
        dispatcher.forward(request, response);
	}

}
