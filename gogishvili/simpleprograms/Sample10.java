package gogishvili.simpleprograms;

public class Sample10 {

	// แแ?แแแคแแฅแ แ?แ แฃแแแแแกแ แ?แแแ?แ แแแแ
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
