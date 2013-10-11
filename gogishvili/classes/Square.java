package gogishvili.classes;

public class Square extends Rectangle {
	
	public double getPerimeterByArea(double area) {
		return Math.sqrt(area) * 4;
	}
	
	public double area() {
		return getA() * getA();
	}

}
