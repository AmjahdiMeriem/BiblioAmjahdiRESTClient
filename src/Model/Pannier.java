package Model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pannier implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//------------------------------------------------------------------------------------------//
	private Long id;
	private Long idUser;
	private Long ISBN;
	//------------------------------------------------------------------------------------------//
	public Pannier() {}
	//------------------------------------------------------------------------------------------//
		public Long getId() {
			return id;
		}
		@XmlElement
		public void setId(Long id) {
			this.id = id;
		}
	//------------------------------------------------------------------------------------------//
	public Long getIdUser() {
		return idUser;
	}
	@XmlElement
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	//------------------------------------------------------------------------------------------//
	public Long getISBN() {
		return ISBN;
	}
	@XmlElement
	public void setISBN(Long iSBN) {
		ISBN = iSBN;
	}
	//------------------------------------------------------------------------------------------//
}
