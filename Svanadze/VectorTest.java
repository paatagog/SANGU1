package Svanadze;

public class VectorTest {
	public static void main(String[] args) {

		Vector firstVector = new Vector(10, 10);
		Vector secondVector = new Vector(5, 5);
		double angle = 45;

		System.out.println("Ori Vektoris Skalaruli Namravli: "
				+ firstVector.scalarMult(secondVector));
		System.out.println("Ori Vektoris Vektoruli Namravli: "
				+ firstVector.vectorMult(secondVector, angle));
		System.out.println("Ori Vektoris Jami: "
				+ firstVector.sum(secondVector));
		System.out.print("Ori Vektoris Sxvaoba: "
				+ firstVector.sub(secondVector));
	}
}
