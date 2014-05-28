package lukino.NeuroNetwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Double> dlist = new ArrayList<Double>(Arrays.asList((double)0.2, (double)0.4, (double)0.8, (double)0.7, (double)0.1));
		List<Double> xlist = new ArrayList<Double>(Arrays.asList((double)0.5, (double)0.3, (double)0.1, (double)0.8, (double)0.6));
		
		List<Integer> config = new ArrayList<Integer>(Arrays.asList(5, 5, 5, 5, 5));
		
		NeuronNetwork neuNet = new NeuronNetwork();
		
		neuNet.InitilializeNetwork(config);
		
		neuNet.LearnNetwork(xlist, dlist);
		
		
	}
}
