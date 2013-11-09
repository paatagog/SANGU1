package Svanadze.classes;

public class Point {
	private double x;
	private double y;

	public double distance() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
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

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("(").append(x).append("; ").append(y).append(") ");

		return sb.toString();
	}
}
