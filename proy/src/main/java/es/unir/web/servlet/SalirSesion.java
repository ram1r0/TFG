package es.unir.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class SalirSesion extends HttpServlet {

	Logger log = Logger.getLogger(SalirSesion.class);

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse res)
			throws ServletException {

		request.getSession().invalidate();

		res.setStatus(HttpServletResponse.SC_OK);
		try {
			res.sendRedirect("/proy/jsp/home/home.jsf");
		} catch (IOException e) {
		}

	}

}