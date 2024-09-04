import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SquareFreeDivisors {

    // Function to find prime factors of a given number n
    public static List<int[]> primeFactors(int n) {
        List<int[]> factors = new ArrayList<>();
        int count;

        // Check for number of 2s
        count = 0;
        while (n % 2 == 0) {
            n /= 2;
            count++;
        }
        if (count > 0) {
            factors.add(new int[]{2, count});
        }

        // Check for odd factors from 3 onwards
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            count = 0;
            while (n % i == 0) {
                n /= i;
                count++;
            }
            if (count > 0) {
                factors.add(new int[]{i, count});
            }
        }

        // If n is a prime number greater than 2
        if (n > 2) {
            factors.add(new int[]{n, 1});
        }

        return factors;
    }

    // Function to generate all divisors from prime factors
    public static Set<Integer> generateDivisors(List<int[]> primeFactors) {
        Set<Integer> divisors = new HashSet<>();
        divisors.add(1);

        for (int[] factor : primeFactors) {
            int prime = factor[0];
            int exponent = factor[1];
            Set<Integer> newDivisors = new HashSet<>();
            for (int i = 1; i <= exponent; i++) {
                int power = (int) Math.pow(prime, i);
                for (int d : divisors) {
                    newDivisors.add(d * power);
                }
            }
            divisors.addAll(newDivisors);
        }

        return divisors;
    }

    // Function to check if a number is square-free
    public static boolean isSquareFree(int num) {
        if (num < 2) return false; // 1 is not considered a square-free number

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % (i * i) == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to count square-free divisors
    public static int countSquareFreeDivisors(int n) {
        List<int[]> factors = primeFactors(n);
        Set<Integer> divisors = generateDivisors(factors);
        int count = 0;
        for (int divisor : divisors) {
            if (divisor != 1 && isSquareFree(divisor)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        int result = countSquareFreeDivisors(n);
        System.out.println("Number of square-free divisors: " + result);
    }
}
