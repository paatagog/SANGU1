package Svanadze.Neiron;

import java.util.List;

public class BinaryNeiron {
	private List<Double> W;
	private List<Integer> X;
	private double Theta;
	
	public int GetSign(){
		double sum = 0;
		for(int i = 0; i < W.size(); i++){
			sum += X.get(i) * W.get(i);
		}
		sum -= Theta;
		if(sum < 0) return -1;
		return 1;
	}

	public List<Double> getW() {
		return W;
	}

	public void setW(List<Double> w) {
		W = w;
	}

	public List<Integer> getX() {
		return X;
	}

	public void setX(List<Integer> x) {
		X = x;
	}

	public double getTheta() {
		return Theta;
	}

	public void setTheta(double theta) {
		Theta = theta;
	}
}
