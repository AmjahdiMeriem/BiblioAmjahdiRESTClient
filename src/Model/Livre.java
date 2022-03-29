package Model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Livre implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//------------------------------------------------------------------------------------------//	
	private Long ISBN;
	private String titre;
	private String auteur;
	private String editeur;
	private int annee;
	private Long idGenreLivre;
	private Long idLangueLivre;
	private int prix;
	private String description;
	private String urlImage;
//------------------------------------------------------------------------------------------//	
	public Livre() {}
//------------------------------------------------------------------------------------------//	
	public Long getISBN() {
		return ISBN;
	}
	@XmlElement
	public void setISBN(Long iSBN) {
		ISBN = iSBN;
	}
	public String getTitre() {
		return titre;
	}
	@XmlElement
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	@XmlElement
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getEditeur() {
		return editeur;
	}
	@XmlElement
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
	public int getAnnee() {
		return annee;
	}
	@XmlElement
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public Long getIdGenreLivre() {
		return idGenreLivre;
	}
	@XmlElement
	public void setIdGenreLivre(Long idGenreLivre) {
		this.idGenreLivre = idGenreLivre;
	}
	public Long getIdLangueLivre() {
		return idLangueLivre;
	}
	@XmlElement
	public void setIdLangueLivre(Long idLangueLivre) {
		this.idLangueLivre = idLangueLivre;
	}
	public int getPrix() {
		return prix;
	}
	@XmlElement
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public String getUrlImage() {
		return urlImage;
	}
	@XmlElement
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	public String getDescription() {
		return description;
	}
	@XmlElement
	public void setDescription(String description) {
		this.description = description;
	}
}
