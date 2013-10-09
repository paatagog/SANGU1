package Svanadze;

public class Vector {
	private double x;
	private double y;

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

	public double scalarMultOfVectors(Vector a) {
		return x * a.x + y * a.y;
	}

	public double[] sumOfVectors(Vector a) {
		double[] sumArr = new double[] { this.x + a.x, this.y + a.y };
		return sumArr;
	}

	public double[] subOfVectors(Vector a) {
		double[] subArr = new double[] { this.x - a.x, this.y - a.y };
		return subArr;
	}

	private double lengthOfVector() {
		return Math.sqrt(x * x + y * y);
	}

	public double vectorMultOfVectors(Vector a, double b) {
		return lengthOfVector() * a.lengthOfVector() * Math.sin(b);
	}
}
