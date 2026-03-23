package standardprograms;
		import java.util.Scanner;

		public class PrimeCount {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Take array size input
		        System.out.print("Enter the number of elements: ");
		        int n = scanner.nextInt();

		        int[] numbers = new int[n];

		        // Take array elements input
		        System.out.println("Enter " + n + " numbers:");
		        for (int i = 0; i < n; i++) {
		            numbers[i] = scanner.nextInt();
		        }

		        int primeCount = 0;
		        int nonPrimeCount = 0;

		        // Check each number for primality
		        for (int num : numbers) {
		            if (isPrime(num)) {
		                primeCount++;
		            } else {
		                nonPrimeCount++;
		            }
		        }

		        System.out.println("Total prime numbers: " + primeCount);
		        System.out.println("Total non-prime numbers: " + nonPrimeCount);

		        scanner.close();
		    }

		    // Method to check if a number is prime
		    public static boolean isPrime(int n) {
		        if (n <= 1) return false;
		        for (int i = 2; i <= Math.sqrt(n); i++) {
		            if (n % i == 0) return false;
		        }
		        return true;
		    }
			
		
	}


