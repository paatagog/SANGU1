package Svanadze;

public class PrimeNumbers {
	public static void main(String[] args) {
		for (int i = 3; i <= 1000; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(i);
			}
		}
	}

}
