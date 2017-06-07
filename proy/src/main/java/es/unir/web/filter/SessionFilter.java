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
		
		if(url.contains(".jsf") && url.contains("jsp") && !url.contains("login.jsf")){
		    if(!isAutenticado(request.getSession())){
			response.sendRedirect("/proy");
		    } else {
			chain.doFilter(new RequestWrapper((HttpServletRequest) req),
				res);
		    }
		} else {
		    chain.doFilter(new RequestWrapper((HttpServletRequest) req),
				res);
		}
		
	}

	public void init(FilterConfig config) throws ServletException {

	}


	private boolean isAutenticado(HttpSession session) {
		return session.getAttribute("usuario") != null;
	}

}