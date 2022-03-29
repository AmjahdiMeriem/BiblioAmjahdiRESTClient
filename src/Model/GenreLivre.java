package Model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GenreLivre implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//------------------------------------------------------------------------------------------//
	private Long idGenreLivre;
	private String nomGenreLivre;
//------------------------------------------------------------------------------------------//
	public GenreLivre() {}
//------------------------------------------------------------------------------------------//
	public Long getIdGenreLivre() {
		return idGenreLivre;
	}
	@XmlElement
	public void setIdGenreLivre(Long idGenreLivre) {
		this.idGenreLivre = idGenreLivre;
	}
	public String getNomGenreLivre() {
		return nomGenreLivre;
	}
	@XmlElement
	public void setNomGenreLivre(String nomGenreLivre) {
		this.nomGenreLivre = nomGenreLivre;
	}

}
