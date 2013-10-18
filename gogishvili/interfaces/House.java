package gogishvili.interfaces;

public class House implements Printable {
	
	private double area;
	
	private int roomCount;
	
	private double price;
	
	public void print() {
		System.out.println("Area: " + area + "; Room count: " + roomCount + "; Price: " + price + "; ");
	}
	
	
}
