package Model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class RoleUser implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//-----------------------------------------------------------------------------------------//
	private Long idRoleUser;
	private String nameRoleUser;
//-----------------------------------------------------------------------------------------//
	public RoleUser() {}
//-----------------------------------------------------------------------------------------//
	public Long getIdRoleUser() {
		return idRoleUser;
	}
	@XmlElement
	public void setIdRoleUser(Long idRoleUser) {
		this.idRoleUser = idRoleUser;
	}
	public String getNameRoleUser() {
		return nameRoleUser;
	}
	@XmlElement
	public void setNameRoleUser(String nameRoleUser) {
		this.nameRoleUser = nameRoleUser;
	}
//-----------------------------------------------------------------------------------------//
}
