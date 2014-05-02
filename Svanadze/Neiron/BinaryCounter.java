package Svanadze.Neiron;

import java.util.List;

public class BinaryCounter {
	private List<Integer> binary;
	private int n;
	
	public BinaryCounter(){
		for(int i = 0; i < n; i++)
		{
			binary.set(i,0);
		}
	}
	
	//public List<Integer> GetNext(){
		//for(int i = binary.size() - 1; i > 0; i--)
		//{
			//if(binary.get(i) + 1 == n){
				
			//}
		//}
	//}
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
}