package lukino.NeuroNetwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sun.org.apache.xml.internal.security.utils.ElementCheckerImpl.FullChecker;

public class Main {

	public static void main(String[] args) {

		//String s = "0.2 0.5;";
		List<Double> xlist = new ArrayList<Double>(Arrays.asList(
				(double)0.2, (double)0.2, (double)0.8, (double)0.2, (double)0.2, 
				(double)0.2, (double)0.2, (double)0.8, (double)0.2, (double)0.2, 
				(double)0.2, (double)0.2, (double)0.8, (double)0.2, (double)0.2,
				(double)0.2, (double)0.2, (double)0.8, (double)0.2, (double)0.2,
				(double)0.2, (double)0.2, (double)0.8, (double)0.2, (double)0.2
				));
		
		List<Double> dlist = new ArrayList<Double>(Arrays.asList(
				(double)0.5, (double)0.5, (double)0.5, (double)0.5, (double)0.5,
				(double)0.5, (double)0.5, (double)0.5, (double)0.5, (double)0.5,
				(double)0.5, (double)0.5, (double)0.5, (double)0.5, (double)0.5,
				(double)0.5, (double)0.5, (double)0.5, (double)0.5, (double)0.5,
				(double)0.5, (double)0.5, (double)0.5, (double)0.5, (double)0.5
				));
		
		List<Double> xlist1 = new ArrayList<Double>(Arrays.asList(
				(double)0.2, (double)0.2, (double)0.2, (double)0.2, (double)0.2, 
				(double)0.2, (double)0.2, (double)0.2, (double)0.2, (double)0.8, 
				(double)0.2, (double)0.2, (double)0.2, (double)0.8, (double)0.2,
				(double)0.2, (double)0.2, (double)0.8, (double)0.2, (double)0.2,
				(double)0.2, (double)0.2, (double)0.8, (double)0.2, (double)0.2
				));
		
		List<Double> dlist1 = new ArrayList<Double>(Arrays.asList(
				(double)0.9, (double)0.9, (double)0.9, (double)0.9, (double)0.9,
				(double)0.9, (double)0.9, (double)0.9, (double)0.9, (double)0.9,
				(double)0.9, (double)0.9, (double)0.9, (double)0.9, (double)0.9,
				(double)0.9, (double)0.9, (double)0.9, (double)0.9, (double)0.9,
				(double)0.9, (double)0.9, (double)0.9, (double)0.9, (double)0.9
				));
		
		List<Double> xlist2 = new ArrayList<Double>(Arrays.asList(
				(double)0.2, (double)0.2, (double)0.2, (double)0.8, (double)0.2, 
				(double)0.2, (double)0.2, (double)0.2, (double)0.8, (double)0.2, 
				(double)0.2, (double)0.2, (double)0.8, (double)0.2, (double)0.2,
				(double)0.2, (double)0.2, (double)0.8, (double)0.2, (double)0.2,
				(double)0.2, (double)0.2, (double)0.8, (double)0.2, (double)0.2
				));
		
		List<Double> dlist2 = new ArrayList<Double>(Arrays.asList(
				(double)0.7, (double)0.7, (double)0.7, (double)0.7, (double)0.7,
				(double)0.7, (double)0.7, (double)0.7, (double)0.7, (double)0.7,
				(double)0.7, (double)0.7, (double)0.7, (double)0.7, (double)0.7,
				(double)0.7, (double)0.7, (double)0.7, (double)0.7, (double)0.7,
				(double)0.7, (double)0.7, (double)0.7, (double)0.7, (double)0.7
				));
		
		List<Double> xlist3 = new ArrayList<Double>(Arrays.asList(
				(double)0.2, (double)0.2, (double)0.2, (double)0.2, (double)0.2, 
				(double)0.8, (double)0.2, (double)0.2, (double)0.2, (double)0.2, 
				(double)0.2, (double)0.8, (double)0.2, (double)0.2, (double)0.2,
				(double)0.2, (double)0.2, (double)0.8, (double)0.2, (double)0.2,
				(double)0.2, (double)0.2, (double)0.8, (double)0.2, (double)0.2
				));
		
		List<Double> dlist3 = new ArrayList<Double>(Arrays.asList(
				(double)0.1, (double)0.1, (double)0.1, (double)0.1, (double)0.1,
				(double)0.1, (double)0.1, (double)0.1, (double)0.1, (double)0.1,
				(double)0.1, (double)0.1, (double)0.1, (double)0.1, (double)0.1,
				(double)0.1, (double)0.1, (double)0.1, (double)0.1, (double)0.1,
				(double)0.1, (double)0.1, (double)0.1, (double)0.1, (double)0.1
				));
		
		List<Double> xlist4 = new ArrayList<Double>(Arrays.asList(
				(double)0.2, (double)0.8, (double)0.2, (double)0.2, (double)0.2, 
				(double)0.2, (double)0.8, (double)0.2, (double)0.2, (double)0.2, 
				(double)0.2, (double)0.2, (double)0.8, (double)0.2, (double)0.2,
				(double)0.2, (double)0.2, (double)0.8, (double)0.2, (double)0.2,
				(double)0.2, (double)0.2, (double)0.8, (double)0.2, (double)0.2
				));
		
		List<Double> dlist4 = new ArrayList<Double>(Arrays.asList(
				(double)0.3, (double)0.3, (double)0.3, (double)0.3, (double)0.3,
				(double)0.3, (double)0.3, (double)0.3, (double)0.3, (double)0.3,
				(double)0.3, (double)0.3, (double)0.3, (double)0.3, (double)0.3,
				(double)0.3, (double)0.3, (double)0.3, (double)0.3, (double)0.3,
				(double)0.3, (double)0.3, (double)0.3, (double)0.3, (double)0.3
				));
		
		List<Integer> config = new ArrayList<Integer>(Arrays.asList(25, 25));
		
		NeuronNetwork neuNet = new NeuronNetwork();
		
		neuNet.InitilializeNetwork(config); 
		
		for (int i = 0; i < 10000; i++) {
			if(i != 9999){ // Dont Print ---
				neuNet.LearnNetwork(xlist, dlist, false);
				neuNet.LearnNetwork(xlist1, dlist1, false);
				neuNet.LearnNetwork(xlist2, dlist2, false);
				neuNet.LearnNetwork(xlist3, dlist3, false);
				neuNet.LearnNetwork(xlist4, dlist4, false);
			}else{ // Print ---
				neuNet.LearnNetwork(xlist, dlist, true);
				neuNet.LearnNetwork(xlist1, dlist1, true);
				neuNet.LearnNetwork(xlist2, dlist2, true);
				neuNet.LearnNetwork(xlist3, dlist3, true);
				neuNet.LearnNetwork(xlist4, dlist4, true);
			}
			
			
		}
				
	}
}
