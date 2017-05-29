package es.unir.web.beans;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.apache.log4j.Logger;
import org.primefaces.model.UploadedFile;

import es.unir.web.dao.RepositorioDAO;

public class MainBean {

    private static final long serialVersionUID = 1135568330881088908L;

    Logger log = Logger.getLogger(MainBean.class);

    private UploadedFile documento;

    private RepositorioDAO repositorioDAO;
    
    public void init() {
    }

    public String guardarDocumento() {
	boolean guardado = false;
	if (getDocumento() != null && getDocumento().getSize() > 0) {
	    
//	    try {
//		repositorioDAO.saveIR21(getDocumento().getFileName(), getDocumento().getContents());
//		guardado = true;
//	    } catch (Exception e) {
//		 FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Se ha producido un error al guardar el documento", "");
//		    FacesContext.getCurrentInstance().addMessage(null, msg);
//	    }
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
	if(guardado){
	FacesMessage msg = new FacesMessage("El documento se ha guardado correctamente", "");
	FacesContext.getCurrentInstance().addMessage(null, msg);}

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

}