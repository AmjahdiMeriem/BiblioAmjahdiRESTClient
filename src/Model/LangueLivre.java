package Model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LangueLivre implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//------------------------------------------------------------------------------------------//
	private Long idLangueLivre;
	private String nomLangueLivre;
//------------------------------------------------------------------------------------------//
	public LangueLivre() {}
//------------------------------------------------------------------------------------------//
	public Long getIdLangueLivre() {
		return idLangueLivre;
	}
	@XmlElement
	public void setIdLangueLivre(Long idLangueLivre) {
		this.idLangueLivre = idLangueLivre;
	}
	public String getNomLangueLivre() {
		return nomLangueLivre;
	}
	@XmlElement
	public void setNomLangueLivre(String nomLangueLivre) {
		this.nomLangueLivre = nomLangueLivre;
	}

}
