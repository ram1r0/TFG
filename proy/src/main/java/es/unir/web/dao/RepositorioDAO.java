package es.unir.web.dao;

import https.infocentre_gsm_org.tadig_raex_ir21.TADIGRAEXIR21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.util.StringUtils;

import es.unir.web.dto.IR21DTO;
import es.unir.web.utils.Constantes;
import es.unir.web.utils.PDFUtils;
import es.unir.web.utils.Utils;

public class RepositorioDAO implements Serializable {

    private static final long serialVersionUID = 603531139172302760L;

    private final Logger log = Logger.getLogger(RepositorioDAO.class);

    private HibernateTemplate hibernateTemplate;

    public void setSessionFactory(final SessionFactory sessionFactory) {
	hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

    public Long saveIR21(String nombre, byte[] fichero, String operadora, String pais, boolean tmp) throws Exception {
	FileOutputStream fos = null;

	try {
	    if (tmp) {
		fos = new FileOutputStream(Utils.getPropiedad(Constantes.REPO_DIR) + File.separator + nombre + ".tmp");
		try {
		    fos.write(fichero);
		} catch (IOException e) {
		    e.printStackTrace();
		    log.error("Error al guardar Ir21", e);
		}
		try {
		    fos.close();
		} catch (IOException e) {
		    log.error("Error al guardar Ir21", e);
		    throw new Exception("Error al guardar fichero en el repositorio. ");
		}
	    } else {
		File f = new File(Utils.getPropiedad(Constantes.REPO_DIR) + File.separator + nombre);
		String url = Utils.getPropiedad(Constantes.REPO_DIR) + File.separator + nombre;
		url = url.replace(".tmp", "");
		File f2 = new File(url);
		f.renameTo(f2);
	    }
	} catch (FileNotFoundException e1) {
	    log.error("Error al guardar fichero en el repositorio. ");
	    throw new Exception("Error al guardar fichero en el repositorio. ", e1);
	}

	if (!tmp) {
	    IR21DTO ir21 = new IR21DTO();
	    ir21.setFichero(nombre.replace(".tmp", ""));
	    ir21.setOperadora(operadora);
	    ir21.setPais(pais);
	    ir21.setFechaModificacion(new Date());

	    IR21DTO merge = hibernateTemplate.merge(ir21);
	    return merge.getId();
	}
	return 0L;
    }

    public int eliminarIR21(int id) {

	IR21DTO ir21 = getIR21(id);
	hibernateTemplate.delete(ir21);
	// XML
	String xml = Utils.getPropiedad(Constantes.REPO_DIR) + File.separator + ir21.getFichero();
	File f = new File(xml);
	if (f.exists()) {
	    f.delete();
	}

	String pdf = Utils.getPropiedad(Constantes.REPO_DIR) + File.separator + ir21.getFichero().replace("xml", "pdf");
	File f2 = new File(pdf);
	if (f2.exists()) {
	    f2.delete();
	}

	return 0;

    }

    public String getPDF(TADIGRAEXIR21 ir21t, int id) {
	IR21DTO ir21 = getIR21(id);
	String path = Utils.getPropiedad(Constantes.REPO_DIR) + File.separator + ir21.getFichero().replace("xml", "pdf");
	File f = new File(path);
	if (!f.exists()) {
	    PDFUtils.exportarPDF(ir21t, path);
	}
	return path;
    }

    public String getPDF(int id) {
	IR21DTO ir21 = getIR21(id);
	String path = Utils.getPropiedad(Constantes.REPO_DIR) + File.separator + ir21.getFichero().replace("xml", "pdf");
	File f = new File(path);
	if (!f.exists()) {
	    return null;
	}
	return path;
    }

    public String getIR21(String nombre) {
	return Utils.getPropiedad(Constantes.REPO_DIR) + File.separator + nombre;
    }

    public IR21DTO getIR21(int id) {

	Long a = Long.valueOf(id);
	return hibernateTemplate.get(IR21DTO.class, a);
    }

    public void deleteIR21(String nombre) {
	System.out.println("AAAAAAAAAA");
    }

    public List listaIR21() {
	DetachedCriteria criteria = DetachedCriteria.forClass(IR21DTO.class);
	criteria.addOrder(Order.asc("pais"));
	criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
	return hibernateTemplate.findByCriteria(criteria);
    }

    public List buscarIR21(String pais, String operadora) {
	DetachedCriteria criteria = DetachedCriteria.forClass(IR21DTO.class);
	if (pais != null && StringUtils.hasText(pais)) {
	    criteria.add(Restrictions.eq("pais", pais));
	}

	if (operadora != null && StringUtils.hasText(operadora)) {
	    criteria.add(Restrictions.like("operadora", operadora, MatchMode.ANYWHERE));
	}

	criteria.addOrder(Order.asc("pais"));

	criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
	List findByCriteria = hibernateTemplate.findByCriteria(criteria);
	if (findByCriteria != null && !findByCriteria.isEmpty()) {
	}
	return findByCriteria;
    }

}
