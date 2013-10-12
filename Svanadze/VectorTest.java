package Svanadze;

public class VectorTest {
	public static void main(String[] args) {
		
		Vector firstVector;
		firstVector = new Vector();
		firstVector.setX(10);
		firstVector.setY(10);
		
		Vector secondVector;
		secondVector = new Vector();
		secondVector.setX(5);
		secondVector.setY(5);
		
		double angle = 45;
		
		System.out.println("Ori Vektoris Skalaruli Namravli: "
				+ firstVector.scalarMult(secondVector));
		System.out.println();
		
		System.out.println("Ori Vektoris Vektoruli Namravli: "
				+ firstVector.vectorMultOfVectors(secondVector, angle));
		System.out.println();
		
		System.out.println("Ori Vektoris Jami: "
				+ firstVector.sumOfVectors(secondVector));
		System.out.println();
		
		System.out.println("Ori Vektoris Sxvaoba: "
				+ firstVector.subOfVectors(secondVector));
		System.out.println();
	}
}