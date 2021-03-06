package lukino.NeuroNetwork;

import java.util.List;

public class Neuron {

	public double y;
	public List<Double> w;
	public List<Double> x;
	
	public double calculateY(){
		double sum = 0;
		for(int i=0; i<x.size();i++){
			sum += x.get(i) * w.get(i);
		}
		
		y = fi(sum);
		return y;
	}
	
	public double fi(double a){
		return (1/(1+(Math.exp(-a))));
	}
	public double fiDerivative(double a){
		double f = fi(a);
		return (f / (1-f));
	}
	
	public List<Double> getW() {
		return w;
	}
	public void setW(List<Double> w) {
		this.w = w;
	}
	public List<Double> getX() {
		return x;
	}
	public void setX(List<Double> x) {
		this.x = x;
	}
}
