import java.util.*;

public class moreException17 {

    public static void powerCalc(int n, int p){ 
        System.out.println((int)(Math.pow(n, p)));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++){
            int n = sc.nextInt();
            int p = sc.nextInt();

            if (n >= 0 && p >= 0){
                powerCalc(n, p);
            }
            else{
                System.out.println("n and p should be non-negative");
            }
        }
        sc.close();
    }
}
