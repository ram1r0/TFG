package es.unir.web.beans;

import java.io.IOException;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.primefaces.model.UploadedFile;

import es.unir.web.dao.RepositorioDAO;
import es.unir.web.dao.ServicioIR21DAO;
import es.unir.web.utils.Utils;

public class NuevoIR21 {

    private static final long serialVersionUID = 1135568330881088908L;

    Logger log = Logger.getLogger(NuevoIR21.class);

    private UploadedFile documento;

    private RepositorioDAO repositorioDAO;

    private ServicioIR21DAO servicioIR21DAO;

    private List<SelectItem> paises;

    private String operadora;

    private String pais;

    public void init() {
	if (paises == null) {
	    paises = Utils.getPaises();
	}
    }

    public String guardarDocumento() {
	boolean guardado = false;
	
	if (getDocumento() != null && getDocumento().getSize() > 0) {

	    try {
		repositorioDAO.saveIR21(getDocumento().getFileName(), getDocumento().getContents(),null,null, true);
		guardado = true;
	    } catch (Exception e) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Se ha producido un error al guardar el documento", "");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	    }
	    // documentoDTO.setContentType(getDocumento().getContentType());
	    //
	    // documentoDTO.setBytes(FileUtils.byteCountToDisplaySize(new Long(
	    // getDocumento().getContents().length)));
	    // documentoDTO.setContenido(getDocumento().getContents());
	    // documentoDTO.setNombre(getDocumento().getFileName());
	} else {
	    FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Debe adjuntar un documento", "");
	    FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	// documentoDTO = documentoDAO.guardarDocumento(documentoDTO);
	if (guardado) {
//	    FacesMessage msg = new FacesMessage("El documento se ha guardado correctamente", "");
//	    FacesContext.getCurrentInstance().addMessage(null, msg);
	    
	    FacesContext context = FacesContext.getCurrentInstance();
		HttpServletResponse response = (HttpServletResponse) context.getExternalContext().getResponse();
		try {
		    response.sendRedirect("/proy/jsp/ir21/ir21.jsf?ir21=" + getDocumento().getFileName() +".tmp" + "&pais=" + getPais() + "&operadora=" + getOperadora()+ "&guardado=false");
		} catch (IOException e) {
		    e.printStackTrace();
		    log.error(e.getMessage(), e);
		}
	}

	return "";
    }

    public void upload() {
    }

    public UploadedFile getDocumento() {
	return documento;
    }

    public void setDocumento(UploadedFile documento) {
	this.documento = documento;
    }

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

    public String getOperadora() {
	return operadora;
    }

    public void setOperadora(String operadora) {
	this.operadora = operadora;
    }

    public List<SelectItem> getPaises() {
	return paises;
    }

    public String getPais() {
	return pais;
    }

    public void setPaises(List<SelectItem> paises) {
	this.paises = paises;
    }

    public void setPais(String pais) {
	this.pais = pais;
    }
}