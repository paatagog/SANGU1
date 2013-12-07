import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

		
public class I24T8877910 {
	public static void main(String[] args){
		List<String> l = new ArrayList<String> ();
		l.add("-777");
		l.add("-888");
		l.add("-999");
		l.add("-777");
		Set<String> s = new HashSet<String> ();
		s.add("777");
		s.add("888");
		s.add("777");
		s.add("999");
		s.add("888");
		if(s.size() > l.size()){
			System.out.print(1);
		}
		System.out.println(s.size() > l.size());
	}
}
