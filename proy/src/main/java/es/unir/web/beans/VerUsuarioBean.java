package es.unir.web.beans;

import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;

import es.unir.web.dao.UsuarioDAO;
import es.unir.web.dto.UsuarioDTO;
import es.unir.web.utils.Utils;

public class VerUsuarioBean {

	private static final long serialVersionUID = 1135568330881088908L;

	Logger log = Logger.getLogger(VerUsuarioBean.class);

	private UsuarioDAO usuarioDAO;

	private UsuarioDTO usuarioDTO;

	public void init() {
		if (usuarioDTO == null && Utils.getReqParam("user") != null
				&& StringUtils.hasText((String) Utils.getReqParam("user"))) {
			String user = (String) Utils.getReqAttribute("user");
			usuarioDTO = usuarioDAO.getUsuario(new Long(user));
		}
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

}