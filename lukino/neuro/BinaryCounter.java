package lukino.neuro;

import java.util.List;
import java.util.ArrayList;

public class BinaryCounter {
	public List<Integer> binary = new ArrayList<Integer>();
	private int n;
	private int quantityUsed = 0;
	
	public void SetZero(){
		for (int i = 0; i < n; i++){
			binary.add(0);  
		}
	}
	
	public List<Integer> GetNext(){
		if(quantityUsed != 0){
			for (int i = 0; i < binary.size(); i++){
				if(binary.get(i) == 0){
					binary.set(i, 1);
					
					for (int j = 0; j < i; j++){
						binary.set(j, 0);
					}
					
					break;
				}
			}
		}
		quantityUsed++;
		return binary;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n + 1;
		SetZero();
	}

	public boolean hasNext() {
		return (quantityUsed < Math.pow(2, n));
	}

	public int getQuantityUsed() {
		return quantityUsed;
	}

}
