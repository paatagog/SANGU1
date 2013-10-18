package gogishvili.interfaces;

public class Circle implements Printable {
	
	private double x;
	
	private double y;
	
	private double r;
	
	private Color c;
	
	public void print() {
		System.out.println("Center is: (" + x + ", " + y + "); Radius is: " + r + "; Color is: " + c);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public Color getC() {
		return c;
	}

	public void setC(Color c) {
		this.c = c;
	}
	

}
