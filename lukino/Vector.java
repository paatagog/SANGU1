package lukino;

public class Vector {
	private double x;
	private double y;
	
	public Vector sum(Vector vector){
		Vector v = new Vector();
		v.x = this.x + vector.x;
		v.y = this.y + vector.y;
		return v;
	}
	
	public double scalarMultiplication(Vector vector){
		return (x * vector.x + y * vector.y);
	}
	
	public Vector sub(Vector vector){
		Vector v = new Vector();
		v.x = this.x - vector.x;
		v.y = this.y - vector.y;
		return v;
	}
	
	public double length(){
		return Math.sqrt(x * x + y * y);
	}
	
	public double vectorMultiplication(Vector vector, double angle){
		return (this.length() * vector.length() * Math.sin(angle));
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
