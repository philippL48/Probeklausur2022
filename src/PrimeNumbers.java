public class PrimeNumbers {

	public static int compute (int n) {
		int iterator = 0;
		int result = 1;

		while (iterator < n) {
			result++;
			boolean isPrime = true;
			int test = 2;
			while (isPrime && test < result) {
				if (result % test == 0) {	
					isPrime = false;

				} else {
					test++;
					}
			}
			iterator++;
		}
		return result;
	}
	
	public static int sum(int n) {
		int result = 0;
		for (int i = 1; i < n+1; i++) {
			result = result + compute(i);
		}
		return result;
	}
	
	public static int product(int n) {
		int result = 0;			
		for (int i = 1; i < n+1; i++) {
			result = result * compute(i);
		}
		
		return result;
	}
	

}
