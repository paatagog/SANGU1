package lukino.NeuroNetwork;

import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;

public class NeuronNetwork {

	//Mtliani neironuli qseli
	public List<List<Neuron>> layers = new ArrayList<List<Neuron>>();

	//delta koeficientebis listi
	private List<List<Double>> deltas = new ArrayList<List<Double>>();

	//The answers which we want to get 
	private Double d;

	private double miu = 0.1;

	//set d list 
	private void setD(Double d) {
		this.d = d;
	}

	//Calculate Random Numbers And Set To Neuron
	public void SetRandomW(int numOfW){
		List<Double> wList;
		Neuron neuron;
		for (int i = 0; i < layers.size(); i++){
			for (int j = 0; j < layers.get(i).size(); j++){
				neuron = layers.get(i).get(j);
				wList = new ArrayList<Double>();
				if(i == 0){
					for (int k = 0; k < numOfW; k++){
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
			//Move on layers from behind
			layerDeltas = new ArrayList<Double>(); //satitao shristvis 

			for (int j = 0; j < layers.get(i).size(); j++){
				//Move on layer i's neurons  
				if (i == layers.size()-1){
					//Calculate deltas for last layer
					neuron = layers.get(i).get(j);
					double delta = (d - neuron.y) * neuron.fiDerivative(neuron.y); 
					layerDeltas.add(j, delta);
				} else {
					//Calculate deltas for all other layers, except the last layer
					neuron = layers.get(i).get(j);
					double delta = 0;

					for(int k = 0; k < layers.get(i+1).size(); k++){
						//Sum of next neuron ws and deltas multiplication
						Neuron nextNeuron = layers.get(i+1).get(k);
						delta += deltas.get(i+1).get(k) * nextNeuron.w.get(j); 
					}

					//Multiplicaton of sum and fiDerivative 
					delta *= neuron.fiDerivative(neuron.calculateY());
					//push delta in layerDeltas
					layerDeltas.add(j, delta);
				}
			}

			deltas.set(i, layerDeltas);

		}
	}

	
	//deltebis nazrdebis gamotvla da konkretuli neironistvis axali w-s dayeneba
	
	
	
	private void CalculateDeltaW(){
		Neuron neuron;
		List<Double> previousYList;

		for (int i = layers.size()-1; i >= 0; i--){
			//Move on layer form behind
			previousYList = new ArrayList<Double>();

			//collect ys of previous layer 
			if(i != 0)
				for(int p = 0; p < layers.get(i-1).size(); p++)
					previousYList.add(p, layers.get(i-1).get(p).y);

			for (int j = 0; j < layers.get(i).size(); j++){
				//Move on layer's neurons
				neuron = layers.get(i).get(j);

				if (i != 0){
					//Set new ws on j neuron 
					for (int k = 0; k < neuron.w.size(); k++){
						double delta = deltas.get(i).get(j);
						double deltaW = miu * delta * previousYList.get(k);

						neuron.w.set(k, neuron.w.get(k) + deltaW);
					}
				}
				else{
					//Set new ws on j neuron
					for (int k = 0; k < neuron.w.size(); k++){
						double x = layers.get(i).get(j).x.get(k);
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
		Double doubleZero;
		List<Neuron> neuronList;
		List<Double> layerDeltas;

		for (int i = 0; i < config.size(); i++){
			neuronList = new ArrayList<Neuron>();
			layerDeltas = new ArrayList<Double>();

			for (int j = 0; j < config.get(i); j++){
				neuron = new Neuron();
				doubleZero = new Double(0);
				neuronList.add(neuron);
				layerDeltas.add(doubleZero);
			}
			
			layers.add(neuronList);
			deltas.add(layerDeltas);
		}
	}

	
	
	public void ApplyX(List<Double> x){
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

	public void PrintNeuron(boolean printD){
		int lastLayerNumber = layers.size() - 1;
		DecimalFormat df = new DecimalFormat("#.######");

		for(int j = 0; j < layers.get(lastLayerNumber).size(); j++){
			Neuron neuronlast = layers.get(lastLayerNumber).get(j);
			if(printD)
				System.out.println("d = " + d);
			System.out.println("y = " + df.format(neuronlast.calculateY()));
		}

//		Neuron neuronlast = layers.get(lastLayerNumber).get(0);
//		System.out.println("d = " + d.get(0));
//		System.out.println("y = " + df.format(neuronlast.calculateY()));

		System.out.println("--------------------------------------------");
	}

	//Learn
	public void LearnNetwork(List<Double> x, Double d, boolean print){
		//Fill Network With Parameters
		setD(d);
		ApplyX(x);

		//PrintNeuron();

		for(int i =0 ; i < 1; i++){
			//Start Calculating New Weights
			CalculateDeltas();
			CalculateDeltaW();
		}
		if (print){
			PrintNeuron(true);
		}
	}

}