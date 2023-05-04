import java.util.Scanner;

public class recursion_fabo {
    static int fabonaci(int n) {
        if (n == 0 || n == 1) {
            return n;   //base case
        }

        int prev = fabonaci(n-1);
        int prevprev = fabonaci(n-2);

        // recursion work
        // self work 
       
    return prev + prevprev;
    // return fabonaci(n-1) + fabonaci(n-2);
}

    public static void main(String[] args) {
        System.out.print("input no. - ");
        try(Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt() ; //input line
        System.out.println((fabonaci(n)));
        // for (int i = 0 ; i < 11 ; i++){
        // System.out.println((fabonaci(i)));
    }
    }
}
