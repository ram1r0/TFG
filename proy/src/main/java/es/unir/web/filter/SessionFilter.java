package es.unir.web.filter;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;
import java.util.StringTokenizer;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

public class SessionFilter implements Filter {

	Logger log = Logger.getLogger(Filter.class);

	private ArrayList<String> urlList;

	private HashMap<String, String> permisos;

	public void destroy() {
	}

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		String url = request.getServletPath();
		url = url.toLowerCase();

		if (isUrlAllowed(url)) {
			chain.doFilter(req, res);
		} else {
			HttpSession session = request.getSession(false);

			if (session == null || !isAutenticado(session)) {
				response.sendRedirect("/");
			} else {
				chain.doFilter(new RequestWrapper((HttpServletRequest) req),
						res);
			}
		}
	}

	public void init(FilterConfig config) throws ServletException {

		log.info("Cargando el filtro de seguridad. ");
		String conf = config.getInitParameter("config");
		log.info("Nombre del fichero de seguridad: " + conf);
		InputStream is = config.getServletContext().getResourceAsStream(conf);
		Properties properties = new Properties();
		if (is == null) {
			log.error("ATENCIÓN: No se ha encontrado el fichero de seguridad. Se ha deshabilitado la seguridad de la aplicación. ");
			return;
		}

		try {

			try {
				properties.load(is);
			} finally {
				is.close();
			}

		} catch (IOException e) {
			log.error("Error al cargar la configuración del fichero de seguirdad.");
		}

		// String urls = config.getInitParameter("avoid-urls");
		StringTokenizer token = new StringTokenizer(
				properties.getProperty("SEGURIDAD.PERMITIR"), ",");

		urlList = new ArrayList<String>();

		log.info("************************ Url denegadas ***************************");
		while (token.hasMoreTokens()) {
			String pol = token.nextToken().trim().toLowerCase();
			log.info("--> *" + pol);
			urlList.add(pol);
		}

		log.info("*************************** Permisos ******************************");
		permisos = new HashMap<String, String>();
		token = new StringTokenizer(
				properties.getProperty("SEGURIDAD.PERMISOS"), " ");
		while (token.hasMoreTokens()) {
			String pol = token.nextToken().trim();
			String[] array = pol.split("!");
			log.info("URL: " + array[0].toLowerCase() + " PERMISO: " + array[1]);
			permisos.put(array[0].toLowerCase(), array[1]);
		}

	}

	private boolean isUrlAllowed(String path) {
		for (String url : urlList) {
			if (path.contains(url))
				return true;
		}

		if (log.isDebugEnabled()) {
			log.debug("Acceso denegado --> " + path);
		}
		return false;
	}

	private boolean isAutenticado(HttpSession session) {
		return true;
	}

}