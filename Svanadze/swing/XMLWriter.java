package Svanadze.swing;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class XMLWriter {

	public static void serialize(String fileName, StudentList students) throws Exception {
			File file = new File(fileName);
			JAXBContext jaxbContext = JAXBContext.newInstance(StudentList.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			jaxbMarshaller.marshal(students, file);
			jaxbMarshaller.marshal(students, System.out);
			System.out.println(" ");
	}
}
