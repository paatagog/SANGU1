package lukino.NeuroNetwork;

import java.util.ArrayList;
import java.util.List;

public class NeuronNetwork {

	//Mtliani neironuli qseli
	public List<List<Neuron>> layers = new ArrayList<List<Neuron>>();
	
	//delta koeficientebis listi
	private List<List<Double>> deltas = new ArrayList<List<Double>>();
	
	private double miu = 0.5;
	
	//deltebis gamotvla
	private void delta(){
		Neuron neuron;
		
		for (int i = layers.size()-1; i >= 0; i--){
			//Davdivart Shreebze bolodan
			List<Double> layerDeltas = new ArrayList<Double>(); //satitao shristvis 
			
			for (int j = 0; j < layers.get(i).size(); j++){
				//davdivart i shris neironebze 
				if (i == layers.size()-1){
					//bolo shristvis deltebis gamotvla da layerDeltas-shi chayra
					neuron = layers.get(i).get(j);
					double delta = neuron.e() * neuron.fiDerivative(neuron.calculateY()); 
					layerDeltas.add(j, delta);
				}
				else{
					//deltebis gamotvla sxva danarcheni shreebistvis
					neuron = layers.get(i).get(j);
					double delta = 0;
					
					for(int k = 0; k < layers.get(i+1).size(); k++){
						//jami shedegi neironebis w-ebis da deltebis namravlebis
						Neuron nextNeuron = layers.get(i+1).get(k);
						delta += deltas.get(i+1).get(k) * nextNeuron.w.get(j); 
					}
					
					//jami mravldeba fi-s warmoebulze
					delta *= neuron.fiDerivative(neuron.calculateY());
					//delta vardeba layerDeltas listshi 
					layerDeltas.add(j, delta);
				}
			}
			//konkretuli i-uri shris deltebis gadayra deltas listshi da layerDeltas listis gasuftaveba
			deltas.add(i, layerDeltas);
			layerDeltas.clear();
		}
	}
	
	//deltebis nazrdebis gamotvla da konkretuli neironistvis axali w-s dayeneba
	public void deltaW(){
		delta();
		
		Neuron neuron;
		for (int i = layers.size()-1; i >= 0; i--){
			//davdivart shreebze bolodan
			List<Double> previousYList = new ArrayList<Double>();
			
			//optimizaciistvis wina shris yebis listshi chayra, roms satitao neironistvis erti da igive ar xdebodes 
			if(i != 0)
				for(int p = 0; p < layers.get(i-1).size(); p++)
					previousYList.add(p, layers.get(i-1).get(p).calculateY());
			
			for (int j = 0; j < layers.get(i).size(); j++){
				//shris neironebze chamovla
				neuron = layers.get(i).get(j);
				
				if (i != 0){
					//konkretuli j neironis wonebze chamovla da axali wonis dayeneba
					for (int k = 0; k < neuron.w.size(); k++){
						double delta = deltas.get(i).get(j);
						double deltaW = miu * delta * previousYList.get(k);
						
						neuron.w.set(k, neuron.w.get(k) + deltaW);
					}
				}
				else{
					//konkretuli j neironis wonebze chamovla da axali wonis dayeneba
					for (int k = 0; k < neuron.w.size(); k++){
						double x = layers.get(i).get(j).x.get(i);
						double delta = deltas.get(i).get(j);
						double deltaW = miu * delta * x;
						
						neuron.w.set(k, neuron.w.get(k) + deltaW);
					}
				}
			}
			
			previousYList.clear();
		}
	}

}
