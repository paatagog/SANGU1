package Svanadze.neuronnetwork;

import java.util.ArrayList;
import java.util.List;

public class NeuronMain {
	public static void main(String[] args) {
		Neuron neuron = new Neuron();
		NeuronNetwork neuronNetwork = new NeuronNetwork();
		
		List<Double> w = new ArrayList<Double>();
		w.add(1.5);
		w.add(2.0);
		w.add(1.0);
		w.add(2.0);
		w.add(1.0);
		w.add(2.0);
		
		List<Double> x = new ArrayList<Double>();
		x.add(1.0);
		x.add(3.4);
		x.add(-2.3);
		x.add(1.0);
		x.add(0.0);
		x.add(2.0);
		
		neuron.setW(w);
		neuron.setX(x);
		neuron.setD(5);
		
		System.out.println(neuronNetwork.deltaWithW()); 
	}
}
