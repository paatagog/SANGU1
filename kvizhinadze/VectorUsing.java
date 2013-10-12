package kvizhinadze;

public class VectorUsing {
	public static void main(String[] args) {

		Vector v1 = new Vector(10, 5);
		Vector v2 = new Vector(8, 6);

		System.out.println("Scalar: " + v1.scalarVector(v2));
		System.out.println("Sum: " + v1.sumVector(v2));
		System.out.println("Sub: " + v1.subVector(v2));

	}
}
