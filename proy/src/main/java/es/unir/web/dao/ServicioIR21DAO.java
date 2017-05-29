package es.unir.web.dao;

import https.infocentre_gsm_org.tadig_raex_ir21.TADIGRAEXIR21;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class ServicioIR21DAO implements Serializable {

    private static final long serialVersionUID = 603531139172302760L;

    private final Logger log = Logger.getLogger(ServicioIR21DAO.class);

    private HibernateTemplate hibernateTemplate;

    public void setSessionFactory(final SessionFactory sessionFactory) {
	hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

    public TADIGRAEXIR21 procesarIR21(String rutaIR21) throws Exception {

	JAXBContext jc = null;
	try {
	    jc = JAXBContext.newInstance(TADIGRAEXIR21.class);
	} catch (JAXBException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	Unmarshaller unmarshaller = null;
	try {
	    unmarshaller = jc.createUnmarshaller();
	} catch (JAXBException e) {
	   throw new Exception("Error al procesar el fichero. El fichero IR21 no es válido.");
	}
	
	TADIGRAEXIR21 fosterHome = null;
	try {
	     fosterHome = (TADIGRAEXIR21) unmarshaller.unmarshal(new File(rutaIR21));
	} catch (JAXBException e) {
	    e.printStackTrace();
	    throw new Exception("Error al procesar el fichero. El fichero IR21 no es válido.");
	}

	return fosterHome;

//	FileOutputStream fout = new FileOutputStream("test.ser");
//	ObjectOutputStream oos = new ObjectOutputStream(fout);
//	oos.writeObject(fosterHome);
//
//	InputStream file = new FileInputStream("test.ser");
//	InputStream buffer = new BufferedInputStream(file);
//	ObjectInput input = new ObjectInputStream(buffer);
//
//	TADIGRAEXIR21 a = (TADIGRAEXIR21) input.readObject();
//
//	Marshaller marshaller = jc.createMarshaller();
//	marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//	marshaller.marshal(fosterHome, System.out);

    }

}
