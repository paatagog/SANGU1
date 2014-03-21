package lukino.neuro;

import java.util.List;

public class BinaryNeuron {

	public List<Double> W;
	public List<Integer> X;
	public double Theta;
	
	public int GetSign (){
		double sum = 0;
		for (int i = 0; i < W.size(); i++){
			sum += X.get(i) * W.get(i);
		}
		sum -= Theta;
 		return sum<0 ? -1 : 1 ;
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
