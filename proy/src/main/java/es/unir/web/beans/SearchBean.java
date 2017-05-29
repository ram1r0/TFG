package es.unir.web.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import org.apache.log4j.Logger;

import es.unir.web.dao.RepositorioDAO;
import es.unir.web.dao.ServicioIR21DAO;
import es.unir.web.dto.IR21DTO;
import es.unir.web.utils.Utils;

public class SearchBean {

    private static final long serialVersionUID = 1135568330881088908L;

    Logger log = Logger.getLogger(SearchBean.class);

    public List<IR21DTO> listaIR21;

    public String pais;

    public String operadora;

    private List<SelectItem> paises;

    private List<SelectItem> filtros;

    public void init() {
	if (listaIR21 == null) {
	    listaIR21 = getRepositorioDAO().listaIR21();
	}
	if (paises == null) {
	    paises = Utils.getPaises();
	}

	if (filtros == null) {
	    List<SelectItem> filtros = new ArrayList<SelectItem>();
	    SelectItem i1 = new SelectItem("TADIG", "TADIG");
	    
	    SelectItem i2 = new SelectItem("Organisation", "Organisation");
	    SelectItem i3= new SelectItem("CC", "Country Code (CC)");
	    SelectItem i4 = new SelectItem("NDC", "National Destination Code (NDC)");
	    
	    filtros.add(i1);
	    filtros.add(i2);
	    filtros.add(i3);
	    filtros.add(i4);
	    
	    this.filtros = filtros;
	}
    }

    private RepositorioDAO repositorioDAO;
    private ServicioIR21DAO servicioIR21DAO;

    public String buscar() {

	listaIR21 = getRepositorioDAO().buscarIR21(getPais(), getOperadora());

	return "";
    }

    public String limpiar() {

	setPais(null);
	setOperadora(null);
	listaIR21 = getRepositorioDAO().listaIR21();

	return "";
    }

    public void actionBuscar(ActionEvent evt) {
	listaIR21 = getRepositorioDAO().buscarIR21(getPais(), getOperadora());
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

    public List<IR21DTO> getListaIR21() {
	return listaIR21;
    }

    public void setListaIR21(List<IR21DTO> listaIR21) {
	this.listaIR21 = listaIR21;
    }

    public String getPais() {
	return pais;
    }

    public String getOperadora() {
	return operadora;
    }

    public void setPais(String pais) {
	this.pais = pais;
    }

    public void setOperadora(String operadora) {
	this.operadora = operadora;
    }

    public List<SelectItem> getPaises() {
	return paises;
    }

    public void setPaises(List<SelectItem> paises) {
	this.paises = paises;
    }

    public List<SelectItem> getFiltros() {
        return filtros;
    }

    public void setFiltros(List<SelectItem> filtros) {
        this.filtros = filtros;
    }

}