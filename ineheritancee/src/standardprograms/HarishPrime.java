package standardprograms;

public class HarishPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] numbers = new int[51]; // Array from 0 to 50
		        for (int i = 0; i <= 50; i++) {
		            numbers[i] = i;
		        }

		        int primeCount = 0;
		        int nonPrimeCount = 0;

		        for (int num : numbers) {
		            if (isPrime(num)) {
		                primeCount++;
		            } else {
		                nonPrimeCount++;
		            }
		        }

		        System.out.println("Total prime numbers between 0 and 50: " + primeCount);
		        System.out.println("Total non-prime numbers between 0 and 50: " + nonPrimeCount);
		    }

		    // Helper method to check if a number is prime
		    public static boolean isPrime(int n) {
		        if (n <= 1) return false;
		        for (int i = 2; i <= Math.sqrt(n); i++) {
		            if (n % i == 0) return false;
		        }
		        return true;
		    }
		

	}
