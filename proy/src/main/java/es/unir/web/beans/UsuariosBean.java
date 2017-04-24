package es.unir.web.beans;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.apache.log4j.Logger;
import org.primefaces.model.UploadedFile;
import org.springframework.util.StringUtils;

import es.unir.web.dao.UsuarioDAO;
import es.unir.web.dto.UsuarioDTO;
import es.unir.web.utils.Utils;

public class UsuariosBean {

	private static final long serialVersionUID = 1135568330881088908L;

	Logger log = Logger.getLogger(UsuariosBean.class);

	private UsuarioDAO usuarioDAO;

	private UsuarioDTO usuarioDTO;

	private UploadedFile foto;

	private String usuario, nombre, perfil, categoria, telefono, despacho,
			email, tutorias;

	public void init() {
		if (usuarioDTO == null && Utils.getReqParam("user") != null
				&& StringUtils.hasText((String) Utils.getReqParam("user"))) {
			String user = (String) Utils.getReqAttribute("user");
			usuarioDTO = usuarioDAO.getUsuario(new Long(user));
		}
		if (usuarioDTO == null) {
			usuarioDTO = new UsuarioDTO();
		}
	}

	public String guardarUsuario() {
		usuarioDTO = usuarioDAO.guardarUsuario(usuarioDTO);

		FacesMessage msg = new FacesMessage(
				"El usuario se ha guardado correctamente", "");
		FacesContext.getCurrentInstance().addMessage(null, msg);

		return "";
	}

	public void upload() {
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTutorias() {
		return tutorias;
	}

	public void setTutorias(String tutorias) {
		this.tutorias = tutorias;
	}

	public UsuarioDAO getUsuarioDAO() {
		return usuarioDAO;
	}

	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}

	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}

	public UploadedFile getFoto() {
		return foto;
	}

	public void setFoto(UploadedFile foto) {
		this.foto = foto;
	}

}
