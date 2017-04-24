package https.infocentre_gsm_org.tadig_raex_ir21;

import java.io.StringWriter;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Test {

    public static void main(String[] args) throws Exception {
	
	for(int i = 0; i < 40; i++){
	System.out.println(new Date());
//        JAXBContext jc = JAXBContext.newInstance(TADIGRAEXIR21.class);

//        Unmarshaller unmarshaller = jc.createUnmarshaller();
//        TADIGRAEXIR21 fosterHome = (TADIGRAEXIR21) unmarshaller.unmarshal(new File("NewFile.xml"));
//
//        System.out.println(new Date());
//        
//        FileOutputStream fout = new FileOutputStream("test.ser");
//        ObjectOutputStream oos = new ObjectOutputStream(fout);
//        oos.writeObject(fosterHome);
//
//     
//        	      InputStream file = new FileInputStream("test.ser");
//        	      InputStream buffer = new BufferedInputStream(file);
//        	      ObjectInput input = new ObjectInputStream (buffer);
//        
//        	      //deserialize the List
//        	      System.out.println(new Date());
//        	      System.out.println("DESERIALIZAR");
//            TADIGRAEXIR21 a = (TADIGRAEXIR21)input.readObject();
//            System.out.println(new Date());
        	      //display its data
        
//        Marshaller marshaller = jc.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//        marshaller.marshal(fosterHome, System.out);
//        System.out.println(new Date());
            
            
            
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            org.w3c.dom.Document doc = builder.parse("NewFile.xml");

//            NodeList childNodes = doc.getChildNodes();
//            childNodes = childNodes.item(1).getChildNodes();
//            childNodes = childNodes.item(3).getChildNodes();
//            Node nodo = childNodes.item(3);
//            System.out.println(nodo.getNodeName());
//            for (int i = 0; i < childNodes.getLength(); i++) {
//        	System.out.println(i);
//		Node item = childNodes.item(i);
//			System.out.println(item.getNodeName());
//            	}
            
            
            XPathFactory xPathfactory = XPathFactory.newInstance();
            javax.xml.xpath.XPath xpath = xPathfactory.newXPath();
//            XPathExpression expr = xpath.compile("/tadig-raex-21:TADIGRAEXIR21/OrganisationInfo/OrganisationName/*");
//            XPathExpression expr = xpath.compile("/*[name()='tadig-raex-21:TADIGRAEXIR21']/OrganisationInfo[CountryInitials='*P']/OrganisationName");
            XPathExpression expr = xpath.compile("/*[name()='tadig-raex-21:TADIGRAEXIR21']/OrganisationInfo[contains (CountryInitials, 'P')]/CountryInitials");
            NodeList nl = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
            System.out.println(nodeToString(  nl.item(0)));
//            printXpathResult(nl);
            System.out.println(expr.evaluate(doc, XPathConstants.STRING));
            System.out.println(new Date());
            doc = null;
	}
    }
    
    public static void printXpathResult(Object result){
        NodeList nodes = (NodeList) result;
        for (int i = 0; i < nodes.getLength(); i++) {
            System.out.println(nodes.item(i).getNodeValue());
        }
    }
    private static String nodeToString(Node node) {
	    StringWriter sw = new StringWriter();
	    try {
	      Transformer t = TransformerFactory.newInstance().newTransformer();
//	      t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
	      t.setOutputProperty(OutputKeys.INDENT, "yes");
	      t.transform(new DOMSource(node), new StreamResult(sw));
	    } catch (TransformerException te) {
	      System.out.println("nodeToString Transformer Exception");
	    }
	    return sw.toString();
	  }

	}


