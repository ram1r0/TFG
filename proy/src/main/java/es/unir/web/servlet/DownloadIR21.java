package es.unir.web.servlet;

import https.infocentre_gsm_org.tadig_raex_ir21.TADIGRAEXIR21;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import es.unir.web.dao.RepositorioDAO;
import es.unir.web.dao.ServicioIR21DAO;
import es.unir.web.dto.IR21DTO;
import es.unir.web.utils.Constantes;
import es.unir.web.utils.PDFUtils;
import es.unir.web.utils.Utils;

//import es.unir.web.dao.DocumentoDAO;
//import es.unir.web.dto.DocumentoDTO;

/**
 * Servlet para 'servir' contenido.
 */
public class DownloadIR21 extends HttpServlet {

    Logger log = Logger.getLogger(DownloadIR21.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse res) throws ServletException {

	String id = request.getParameter("id");
	String tipo = request.getParameter("t");
	String fichero =  null;
	if (!StringUtils.isEmpty(id)) {
	    ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
	    RepositorioDAO repo = (RepositorioDAO) context.getBean("repositorioDAO");
	    int idIR21 = Integer.valueOf(id);
	    IR21DTO ir21 = repo.getIR21(idIR21);

	    String path = null;
	    if ("xml".equals(tipo)) {
		path = Utils.getPropiedad(Constantes.REPO_DIR, request) + File.separator + ir21.getFichero();
		fichero = ir21.getFichero();
	    } else {
		path = Utils.getPropiedad(Constantes.REPO_DIR, request) + File.separator + ir21.getFichero().replace("xml", "pdf");
		File f = new File(path);
		if (!f.exists()) {
		    ServicioIR21DAO serv = (ServicioIR21DAO) context.getBean("servicioIR21DAO");

		    String dir = Utils.getPropiedad(Constantes.REPO_DIR, request) + File.separator + ir21.getFichero();
		    TADIGRAEXIR21 tadig = null;
		    try {
			tadig = serv.procesarIR21(dir);
		    } catch (Exception e) {
			e.printStackTrace();
		    }
		    PDFUtils.exportarPDF(tadig,  ir21.getOperadora(),ir21.getPais(),path);
		}
		fichero = ir21.getFichero().replace("xml", "pdf");
	    }

	    download(res, path, fichero);

	    res.setStatus(HttpServletResponse.SC_OK);
	    return;
	}

	// InputStream in =
	// this.getClass().getClassLoader().getResourceAsStream("no_foto.jpg");
	// out(res, in);
	res.setStatus(HttpServletResponse.SC_OK);

    }

    private void download(HttpServletResponse res, String path, String fichero) {
	res.setContentType("application/pdf");
	res.setHeader("Content-disposition", "attachment; filename=" + fichero);

	FileInputStream in = null;
	try {
	    in = new FileInputStream(path);
	} catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	OutputStream out = null;
	try {
	    out = res.getOutputStream();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	// Copy the contents of the file to the output stream
	byte[] buf = new byte[1024];
	int count = 0;
	try {
	    while ((count = in.read(buf)) >= 0) {
		out.write(buf, 0, count);
	    }
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	try {
	    out.close();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	try {
	    in.close();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

    public void descargarFichero(HttpServletResponse response, String nombre, byte[] fichero) {
	// response.setContentType("application/force-download");
	// response.addHeader("Content-Disposition", "attachment; filename=\""
	// + nombre + "\"");
	byte[] buf = new byte[1024];
	long length = fichero.length;
	ByteArrayInputStream in = null;
	ServletOutputStream out = null;
	try {
	    in = new ByteArrayInputStream(fichero);
	    out = response.getOutputStream();
	    response.setContentLength((int) length);
	    while (in != null && (length = in.read(buf)) != -1) {
		out.write(buf, 0, (int) length);
	    }
	    in.close();
	    out.close();
	} catch (IOException e) {
	    log.error("Error al descargar el fichero. ", e);
	} finally {
	    try {
		if (in != null) {
		    in.close();
		}
		if (out != null) {
		    out.flush();
		    out.close();
		}
	    } catch (IOException e) {
		log.error("Error al descargar el fichero. ", e);
	    }
	}
	// FacesContext.getCurrentInstance().responseComplete();
    }

    private void tratarError(HttpServletResponse response, String message, Throwable e) throws ServletException {
	if (message != null) {
	    log.error(message, e);
	} else {
	    log.error(e.getMessage(), e);
	}
	try {
	    response.sendRedirect("/error");
	} catch (IOException e1) {
	    response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
	}
    }

    private void out(HttpServletResponse response, InputStream in) throws ServletException {
	OutputStream out = null;
	try {
	    out = response.getOutputStream();
	} catch (IOException e) {
	    tratarError(response, null, e);
	}

	try {
	    if (out != null && in != null) {
		int c;

		while ((c = in.read()) != -1) {
		    out.write(c);
		}
	    }
	} catch (Exception e) {
	    tratarError(response, null, e);
	} finally {
	    try {
		if (in != null) {
		    in.close();
		}
		if (out != null) {
		    out.flush();
		    out.close();
		}
	    } catch (IOException e) {
		log.error("Error al descargar el fichero. ", e);
	    }
	}
    }

}