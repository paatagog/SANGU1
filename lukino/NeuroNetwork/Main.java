package lukino.NeuroNetwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		NeuronNetwork neuNet = new NeuronNetwork();
		Neuron neuron = new Neuron();
		List<Double> dlist = new ArrayList<Double>(Arrays.asList((double)1, (double)1, (double)0, (double)0, (double)1));
		List<Double> xlist = new ArrayList<Double>(Arrays.asList((double)0, (double)1, (double)2, (double)3, (double)4));
		List<Double> wlist = new ArrayList<Double>(Arrays.asList(Math.random(), Math.random(), Math.random(), Math.random(), Math.random()));
		List<Neuron> neuronList = new ArrayList<Neuron>();
		
		//pirveli shris neironebis inicializacia
			for(int j = 0; j < 5; j++){
				neuron = new Neuron();
				neuron.d = dlist.get(j);
				neuron.setX(xlist);
				neuron.setW(wlist);
				
				neuronList.add(neuron);
			}
			neuNet.layers.add(neuronList);
			neuronList.removeAll(neuronList);


		//danarcheni shreebis neironebis inicializacia
		for(int i = 1; i < 5; i++){
			
			//inicializacia, optimizaciistvis
			List<Double> yList = new ArrayList<Double>();
			for(int k = 0; k < 5; k++)
				yList.add(neuNet.layers.get(i-1).get(k).calculateY());
			
			for(int j = 0; j < 5; j++){
				neuron = new Neuron();
				neuron.d = dlist.get(j);
				neuron.setX(yList);
				neuron.setW(wlist);
				
				neuronList.add(neuron);
			}			
 
			neuNet.layers.add(neuronList);
			neuronList.removeAll(neuronList);
		}

		
		
		for(int i=0; i<neuNet.layers.get(4).size(); i++){
			Neuron neuronlast = neuNet.layers.get(4).get(i);
			System.out.println("d");
			System.out.println(neuronlast.d);
			System.out.println("y");
			System.out.println(neuronlast.calculateY());
		
		}
		//iwyeba mushaoba
		neuNet.deltaW();
	
		for(int i=0; i<neuNet.layers.get(4).size(); i++){
			Neuron neuronlast = neuNet.layers.get(4).get(i);
			System.out.println("d");
			System.out.println(neuronlast.d);
			System.out.println("y");
			System.out.println(neuronlast.calculateY());
		
		}
		
	}
}
