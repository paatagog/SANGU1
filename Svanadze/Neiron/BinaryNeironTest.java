package Svanadze.Neiron;

import java.util.ArrayList;
import java.util.List;

public class BinaryNeironTest {
	public static void main(String[] args) {
		BinaryNeiron neiron = new BinaryNeiron();
		
		List<Double> w = new ArrayList<Double>();
		w.add(1.5);
		w.add(2.0);
		w.add(1.0);
		w.add(2.0);
		w.add(1.0);
		w.add(2.0);
		List<Integer> x = new ArrayList<Integer>();
		x.add(1);
		x.add(-1);
		x.add(-1);
		x.add(1);
		x.add(1);
		x.add(1);
		
		neiron.setW(w);
		neiron.setX(x);
		neiron.setTheta(1);
		
		System.out.println(neiron.GetSign());
	}

}
