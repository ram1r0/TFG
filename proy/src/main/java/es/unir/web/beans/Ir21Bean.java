package es.unir.web.beans;

import java.io.IOException;

import https.infocentre_gsm_org.tadig_raex_ir21.TADIGRAEXIR21;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;

import es.unir.web.dao.RepositorioDAO;
import es.unir.web.dao.ServicioIR21DAO;
import es.unir.web.dto.IR21DTO;
import es.unir.web.utils.Utils;

public class Ir21Bean {

    Logger log = Logger.getLogger(Ir21Bean.class);

    public TADIGRAEXIR21 tadig;

    public String operadora;
    public String pais;
    public String ir21;
    public boolean guardado;
    public String id;
    
    public boolean eliminado = false;

    public void init() {

	if (Utils.getReqParam("id") != null && StringUtils.hasText((String) Utils.getReqParam("id"))) {
	    guardado = true;
	    eliminado = false;
	    
	    Integer id = Integer.valueOf("" + Utils.getReqParam("id"));

	    IR21DTO ir21 = getRepositorioDAO().getIR21(id);
	    if (ir21 == null) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "No se encuentra el documento.", "");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	    } else {
		String dir = getRepositorioDAO().getIR21(ir21.getFichero());
		if (dir == null) {
		    FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "No se encuentra el documento.", "");
		    FacesContext.getCurrentInstance().addMessage(null, msg);
		} else {
		    try {
			tadig = getServicioIR21DAO().procesarIR21(dir);
		    } catch (Exception e) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al procesar el fichero. El fichero IR21 no es válido.", "");
			FacesContext.getCurrentInstance().addMessage(null, msg);
			log.error(e.getMessage(), e);
			e.printStackTrace();
		    }
		}
	    }

	}

	else if (Utils.getReqParam("ir21") != null && StringUtils.hasText((String) Utils.getReqParam("ir21"))) {
	    eliminado = false;
	    ir21 = (String) Utils.getReqAttribute("ir21");
	    String ruta = repositorioDAO.getIR21(ir21);

	    if (Utils.getReqParam("ir21") != null) {

		guardado = Boolean.valueOf((String) Utils.getReqParam("ir21"));
	    }
	    

	    operadora = (String) Utils.getReqParam("operadora");
	    pais = (String) Utils.getReqParam("pais");
	    try {
		tadig = getServicioIR21DAO().procesarIR21(ruta);
	    } catch (Exception e) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al procesar el fichero. El fichero IR21 no es válido.", "");
		FacesContext.getCurrentInstance().addMessage(null, msg);
		log.error(e.getMessage(), e);
		e.printStackTrace();
	    }

	    if (tadig != null) {
		FacesContext context = FacesContext.getCurrentInstance();
		HttpServletResponse response = (HttpServletResponse) context.getExternalContext().getResponse();
		try {
		    response.sendRedirect("/proy/jsp/ir21/ir21.jsf");
		} catch (IOException e) {
		    e.printStackTrace();
		    log.error(e.getMessage(), e);
		}
	    }
	}
    }

    public void eliminarIR21() {
	repositorioDAO.eliminarIR21(Integer.valueOf(getId()));

	FacesMessage msg = new FacesMessage("El documento se ha eliminado correctamente.", "");
	FacesContext.getCurrentInstance().addMessage(null, msg);
	eliminado = true;
	guardado = false;
    }

    public void guardarIR21() {

	try {
	    Long id = repositorioDAO.saveIR21(getIr21(), null, getOperadora(), getPais(), false);

	    setIr21(null);

	    setId("" + id);

	    FacesMessage msg = new FacesMessage("El documento se ha guardado correctamente", "");
	    FacesContext.getCurrentInstance().addMessage(null, msg);
	    guardado = true;
	} catch (Exception e) {
	    FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Se ha producido un error al guardar el documento", "");
	    FacesContext.getCurrentInstance().addMessage(null, msg);

	    log.error(e.getMessage(), e);
	    e.printStackTrace();
	}

    }

    private RepositorioDAO repositorioDAO;
    private ServicioIR21DAO servicioIR21DAO;

    public RepositorioDAO getRepositorioDAO() {
	return repositorioDAO;
    }

    public void setRepositorioDAO(RepositorioDAO repositorioDAO) {
	this.repositorioDAO = repositorioDAO;
    }

    public ServicioIR21DAO getServicioIR21DAO() {
	return servicioIR21DAO;
    }

    public void setServicioIR21DAO(ServicioIR21DAO servicioIR21DAO) {
	this.servicioIR21DAO = servicioIR21DAO;
    }

    public TADIGRAEXIR21 getTadig() {
	return tadig;
    }

    public void setTadig(TADIGRAEXIR21 tadig) {
	this.tadig = tadig;
    }

    public String getOperadora() {
	return operadora;
    }

    public String getPais() {
	return pais;
    }

    public void setOperadora(String operadora) {
	this.operadora = operadora;
    }

    public void setPais(String pais) {
	this.pais = pais;
    }

    public String getIr21() {
	return ir21;
    }

    public void setIr21(String ir21) {
	this.ir21 = ir21;
    }

    public boolean isGuardado() {
	return guardado;
    }

    public void setGuardado(boolean guardado) {
	this.guardado = guardado;
    }

    public String getId() {
	return id;
    }

    public void setId(String id) {
	this.id = id;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
}