package lukino.neuro;

import java.util.ArrayList;
import java.util.List;

public class BinaryNeuronMain {

	public static void main(String[] args) {
		
//		BinaryNeuron binaryNeuron = new BinaryNeuron();
//		List<Integer> x = new ArrayList<Integer>();
//		List<Double> w = new ArrayList<Double>();
//		
//		w.add(1.0);
//		w.add(2.5);
//		w.add(1.0);
//		w.add(2.0);
//		w.add(1.7);
//		
//		x.add(-1);
//		x.add(1);
//		x.add(-1);
//		x.add(1);
//		x.add(1);
//		
//		binaryNeuron.setX(x);
//		binaryNeuron.setW(w);
//		binaryNeuron.setTheta(200);
//		
//		int binaryNeuronSign = binaryNeuron.GetSign();
//		System.out.println(binaryNeuronSign);
		
		BinaryCounter bc = new BinaryCounter();
		
		bc.setN(4);
		
		for (int k = 0; k < Math.pow(2, bc.getN()); k++){
			if(bc.hasNext()){
			System.out.println(bc.GetNext());
			}
			else {
				System.out.println("kaat iyavi");
			}
		}
	}

}
