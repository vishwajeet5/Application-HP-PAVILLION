import java.util.Scanner;

public class LastTwoDigitsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long sum = 0;
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            long x = sc.nextLong();
            // Compute 2^x
            long powerOfTwo = 1L << x; // Using bit shifting to compute 2^x efficiently
            // Convert to string and get last two digits
            String str = Long.toString(powerOfTwo);
            str = str.length() > 2 ? str.substring(str.length() - 2) : str;
            // Add the integer value of last two digits to sum
            sum += Integer.parseInt(str);
        }

        // Print the result modulo 100
        System.out.println(sum % 100);

        sc.close();
    }
}
