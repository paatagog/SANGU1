package Svanadze.neuronnetwork;

import java.util.List;

public class Neuron {
	private List<Double> w;
	private List<Double> x;
	private double y;
	private double d;
	
	public double calculateY() {
		double sum = 0;
		for(int i = 0; i < w.size(); i++){
			sum += x.get(i) * w.get(i);
		}
		y = fi(sum);		
		return y;
	}
		
	public static double fi(double a){
		return 1/(1+Math.exp(a));
	}
	
	public static double fiDerivative(double a){
		return fi(a)*(1-fi(a));
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
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}	
}
