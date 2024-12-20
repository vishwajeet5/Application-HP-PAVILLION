import java.util.Scanner;

public class testrunner {
    
     // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    // Function to calculate the sum of digits of a number
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // Function to find special primes within a given range
    public static void findSpecialPrimes(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                int digitSum = sumOfDigits(i);
                if (isPrime(digitSum)) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the start of the range: ");
            int start = scanner.nextInt();
            System.out.print("Enter the end of the range: ");
            int end = scanner.nextInt();

            if (start > end) {
                System.out.println("Start of the range must be less than or equal to the end.");
            } else {
                System.out.print("Special primes in the given range: ");
                findSpecialPrimes(start, end);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integer values.");
        } finally {
            scanner.close();
        }
    }
}