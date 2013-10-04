package presentation;

public class Classtest {

	public static void main(String[] args) {
		Point p;
		p = new Point();
		p.setX(15);
		p.setY(17);
		
		System.out.println("Point distance from center is " + p.distanceFromCenter());
		
	}
}
