import java.util.*;

public class input1 {
     public static void main(String [] arg ){

        Scanner sc = new Scanner(System.in);
        // takes input of first digit
        int a = sc.nextInt();
        // takes input of second digit 
        int b = sc.nextInt();
        System.out.println(a+b); //print sum of digits
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println((float)(a/b));
        sc.close();

    }
}