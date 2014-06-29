package lukino.NeuroNetwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

		Double d = 0.5;
		
		//---
		List<Double> xlist1 = new ArrayList<Double>(Arrays.asList(
				(double)0.2, (double)0.2, (double)0.2, (double)0.2, (double)0.2, 
				(double)0.2, (double)0.2, (double)0.2, (double)0.2, (double)0.8, 
				(double)0.2, (double)0.2, (double)0.2, (double)0.8, (double)0.2,
				(double)0.2, (double)0.2, (double)0.8, (double)0.2, (double)0.2,
				(double)0.2, (double)0.2, (double)0.8, (double)0.2, (double)0.2
				));

		Double d1 = 0.7;

		//---
		List<Double> xlist2 = new ArrayList<Double>(Arrays.asList(
				(double)0.2, (double)0.2, (double)0.2, (double)0.8, (double)0.2, 
				(double)0.2, (double)0.2, (double)0.2, (double)0.8, (double)0.2, 
				(double)0.2, (double)0.2, (double)0.8, (double)0.2, (double)0.2,
				(double)0.2, (double)0.2, (double)0.8, (double)0.2, (double)0.2,
				(double)0.2, (double)0.2, (double)0.8, (double)0.2, (double)0.2
				));

		Double d2 = 0.6;

		//---
		List<Double> xlist3 = new ArrayList<Double>(Arrays.asList(
				(double)0.2, (double)0.2, (double)0.2, (double)0.2, (double)0.2, 
				(double)0.8, (double)0.2, (double)0.2, (double)0.2, (double)0.2, 
				(double)0.2, (double)0.8, (double)0.2, (double)0.2, (double)0.2,
				(double)0.2, (double)0.2, (double)0.8, (double)0.2, (double)0.2,
				(double)0.2, (double)0.2, (double)0.8, (double)0.2, (double)0.2
				));

		Double d3 = 0.3;

		//---
		List<Double> xlist4 = new ArrayList<Double>(Arrays.asList(
				(double)0.2, (double)0.8, (double)0.2, (double)0.2, (double)0.2, 
				(double)0.2, (double)0.8, (double)0.2, (double)0.2, (double)0.2, 
				(double)0.2, (double)0.2, (double)0.8, (double)0.2, (double)0.2,
				(double)0.2, (double)0.2, (double)0.8, (double)0.2, (double)0.2,
				(double)0.2, (double)0.2, (double)0.8, (double)0.2, (double)0.2
				));

		Double d4 = 0.4;

		//---
		List<Double> xlist5 = new ArrayList<Double>(Arrays.asList(
				(double)0.8, (double)0.2, (double)0.2, (double)0.2, (double)0.2, 
				(double)0.2, (double)0.8, (double)0.2, (double)0.2, (double)0.2, 
				(double)0.2, (double)0.2, (double)0.8, (double)0.2, (double)0.2,
				(double)0.2, (double)0.2, (double)0.8, (double)0.2, (double)0.2,
				(double)0.2, (double)0.2, (double)0.8, (double)0.2, (double)0.2
				));

		List<Integer> config = new ArrayList<Integer>(Arrays.asList(90, 10));

		NeuronNetwork neuNet = new NeuronNetwork();

		neuNet.InitilializeNetwork(config); 

		neuNet.SetRandomW(xlist.size());

		for (int i = 0; i < 16000; i++) {
			if(i != 15999){ // Dont Print ---
				neuNet.LearnNetwork(xlist, d, false);
				neuNet.LearnNetwork(xlist4, d4, false);
				neuNet.LearnNetwork(xlist1, d1, false);
				neuNet.LearnNetwork(xlist2, d2, false);
				neuNet.LearnNetwork(xlist3, d3, false);
				
			}else{ // Print ---
				neuNet.LearnNetwork(xlist, d, true);
				neuNet.LearnNetwork(xlist4, d4, true);
				neuNet.LearnNetwork(xlist1, d1, true);
				neuNet.LearnNetwork(xlist2, d2, true);
				neuNet.LearnNetwork(xlist3, d3, true);
				
			}
		}

		neuNet.ApplyX(xlist4);
		neuNet.PrintNeuron(false);

	}
}