package lukino.neuro;

import java.util.List;

public class BinaryNeuron {

	public List<Double> W;
	public List<Integer> X;
	public double Theta;
	
	public List<Double> MiuList;
	public List<Double> QList;
	public List<Double> Q1List;
	
	public int GetSign (){
		double sum = 0;
		for (int i = 0; i < W.size(); i++){
			sum += X.get(i) * W.get(i);
		}
		sum -= Theta;
 		return sum<0 ? -1 : 1 ;
	}
	
	public void InitializeQ1ListAndMiuList(int n, List<Double> qList, List<Double> wList) {
		double qForMult = 1;
		double miuForSub = 0;
		
		BinaryCounter bc = new BinaryCounter();
		bc.setN(4);

		for (int i = 0; i < Math.pow(2, bc.getN()); i++){
			for (int j = 0; j < bc.binary.size(); j++){
				if(bc.binary.get(j) == 0){
					miuForSub -= wList.get(j);
					qForMult *= qList.get(j); 
				}
				else {
					miuForSub += wList.get(j);
					qForMult *= (1 - qList.get(j));
				}
			}
			
			Q1List.add(qForMult);
			MiuList.add(miuForSub);
		}
		
	}
	
	public double MistakeProbability (List<Double> q1List){
		double mistakeProbability = 0;
		
		for (int i = 0; i < q1List.size(); i++){
			mistakeProbability += q1List.get(i);
		}
		
		return mistakeProbability;
	}
	
		
	
	// Set / Get  -------------------------------------------
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

	public List<Double> getQList() {
		return QList;
	}

	public void setQList(List<Double> qList) {
		QList = qList;
	}
}
