import java.util.Scanner;

public class recursion_factorial {
    static int factorial(int n) {
        // base case
        if (n == 0)
            return 1;
        // recursion work
        // self work
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.print("input no. - ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt() ; //input line
            System.out.println(factorial(n));
        }

    }
}