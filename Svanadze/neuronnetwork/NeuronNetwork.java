package Svanadze.neuronnetwork;

public class NeuronNetwork {
	public Neuron neuron = new Neuron();
		
	public double sum(){
		double sum = 0;
		for(int i = 0; i < neuron.getW().size(); i++){
			sum += neuron.getX().get(i) * neuron.getW().get(i);
		}
		return sum;
	}
	
	public double delta(){
		double e = neuron.getD() - neuron.calculateY();
		double s = sum();
		return e * Neuron.fiDerivative(s);
	}
	
	public double deltaWithW(){
		double delta = delta();
		double s = sum();
		double sum = 0;
		for(double k : neuron.getW()){
			sum += delta * k;
		}
		return Neuron.fiDerivative(s) * sum;
	}
}
