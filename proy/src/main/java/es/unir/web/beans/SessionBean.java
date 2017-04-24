package es.unir.web.beans;

import org.apache.log4j.Logger;

import es.unir.web.dto.UsuarioDTO;
import es.unir.web.utils.Utils;

public class SessionBean {

	private static final long serialVersionUID = 1135568330881088908L;

	Logger log = Logger.getLogger(SessionBean.class);

	public void init() {
	}

	public boolean isAdmin() {
		Object ses = Utils.getSesAttribute("admin");
		return ses != null && (Boolean) ses;
	}

	public UsuarioDTO getUsuario() {
		Object ses = Utils.getSesAttribute("usuario");
		return ses != null ? (UsuarioDTO) ses : null;
	}

}