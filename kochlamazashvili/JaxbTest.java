package kochlamazashvili;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JaxbTest {
	
	private static final String FILE_NAME = "d:/object.xml"; 
	
	private static void serialize(News s) {
		try {

			File file = new File(FILE_NAME);
			JAXBContext jaxbContext = JAXBContext.newInstance(News.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(s, file);
			jaxbMarshaller.marshal(s, System.out);
			System.out.println(" ");

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
	
	private static News deserialize(String fileName) {
		News s = null;
		try {
			File file = new File(fileName);
			JAXBContext jaxbContext = JAXBContext.newInstance(News.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			s = (News) jaxbUnmarshaller.unmarshal(file);
			System.out.println(s);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return s;
	}

	public static void main(String[] args) {
		News n = new News();
		n.setDate(new Date());
		n.setTitle("ვილნიუსის სამიტი <");
		n.setContent("ხელი მოეწერა მნიშვნელოვან დოკუმენტს");
		
		serialize(n);
		n = deserialize(FILE_NAME);
	}
}
