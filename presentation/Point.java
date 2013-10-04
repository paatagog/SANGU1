package presentation;

public class Point {
	
	private double x;
	
	private double y;
	
	public double distance(Point p) {
		return Math.sqrt((x - p.getX()) * (x - p.getX()) + (x - p.getX()) * (x - p.getX()));
	}

	public double distanceFromCenter() {
		return Math.sqrt(x * x + y * y);
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
