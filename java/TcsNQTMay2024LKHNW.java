/*
 TCS NQT may 2024 Lucknow question

Create a program that allows the user to define the range of numbers. the program should identify and list all the prime number within this range. However the program should go a step further by ensuring that each prime no. found , the sum of digit is also checked to determine whether its a prime no.. In other words, the program should find prime no. where both the original no. and sum of digit are prime. 

Ex 01:- Input 20, 30 
	output 23, 29

In the given range from 20 to 30 :- the program identify two prime no. 23 and 29. It then calculate the sum of the digit for each prime no.. 
finally it checks the sum of digits is also prime no..
The output shows that both 23 and 29 are prime no. with prime digit sum 23 has a digit sum of 5,what is a prime no. 29 has a digit of 11 which is a prime no.. 

Ex 02:- Input 1, 10
	output 2, 3, 5, 7
 */

import java.util.Scanner;

public class TcsNQTMay2024LKHNW {
    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
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
