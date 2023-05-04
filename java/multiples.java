import java.util.Scanner;

public class multiples{
    static void printmultiples (int n , int m)
{
    if (m == 1 ){
    System.out.println(n);
    return;
    }
    printmultiples(n, m-1);

    System.out.println(n * m);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no. which you want the multiple - ");
        int n = sc.nextInt();
        System.out.print("enter the no. till where you want the multiple - ");
        int m = sc.nextInt();
        printmultiples(n, m);
    }
}