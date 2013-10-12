package Svanadze;

public class Vector {
	private double x;
	private double y;


	public double scalarMult(Vector a) {
		return x * a.x + y * a.y;
	}

	public String sumOfVectors(Vector a) {
		double[] sumArr = new double[] { this.x + a.x, this.y + a.y };
		return "(" + sumArr[0] + "; " + sumArr[1] + ")";
	}
	
	public Vector sum(Vector v) {
		Vector result = new Vector();
		result.x = this.x + v.x;
		result.y = this.y + v.y;
		return result;
	}

	public String subOfVectors(Vector a) {
		double[] subArr = new double[] { this.x - a.x, this.y - a.y };
		return "(" + subArr[0] + "; " + subArr[1] + ")";
	}

	private double lengthOfVector() {
		return Math.sqrt(x * x + y * y);
	}

	public double vectorMultOfVectors(Vector a, double b) {
		return lengthOfVector() * a.lengthOfVector() * Math.sin(b);
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
