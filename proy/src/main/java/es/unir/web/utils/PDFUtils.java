package es.unir.web.utils;

import https.infocentre_gsm_org.tadig_raex_ir21.TADIGRAEXIR21;
import https.infocentre_gsm_org.tadig_raex_ir21.TADIGRAEXIR21.OrganisationInfo.NetworkList.Network;
import https.infocentre_gsm_org.tadig_raex_ir21.TADIGRAEXIR21.OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries;
import https.infocentre_gsm_org.tadig_raex_ir21.TADIGRAEXIR21.OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.MSISDNNumberRanges;
import https.infocentre_gsm_org.tadig_raex_ir21.TADIGRAEXIR21.OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.MSISDNNumberRanges.RangeData;
import https.infocentre_gsm_org.tadig_raex_ir21.TADIGRAEXIR21.OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.MSRNNumberRanges.NumberRange;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import es.unir.web.dao.RepositorioDAO;

public class PDFUtils {
    
    private static final Logger log = Logger.getLogger(PDFUtils.class);

    static float cont = 0f;
    static int i = 0;
    static PDPage page = null;
    static PDFont fontdefault = PDType1Font.HELVETICA_BOLD;

    static PDPageContentStream content = null;
    static PDDocument doc = null;

    public static String IR21_OPERADORA = "OPERADORA";
    public static String IR21_PAIS = "PAIS";
    public static String IR21_CREATIONDATE = "CREATIONDATE";
    public static String IR21_COUNTRY_INITIALS = "COUNTRY_INITIALS";
    public static String IR21_SCHEMA = "SCHEMA";
    public static String IR21_GEN_SCHEMA = "SCHEMA";
    public static String IR21_TADIG = "TADIG";
    public static String IR21_NET_TYPE = "NETTYPE";
    public static String IR21_COLOUR = "COLOR_CODE";

    public static String IR21_MSRN = "MSRN";
    public static String IR21_MSISDN = "MSISDN";

    // TADIG: NORTM
    // Network Type Terrestrial
    // Presentation of country initials and MNN:
    // Abbreviated MNN: 0
    // Network colour code: 0

    public static void exportarPDF(TADIGRAEXIR21 ir21, String operadora, String pais, String path) {
	Map<String, Object> valores = new HashMap<String, Object>(50);
	valores.put(IR21_OPERADORA, ir21.getOrganisationInfo().getOrganisationName());
	valores.put(IR21_PAIS, pais);
	valores.put(IR21_COUNTRY_INITIALS, ir21.getOrganisationInfo().getCountryInitials());

	valores.put(IR21_CREATIONDATE, ir21.getRAEXIR21FileHeader().getFileCreationTimestamp().toString());

	valores.put(IR21_SCHEMA, "" + ir21.getRAEXIR21FileHeader().getTADIGRAEXIR21SchemaVersion());
	valores.put(IR21_GEN_SCHEMA, "" + ir21.getRAEXIR21FileHeader().getTADIGGenSchemaVersion());

	List<Network> network = ir21.getOrganisationInfo().getNetworkList().getNetwork();
	int tadig = network.size();

	List<Object> netList = new ArrayList<Object>(tadig);
	for (Network net : network) {
	    Map<String, Object> map = new HashMap<String, Object>();
	    map.put(IR21_TADIG, net.getTADIGCode());
	    map.put(IR21_NET_TYPE, net.getNetworkType());
	    map.put(IR21_COLOUR, net.getNetworkColourCode());

	    // MSRN
	    CCITTE164NumberSeries e164 = net.getNetworkData().getRoutingInfoSection().getCCITTE164NumberSeries();
	    List<NumberRange> msrn = e164.getMSRNNumberRanges().getNumberRange();
	    String[][] contMsrn = new String[msrn.size()][4];
	    for (int i = 0; i < msrn.size(); i++) {
		String start = msrn.get(i).getSNRange() == null ? "" : "" + msrn.get(i).getSNRange().getSNRangeStart();
		String end = msrn.get(i).getSNRange() == null ? "" : "" + msrn.get(i).getSNRange().getSNRangeStop();
		String[] arr = { "" + msrn.get(i).getCC(), "" + msrn.get(i).getNDC(), start, end };
		contMsrn[i] = arr;
	    }
	    map.put(IR21_MSRN, contMsrn);

	    // MSDN
	    MSISDNNumberRanges msisdn = net.getNetworkData().getRoutingInfoSection().getCCITTE164NumberSeries().getMSISDNNumberRanges();
	    if (msisdn != null) {
		if (msisdn.getRangeData() != null) {
		    String[][] contMSDN = new String[msisdn.getRangeData().size()][4];
		    List<RangeData> range = msisdn.getRangeData();
		    for (int i = 0; i < range.size(); i++) {
			String cc = "" + range.get(i).getNumberRange().getCC();
			String ndc = "" + range.get(i).getNumberRange().getNDC();
			String start = range.get(i).getNumberRange().getSNRange() != null ? range.get(i).getNumberRange().getSNRange().getSNRangeStart() : "";
			String end = range.get(i).getNumberRange().getSNRange() != null ? "" + range.get(i).getNumberRange().getSNRange().getSNRangeStop() : "";
			String[] arr = { cc, ndc, start, end };
			contMSDN[i] = arr;
		    }
		    map.put(IR21_MSISDN, contMSDN);
		}
	    }

	    netList.add(map);

	    valores.put(IR21_TADIG, netList);
	}

	doc = new PDDocument();
	exportarPDF(valores);
	try {
	    doc.save(path);
	} catch (IOException e) {
	    log.error(e.getMessage());
	    e.printStackTrace();
	}
	try {
	    doc.close();
	} catch (IOException e) {
	    log.error(e.getMessage());
	    e.printStackTrace();
	}
    }

    public static void exportarPDF(Map<String, Object> valores) {
	crearPagina();

	escribirLinea(fontdefault, 20, 40f, "IR21");
	dibujarLinea();

	escribirLinea("");
	escribirLinea("");

	escribirLinea("Operadora: " + valores.get(IR21_OPERADORA));
	escribirLinea("País: " + valores.get(IR21_PAIS));
	escribirLinea("");
	escribirLinea(fontdefault, 12, 30f, "RAEX IR. 21 Information");
	escribirLinea("");
	escribirLinea("Creation Date: " + valores.get(IR21_CREATIONDATE));
	escribirLinea("TADIG-GEN schema version: " + valores.get(IR21_GEN_SCHEMA));
	escribirLinea("");
	List<Object> netList = (List<Object>) valores.get(IR21_TADIG);
	if (netList != null) {
	    for (Object o : netList) {
		
		escribirLinea("");

		Map<String, Object> map = (Map<String, Object>) o;
		
		escribirLinea("TADIG: " + map.get(IR21_TADIG));
		escribirLinea("Network Type: " + map.get(IR21_NET_TYPE));
		
		escribirLinea("");
		
		escribirLinea("MSISDN:");
		escribirLinea("");
		
		if (map.get(IR21_MSISDN) != null) {
		    String[][] msisdn = (String[][]) map.get(IR21_MSISDN);
		    String[][] cabecera = { { "CC", "NDC", "Start", "Stop" } };
		    try {
			tabla(50, cabecera);
			tabla(50, msisdn);
		    } catch (IOException e) {
			log.error(e.getMessage());
			e.printStackTrace();
		    }
		}
	    }
	}

	try {
	    content.close();
	} catch (IOException e) {
	    log.error(e.getMessage());
	    e.printStackTrace();
	}

    }

    public static PDPageContentStream crearPagina() {
	page = new PDPage();
	doc.addPage(page);
	if (content != null) {

	    try {
		content.close();
	    } catch (IOException e) {
		log.error(e.getMessage());
		e.printStackTrace();
	    }

	}
	content = null;
	try {
	    content = new PDPageContentStream(doc, page);
	    content.setLeading(14.5f);
	    content.setFont(fontdefault, 10);
	    content.beginText();
	    content.moveTextPositionByAmount(50, 750);
	    content.endText();
	} catch (IOException e1) {
	    log.error(e1.getMessage());
	    e1.printStackTrace();
	}

	PDRectangle mediabox = page.getMediaBox();
	float margen = 30;
	float ancho = mediabox.getWidth() - 2 * margen;
	float x = mediabox.getLowerLeftX() + margen;
	float y = mediabox.getUpperRightY() - margen;
	cont = y;

	return content;
    }

    private static void dibujarLinea() {
	try {
	    content.drawLine(50, cont - 10, 500, cont - 10);
	} catch (IOException e2) {
	    log.error(e2.getMessage());
	    e2.printStackTrace();
	}
    }

    static void escribirLinea(String contenido) {
	escribirLinea(fontdefault, 10, 14.5f, contenido);
    }

    static void escribirLinea(PDFont font, int sizeFont, float size, String contenido) {
	if (cont > size) {
	    try {
		content.setLeading(size);
		content.setFont(font, sizeFont);
		content.beginText();
		content.newLine();
		content.moveTextPositionByAmount(50, cont);
		content.drawString(contenido);
		content.endText();
	    } catch (IOException e) {
		log.error(e.getMessage());
		e.printStackTrace();
	    }
	    cont = cont - size;
	} else {
	    crearPagina();
	    escribirLinea(font, sizeFont, size, contenido);
	}

    }

    public static void tabla(float margen, String[][] contenido) throws IOException {
	int cols = contenido[0].length;
	for (int i = 0; i < contenido.length; i++) {
	    if (cont > 20f) {
		float y = cont;
		tabla(cols, y, margen, contenido[i]);
	    } else {
		crearPagina();
		float y = cont;
		tabla(cols, y, margen, contenido[i]);
	    }
	    cont = cont - 20f;
	}
    }

    public static float tabla(int cols, float y, float margen, String[] contenido) throws IOException {
	float filaAltura = 20f;
	float anchoTabla = page.getCropBox().getWidth() - margen - margen;
	float tablaAltura = filaAltura;
	float anchoColumna = anchoTabla / (float) cols;
	float celdaMargen = 5f;

	float nexty = y;
	for (int i = 0; i <= 1; i++) {
	    content.drawLine(margen, nexty, margen + anchoTabla, nexty);
	    nexty -= filaAltura;
	}

	float nextx = margen;
	for (int i = 0; i <= cols; i++) {
	    content.drawLine(nextx, y, nextx, y - tablaAltura);
	    nextx += anchoColumna;
	}

	content.setFont(PDType1Font.HELVETICA_BOLD, 10);

	float textx = margen + celdaMargen;
	float texty = y - 15;
	for (int j = 0; j < contenido.length; j++) {
	    String text = contenido[j];
	    content.beginText();
	    content.moveTextPositionByAmount(textx, texty);
	    content.drawString(text);
	    content.endText();
	    textx += anchoColumna;
	}
	textx = margen + celdaMargen;

	return textx;
    }

}
