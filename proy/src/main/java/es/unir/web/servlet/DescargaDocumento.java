package es.unir.web.servlet;

import java.io.ByteArrayInputStream;
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

import es.unir.web.dao.DocumentoDAO;
import es.unir.web.dto.DocumentoDTO;

/**
 * Servlet para 'servir' contenido.
 */
public class DescargaDocumento extends HttpServlet {

	Logger log = Logger.getLogger(DescargaDocumento.class);

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse res)
			throws ServletException {

		String doc = request.getParameter("doc");
		if (!StringUtils.isEmpty(doc)) {
			ApplicationContext context = WebApplicationContextUtils
					.getWebApplicationContext(getServletContext());
			DocumentoDAO documentoDAO = (DocumentoDAO) context
					.getBean("documentoDAO");
			DocumentoDTO documento = documentoDAO.getDocumento(new Long(doc));
			if (documento != null && documento.getContenido() != null) {
				res.setContentType(documento.getContentType());
				res.setHeader("Content-disposition", "attachment; filename="
						+ documento.getNombre());
				descargarFichero(res, "", documento.getContenido());
				res.setStatus(HttpServletResponse.SC_OK);
				return;
			}
		}

		InputStream in = this.getClass().getClassLoader()
				.getResourceAsStream("no_foto.jpg");
		out(res, in);
		res.setStatus(HttpServletResponse.SC_OK);

		//
	}

	public void descargarFichero(HttpServletResponse response, String nombre,
			byte[] fichero) {
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

	private void tratarError(HttpServletResponse response, String message,
			Throwable e) throws ServletException {
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

	private void out(HttpServletResponse response, InputStream in)
			throws ServletException {
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