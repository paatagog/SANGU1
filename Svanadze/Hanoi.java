package Svanadze;

public class Hanoi {
	public static void move(int n, String from, String using, String to) {
		if (n == 0) {
			return;
		}
		move(n - 1, from, to, using);
		System.out.println("Move disc " + n + " from " + from + " to " + to);
		move(n - 1, using, from, to);
	}

	public static void main(String[] args) {
		move(3, "Pole 1", "Pole 2", "Pole 3");
	}

}
