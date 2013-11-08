package gogishvili.simpleprograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {
	
	public static void main(String[] args) {
		Map<Integer, String> m = new LinkedHashMap <Integer, String>();
		m.put(1234, "paata");
		m.put(5467, "luka");
		m.put(4345, "nika");
		
		for (Map.Entry<Integer, String> e : m.entrySet()) {
		    System.out.println(e.getKey() + " - " + e.getValue());
		}
	}

}
