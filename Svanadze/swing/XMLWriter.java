package Svanadze.swing;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class XMLWriter {

	public static void serialize(Student st) {
		try {

			File file = new File(FileReadWrite.FILE_NAME);
			JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(st, file);
			jaxbMarshaller.marshal(st, System.out);
			System.out.println(" ");

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
