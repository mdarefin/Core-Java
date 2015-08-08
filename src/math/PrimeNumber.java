package math;

public class PrimeNumber {


	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million. Try the best
		 * solution as possible.Which will take less CPU life cycle. Out put
		 * number of Prime numbers on given range.
		 * 
		 */

		// forLoop to find prime numbers from number 2 to 1 million using
		primeNumerWithRange(2, 10000000);

		// number of Prime numbers on given range
		primeNumerWithRange(100, 1000);

	}

	// checking if the number is prime
	public static boolean isPrimeNumber(int number) {
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void primeNumerWithRange(int firstTRange, int secondRange ) {
		int countPrime = 0;
		for (int i = firstTRange; i < secondRange; i++) {
			if (isPrimeNumber(i)) {
				System.out.println(i);
				countPrime++;
			}
		}
		System.out.println("The count of primary numbers: "+countPrime);
	}

}
