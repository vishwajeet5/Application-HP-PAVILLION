import java.util.Scanner;

public class while_loop {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number n - ");
        int n = sc.nextInt();
        int sum = 0;
        int num = 1;
        System.out.println("The n natura number.");
        while (num <= n) {
            sum = sum + num;

            System.out.println(num);

            num++;
        }
        System.out.println("Sum of n numbesr is = " +sum); // sum of n number
    }
}
