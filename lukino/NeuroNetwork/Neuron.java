package lukino.NeuroNetwork;

import java.util.List;

public class Neuron {

	public double y;
	public double d;
	public List<Double> w;
	public List<Double> x;
	
	public double calculateY(){
		double sum = 0;
		for(int i=0; i<x.size();i++){
			sum = x.get(i) * w.get(i);
		}
		
		return fi(sum);
	}
	
	public double fi(double a){
		return (1/(1+(Math.exp(-a))));
	}
	
	public double fiDerivative(double a){
		double expA = Math.exp(a);
		return (expA / ((1-expA) * (1-expA)));
	}
	
	public double e(){
		return (d-y);
	}
		
	//--------------------------------
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
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
