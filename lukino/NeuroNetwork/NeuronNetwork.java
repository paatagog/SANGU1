package lukino.NeuroNetwork;

import java.util.ArrayList;
import java.util.List;

public class NeuronNetwork {

	List<List<Neuron>> layers = new ArrayList<List<Neuron>>();
	List<List<Double>> deltas = new ArrayList<List<Double>>();
	List<List<Double>> ws = new ArrayList<List<Double>>();
	
	double miu = 0.5;
	
	public void delta(){
		for (int i = layers.size()-1; i >= 0; i--){
			List<Double> layerDeltas = new ArrayList<Double>();
			for (int j = 0; j < layers.get(i).size(); j++){
				if (i == layers.size()-1){
					Neuron neuron = layers.get(i).get(j);
					double delta = neuron.e() * neuron.fiDerivative(neuron.calculateY()); 
					layerDeltas.add(j, delta);
				}
				else{
					Neuron neuron = layers.get(i).get(j);
					double delta = 0;
					
					for(int k = 0; k < layers.get(i+1).size(); k++){
						Neuron nextNeuron = layers.get(i+1).get(k);
						delta = deltas.get(i+1).get(k) * nextNeuron.w.get(j); 
					}
					
					delta = neuron.fiDerivative(neuron.calculateY()); 
					layerDeltas.add(j, delta);					
				}
			}
			deltas.add(i, layerDeltas);
			layerDeltas.clear();
		}
		
	}
	
	public void deltaW(){
		delta();
		
		for (int i = layers.size()-1; i >= 0; i--){
			List<Double> deltaWs = new ArrayList<Double>();
			for (int j = 0; j < layers.get(i).size(); j++){
				if (i != 0){
					double prevNeironY = layers.get(i-1).get(j).calculateY();
					double delta = deltas.get(i).get(j);
					double deltaW = miu * delta * prevNeironY;
					
					deltaWs.add(deltaW);
				}
				else{
					double x = layers.get(i).get(j).x.get(i);
					double delta = deltas.get(i).get(j);
					double deltaW = miu * delta * x;
					
					deltaWs.add(deltaW);
				}
			}
			ws.add(i, deltaWs);
			deltaWs.clear();
		}
		
		
	}


}
