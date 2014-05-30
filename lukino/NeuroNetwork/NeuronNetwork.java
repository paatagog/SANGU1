package lukino.NeuroNetwork;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class NeuronNetwork {

	//Mtliani neironuli qseli
	public List<List<Neuron>> layers = new ArrayList<List<Neuron>>();
	
	//delta koeficientebis listi
	private List<List<Double>> deltas = new ArrayList<List<Double>>();
	
	//The answers which we want to get 
	private List<Double> d = new ArrayList<Double>();
	
	private double miu = 0.5;
	
	//set d list 
	private void setD(List<Double> d) {
		this.d = d;
	}

	//Calculate Random Numbers And Set To Neuron
	private void SetRandomW(){
		List<Double> wList;
		Neuron neuron;
		for (int i = 0; i < layers.size(); i++){
			for (int j = 0; j < layers.get(i).size(); j++){
				neuron = layers.get(i).get(j);
				wList = new ArrayList<Double>();
				if(i == 0){
					for (int k = 0; k < layers.get(i).size(); k++){
						wList.add(Math.random());
					}
				}
				else{
					for (int k = 0; k < layers.get(i-1).size(); k++){
						wList.add(Math.random());
					}
				}
				
				neuron.setW(wList);
			}
		}
	} 
	
	//deltebis gamotvla
	private void CalculateDeltas(){
		Neuron neuron;
		List<Double> layerDeltas;
		
		for (int i = layers.size()-1; i >= 0; i--){
			//Davdivart Shreebze bolodan
			layerDeltas = new ArrayList<Double>(); //satitao shristvis 
			
			for (int j = 0; j < layers.get(i).size(); j++){
				//davdivart i shris neironebze 
				if (i == layers.size()-1){
					//bolo shristvis deltebis gamotvla da layerDeltas-shi chayra
					neuron = layers.get(i).get(j);
					double delta = (d.get(j) - neuron.y) * neuron.fiDerivative(neuron.calculateY()); 
					layerDeltas.add(j, delta);
				}
				else{
					//deltebis gamotvla sxva danarcheni shreebistvis
					neuron = layers.get(i).get(j);
					double delta = 0;
					
					for(int k = 0; k < layers.get(i).get(j).w.size(); k++){
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

		}
	}
	
	//deltebis nazrdebis gamotvla da konkretuli neironistvis axali w-s dayeneba
	private void CalculateDeltaW(){
		Neuron neuron;
		List<Double> previousYList;
		
		for (int i = layers.size()-1; i >= 0; i--){
			//davdivart shreebze bolodan
			previousYList = new ArrayList<Double>();
			
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
			
		}
	}

	//initialize Empty Network
	public void InitilializeNetwork(List<Integer> config){
		Neuron neuron;
		List<Neuron> neuronList;
		List<Double> layerDeltas;
		
		for (int i = 0; i < config.size(); i++){
			neuronList = new ArrayList<Neuron>();
			layerDeltas = new ArrayList<Double>();
			
			for (int j = 0; j < config.get(i); j++){
				neuron = new Neuron();
				neuronList.add(neuron);
				layerDeltas.add(0.0);
			}
			layers.add(neuronList);
			deltas.add(layerDeltas);
		}
		
		//Fill Network With Random Ws
		SetRandomW();
	}

	private void ApplyX(List<Double> x){
		Neuron neuron;
		
		//pirveli shris neironebis inicializacia
		for(int j = 0; j < layers.get(0).size(); j++){
			neuron = layers.get(0).get(j);
			neuron.setX(x);
		}
		

		//danarcheni shreebis neironebis inicializacia
		for(int i = 1; i < layers.size(); i++){
			//inicializacia, optimizaciistvis
			List<Double> yList = new ArrayList<Double>();
			for(int k = 0; k < layers.get(i-1).size(); k++)
				yList.add(layers.get(i-1).get(k).calculateY());
			
			for(int j = 0; j < layers.get(i).size(); j++){
				neuron = layers.get(i).get(j);
				neuron.setX(yList);
				
				if (i == layers.size()-1){
					layers.get(i).get(j).calculateY();
				}

			}			
		}
	}
	
	private void PrintNeuron(){
		int lastLayerNumber = layers.size() - 1;

		DecimalFormat df = new DecimalFormat("#.####");
		
		for(int j = 0; j < layers.get(lastLayerNumber).size(); j++){
			Neuron neuronlast = layers.get(lastLayerNumber).get(j);
			System.out.println("d = " + d.get(j));
			System.out.println("y = " + df.format(neuronlast.calculateY()));
		}
		System.out.println("--------------------------------------------");
	}
	
	//Learn
	public void LearnNetwork(List<Double> x, List<Double> d){
		//Fill Network With Parameters
		setD(d);
		ApplyX(x);
		
		PrintNeuron();
		
		for(int i =0 ; i< 1; i++){
			//Start Calculating New Weights
			CalculateDeltas();
			CalculateDeltaW();
		}
		PrintNeuron();
	}
	
}
