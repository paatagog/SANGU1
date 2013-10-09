package kvizhinadze;

public class PrimeNumbers {
	public static void main(String[] args){
		double number = 3;
		int divisor;
		
		System.out.print("1, 2, ");
		
		while(number <= 1000){
			boolean is_prime = true;
			for(divisor = 2; divisor <= Math.sqrt(number); divisor++){
				if (number % divisor == 0){
					is_prime = false;
					break;
				}
								
			}
			if (is_prime){
				int int_number = (int)number;
				System.out.print(int_number + ", ");
			}
			
			number++;
		}
	}
}
