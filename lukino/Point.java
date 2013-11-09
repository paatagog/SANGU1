package lukino;

public class Point {
	public double x;
	public double y;
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
	
	public String toString (){
		StringBuilder sb = new StringBuilder();
		return (sb.append(x).append(" ").append(y)).toString();
		}
}
