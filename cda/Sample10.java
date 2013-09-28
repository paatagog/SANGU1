package cda;

public class Sample10 {

	// მოვიფიქროთ უკეთესი ალგორითმი
	public static void main(String[] args) {
		int n = 100;
		
		for (int i = 2; i <= n; i++) {
			boolean prime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				System.out.println(i);
			}
		}
	}
}
