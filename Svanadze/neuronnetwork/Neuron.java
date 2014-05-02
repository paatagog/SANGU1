package Svanadze.neuronnetwork;

import java.util.ArrayList;
import java.util.List;

public class Neuron {
	private List<Double> w;
	private List<Double> x;
	private double y;
	private double d;
	
	public double calculateY() {
		for(double b : this.x){
			y = f(sum());
		}
		return y;
	}
	
	public double f(double a){
		return 1/(1+Math.exp(a));
	}
	
	public double sum(){
		double sum = 0;
		for(int i = 0; i < w.size(); i++){
			sum += x.get(i) * w.get(i);
		}
		return sum;
	}
	
	public List<Double> getW() {
		return w;
	}
	public void setW(List<Double> w) {
		w = w;
	}
	public List<Double> getX() {
		return x;
	}
	public void setX(List<Double> x) {
		x = x;
	}
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}	
}
