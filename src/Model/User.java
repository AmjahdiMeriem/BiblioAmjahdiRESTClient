package Model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//-----------------------------------------------------------------------------------------//	
	private Long idUser;
	private String nameUser;
	private String emailUser;
	private String passwordUser;
	private Long idRoleUser;
//-----------------------------------------------------------------------------------------//
	public User() {}
//-----------------------------------------------------------------------------------------//
	public Long getIdUser() {
		return idUser;
	}
	@XmlElement
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getNameUser() {
		return nameUser;
	}
	@XmlElement
	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}
	public String getEmailUser() {
		return emailUser;
	}
	@XmlElement
	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}
	public String getPasswordUser() {
		return passwordUser;
	}
	@XmlElement
	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}
	public Long getIdRoleUser() {
		return idRoleUser;
	}
	@XmlElement
	public void setIdRoleUser(Long idRoleUser) {
		this.idRoleUser = idRoleUser;
	}
//-----------------------------------------------------------------------------------------//
}
