package es.unir.web.beans;

import java.io.IOException;
import java.util.Properties;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.apache.log4j.Logger;

import es.unir.web.dao.UsuarioDAO;
import es.unir.web.dto.UsuarioDTO;
import es.unir.web.utils.Utils;

public class LoginBean {

	private static final long serialVersionUID = 1135568330881088908L;

	Logger log = Logger.getLogger(LoginBean.class);

	private UsuarioDAO usuarioDAO;

	private String usuario, clave;

	public void init() {
	}

	public String login() throws IOException {

		if (getProperties().get("admin.user").equals(getUsuario())
				&& getProperties().get("admin.pass").equals(getClave())) {
			Utils.setSesAttribute("admin", Boolean.TRUE);
			UsuarioDTO usuario = new UsuarioDTO();
			usuario.setNombre("administrador");
			Utils.setSesAttribute("usuario", usuario);
			Utils.setReqParametro("mostrarMensaje", true);
			return "";
		}

		UsuarioDTO usuario = usuarioDAO
				.obtenerUsuario(getUsuario(), getClave());
		if (usuario != null) {
			Utils.setSesAttribute("usuario", usuario);
			Utils.setReqParametro("mostrarMensaje", true);
		}

		return "";
	}

	public String salirSesion() {
		FacesContext.getCurrentInstance().getExternalContext()
				.invalidateSession();
		return "/home.jsf?faces-redirect=true";
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Properties getProperties() throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance()
				.getExternalContext();
		Properties properties = new Properties();
		properties.load(ec.getResourceAsStream("/WEB-INF/conf.properties"));
		return properties;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public UsuarioDAO getUsuarioDAO() {
		return usuarioDAO;
	}

	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}

}