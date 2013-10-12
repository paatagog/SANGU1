package Svanadze;

public class Vector {
	private double x;
	private double y;

	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Vector() {
	}

	public double scalarMult(Vector a) {
		return x * a.x + y * a.y;
	}

	public Vector sum(Vector v) {
		Vector result = new Vector();
		result.x = this.x + v.x;
		result.y = this.y + v.y;
		return result;
	}

	public Vector sub(Vector v) {
		Vector result = new Vector();
		result.x = this.x - v.x;
		result.y = this.y - v.y;
		return result;
	}

	private double lengthOfVector() {
		return Math.sqrt(x * x + y * y);
	}

	public double vectorMult(Vector a, double b) {
		return this.lengthOfVector() * a.lengthOfVector() * Math.sin(b);
	}

	public String toString() {
		return "x=" + x + "; y=" + y;
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
}
