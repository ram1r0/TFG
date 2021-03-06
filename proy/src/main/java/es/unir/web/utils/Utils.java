package es.unir.web.utils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;

import es.unir.web.dto.SuperBean;

public class Utils {

    public static final SimpleDateFormat FORMATO_FECHAS = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    static Logger log = Logger.getLogger(Utils.class);

    public static Properties props = null;

    // public static String getPropiedad(String propiedad) {
    // String ret = "";
    // FacesContext facesContext = FacesContext.getCurrentInstance();
    // String messageBundleName = facesContext.getApplication()
    // .getMessageBundle();
    // Locale locale = facesContext.getViewRoot().getLocale();
    // ResourceBundle bundle = ResourceBundle.getBundle(messageBundleName,
    // locale);
    // if (bundle != null) {
    // ret = bundle.getString(propiedad);
    // }
    // return ret;
    // }

    public static String getPropiedad(String propiedad) {
	if (props == null) {
	    props = new Properties();
	    try {
		props.load(new FileInputStream(new File(FacesContext.getCurrentInstance().getExternalContext().getRealPath("/WEB-INF/conf.properties"))));
	    } catch (FileNotFoundException e) {
		e.printStackTrace();
		log.error(e.getMessage());
	    } catch (IOException e) {
		e.printStackTrace();
		log.error(e.getMessage());
	    }
	}

	return props.getProperty(propiedad);
    }

    public static String getPropiedad(String propiedad, HttpServletRequest context) {
	String path = context.getRealPath("/WEB-INF/conf.properties");
	if (props == null) {
	    props = new Properties();
	    try {
		props.load(new FileInputStream(new File(path)));
	    } catch (FileNotFoundException e) {
		e.printStackTrace();
		log.error(e.getMessage());
	    } catch (IOException e) {
		e.printStackTrace();
		log.error(e.getMessage());
	    }
	}

	return props.getProperty(propiedad);
    }

    public static List<SelectItem> getPaises() {
	List<SelectItem> paises = new ArrayList<SelectItem>(247);

	File file = new File(FacesContext.getCurrentInstance().getExternalContext().getRealPath("/WEB-INF/paises.properties"));

	try {
	    Scanner sc = new Scanner(new FileInputStream(file), "UTF-8");

	    while (sc.hasNextLine()) {
		String line = sc.nextLine();
		if (StringUtils.hasText(line)) {
		    String[] split = line.split(";");
		    SelectItem select = new SelectItem(split[0], split[0]);
		    paises.add(select);
		}
	    }

	    sc.close();
	} catch (FileNotFoundException e) {
	    log.error(e.getMessage());
	}
	return paises;

    }

    public static void setReqParametro(final String attribute, final Object o) {
	final HttpServletRequest req = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
	req.setAttribute(attribute, o);
    }

    public static Object getSesAttribute(final String nombre) {
	return FacesContext.getCurrentInstance() == null ? null : FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(nombre);
    }

    public static Object getReqAttribute(final String nombre) {
	return ((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getAttribute(nombre);
    }

    public static Object getReqParam(final String nombre) {
	return ((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getParameter(nombre);
    }

    public static void setSesAttribute(final String nombre, final Object o) {
	FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put(nombre, o);
    }

    public static Object getSesAttributeServlet(HttpServletRequest req, String nombre) {
	return req.getSession().getAttribute(nombre);
    }

    public static boolean isNotEmpty(final Collection<?> lista) {
	return lista != null && lista.size() > 0;
    }

    public static boolean isEmpty(final Collection<?> lista) {
	return !isNotEmpty(lista);
    }

    public static boolean isTrue(final Boolean bool) {
	if (bool == null)
	    return false;
	return bool.booleanValue() ? true : false;
    }

    public static String log(String msg, final String... args) {
	if (StringUtils.hasText(msg) && args != null) {
	    if (args.length == 1)
		return msg.replace("{}", args[0]);
	    else {
		for (final String arg : args) {
		    if (arg != null) {
			msg = msg.replaceFirst(Pattern.quote("{}"), arg);
		    }
		}
		return msg;
	    }
	}

	return "";
    }

    /**
     * Elimina todos los bean de vista de sesión menos el del argumento.
     */
    @SuppressWarnings("rawtypes")
    public static void eliminarBeanSesion(Class bean) {
	FacesContext cx = FacesContext.getCurrentInstance();
	if (cx == null)
	    return;

	Map<String, Object> session = cx.getExternalContext().getSessionMap();

	for (Map.Entry<String, Object> entry : session.entrySet()) {
	    if (entry.getValue() instanceof SuperBean) {
		if (entry.getValue().getClass() != bean) {
		    session.remove(entry.getKey());
		}
	    }
	}
    }

    public static void descargarFichero(String nombre, byte[] fichero) {
	HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
	response.setContentType("application/force-download");
	response.addHeader("Content-Disposition", "attachment; filename=\"" + nombre + "\"");
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
	FacesContext.getCurrentInstance().responseComplete();
    }

}
