package Presentation;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;

import Model.Livre;

public class AjouterLivreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public static final int TAILLE_TAMPON = 10240;
    public static final String CHEMIN_FICHIERS = "C:\\Users\\hp\\eclipse-workspace\\Biblio3AmjahdiRESTClient\\WebContent\\Template\\images\\";
  
    public AjouterLivreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Livre livre=new Livre();
		try{
		livre.setISBN(Long.valueOf(Integer.parseInt(request.getParameter("isbn"))));
		livre.setTitre(request.getParameter("titre"));
		livre.setAuteur(request.getParameter("auteur"));
		livre.setEditeur(request.getParameter("editeur"));
		livre.setAnnee(Integer.parseInt(request.getParameter("annee")));
		livre.setIdGenreLivre(Long.valueOf(Integer.parseInt(request.getParameter("genre"))));
		livre.setIdLangueLivre(Long.valueOf(Integer.parseInt(request.getParameter("langue"))));
		livre.setPrix(Integer.parseInt(request.getParameter("prix")));
		livre.setDescription(request.getParameter("description"));
		Part part = request.getPart("url");
		String nomFichier = getNomFichier(part);
		
		// Si on a bien un fichier
        if (nomFichier != null && !nomFichier.isEmpty()) {
        	
            String nomChamp = part.getName();
            
            // Corrige un bug du fonctionnement d'Internet Explorer
             nomFichier = nomFichier.substring(nomFichier.lastIndexOf('/') + 1)
                    .substring(nomFichier.lastIndexOf('\\') + 1);
             String n=request.getParameter("isbn")+nomFichier.substring(nomFichier.lastIndexOf("."));
             livre.setUrlImage(n);
            // On �crit d�finitivement le fichier sur le disque 
            ecrireFichier(part, n, CHEMIN_FICHIERS);
            request.setAttribute(nomChamp, nomFichier);
        }
		
		Client client = javax.ws.rs.client.ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/Biblio3AmjahdiRESTServer/LivreDAOImpl");
		target.path("/addLivre").request().post(Entity.json(livre));
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("AjoutLivre.jsp");
        dispatcher.forward(request, response);
		}catch (Exception e){
			System.out.println("Erreur");
        	}
	}
	
	private void ecrireFichier( Part part, String nomFichier, String chemin ) throws IOException {
        BufferedInputStream entree = null;
        BufferedOutputStream sortie = null;
        try {
            entree = new BufferedInputStream(part.getInputStream(), TAILLE_TAMPON);
            sortie = new BufferedOutputStream(new FileOutputStream(new File(chemin + nomFichier)), TAILLE_TAMPON);

            byte[] tampon = new byte[TAILLE_TAMPON];
            int longueur;
            while ((longueur = entree.read(tampon)) > 0) {
                sortie.write(tampon, 0, longueur);
            }
        } finally {
            try {
                sortie.close();
            } catch (IOException ignore) {
            }
            try {
                entree.close();
            } catch (IOException ignore) {
            }
        }
    }
	
		private static String getNomFichier(Part part) {
	        for ( String contentDisposition : part.getHeader( "content-disposition" ).split( ";" ) ) {
	            if ( contentDisposition.trim().startsWith( "filename" ) ) {
	                return contentDisposition.substring( contentDisposition.indexOf( '=' ) + 1 ).trim().replace( "\"", "" );
	            }
	        }
	        return null;
	    } 
}
