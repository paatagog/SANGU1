package lukino.NeuroNetwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainForVectors {

	public static void main(String[] args) {

		List<Double> d1list = new ArrayList<Double>(Arrays.asList((double)0.3, (double)0.2, (double)0.5, (double)0.4, (double)0.7));
		List<Double> x1list = new ArrayList<Double>(Arrays.asList((double)0.7, (double)0.6, (double)0.2, (double)0.3, (double)0.8));

		List<Double> d2list = new ArrayList<Double>(Arrays.asList((double)0.1, (double)0.3, (double)0.2, (double)0.5, (double)0.9));
		List<Double> x2list = new ArrayList<Double>(Arrays.asList((double)0.4, (double)0.5, (double)0.8, (double)0.9, (double)0.1));

		List<Double> d3list = new ArrayList<Double>(Arrays.asList((double)0.8, (double)0.7, (double)0.6, (double)0.1, (double)0.2));
		List<Double> x3list = new ArrayList<Double>(Arrays.asList((double)0.2, (double)0.6, (double)0.5, (double)0.4, (double)0.2));
		
		List<Integer> config = new ArrayList<Integer>(Arrays.asList(5, 5));
		
		NeuronNetwork neuNet = new NeuronNetwork();
		
		neuNet.InitilializeNetwork(config); 
		
		for (int i = 0; i < 6000; i++) {
			neuNet.LearnNetwork(x1list, d1list, true);
			neuNet.LearnNetwork(x2list, d2list, true);
			neuNet.LearnNetwork(x3list, d3list, true);
		}
				
	}
}
