package gogishvili.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JaxbTest {
	
	private static final String FILE_NAME = "d:/object.xml"; 
	
	private static void serialize(Student s) {
		try {

			File file = new File(FILE_NAME);
			JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(s, file);
			jaxbMarshaller.marshal(s, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
	
	private static Student deserialize(String fileName) {
		Student s = null;
		try {
			File file = new File(fileName);
			JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			s = (Student) jaxbUnmarshaller.unmarshal(file);
			System.out.println(s);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return s;
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.setFirstName("Giorgi");
		s.setLastName("Giorgadze");
		s.setAge(19);
		s.setSex(Sex.MALE);
		serialize(s);
		s = deserialize(FILE_NAME);
	}
}
