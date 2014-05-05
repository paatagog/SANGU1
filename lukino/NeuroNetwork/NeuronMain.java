package lukino.NeuroNetwork;

import java.util.ArrayList;
import java.util.List;

public class NeuronMain {

	public double mistakeEnergy(List<Neuron> layerList){
		double eps = 0;
		for (Neuron neuron : layerList){
			double e = neuron.e();
			eps += (e * e);
		}
		
		return eps * 0.5;
	}
	
	public double delta(List<Neuron> layerList){
		double eps = 0;
		for (Neuron neuron : layerList){
			double e = neuron.e();
			eps += (e * e);
		}
		
		return eps * 0.5;
	}

	public double deltaW(List<Neuron> layerList){
		double y = layerList.get(1).calculateY();
		double delta = delta(layerList);
		
		return (delta * y * 0.5);
	}
	
	
	public static void main(String[] args) {
		//double random = Math.random() * 5 + 1;

	}

}
