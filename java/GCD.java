import java.util.Scanner;

public class GCD {
    static int iGCD(int x, int y) {
        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }

    static int gcd(int x, int y) {
        if (y == 0)
            return x;
        return gcd(y, x % y);

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the no. for GCD");
            System.out.print("First no. - ");
            int x = sc.nextInt();
            System.out.print("Second no. - ");
            int y = sc.nextInt();
            System.out.println(iGCD(x, y));
            System.out.println(gcd(x, y));
        }
    }
}
