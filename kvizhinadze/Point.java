package kvizhinadze;

public class Point {
	private double x;
	private double y;

	public void setX(double x) {
		this.x = x;
	}

	public double getX() {
		return x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getY() {
		return y;
	}

	public double distanceFromCenter() {
		return Math.sqrt((this.x) * (this.x) + (this.y) * (this.y));
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(x).append(" ").append(y).append(";");

		return sb.toString();
	}
}
