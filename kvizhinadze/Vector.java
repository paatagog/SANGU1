package kvizhinadze;

public class Vector {
	private double x;
	private double y;
	
	public Vector(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public Vector (){
		
	}
	
	double scalarVector(Vector v){
		return this.x * v.x + this.y * v.y;
	}
	
	Vector sumVector(Vector v){
		Vector result = new Vector();
		result.x = this.x + v.x;
		result.y = this.y + v.y;
		return result;
	}
	
	Vector subVector(Vector v){
		Vector result = new Vector();
		result.x = this.x - v.x;
		result.y = this.y - v.y;
		return result;
	}
	
	public String toString(){
		return "x= " + x + "; y=" + y + ";";
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
