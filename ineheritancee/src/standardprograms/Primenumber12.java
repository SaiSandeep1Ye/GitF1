package standardprograms;

public class Primenumber12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   
		        int primeCount = 0;
		        int totalCount = 0;

		        for (int num = 0; num <= 50; num++) {
		            totalCount++; // Count all numbers from 0 to 50

		            if (isPrime(num)) {
		                System.out.println(num + " is a Prime Number");
		                primeCount++;
		            }
		        }

		        int nonPrimeCount = totalCount - primeCount;

		        System.out.println("\nTotal Prime Numbers: " + primeCount);
		        System.out.println("Remaining (Non-Prime) Numbers: " + nonPrimeCount);
		    }

		    // Method to check if a number is prime
		    public static boolean isPrime(int n) {
		        if (n <= 1) {
		            return false; // 0 and 1 are not prime
		        }

		        for (int i = 2; i < n; i++) {
		            if (n % i == 0) {
		                return false; // if divisible, not prime
		            }
		        }

		        return true; // number is prime
		    }
		
	}


