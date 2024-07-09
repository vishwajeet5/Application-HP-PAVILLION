import java.util.*;

public class runningTimeAndComplaxity25 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int m = sc.nextInt();
            int c = 0;
            if (m == 1){
                System.out.println("Not prime");
            }else{
                // for(int j = 2; j < m; j++){                      not optimized
                    for(int j = 2; j <= Math.sqrt(m); j++){         //optimized
                    if(m%j == 0){
                        c ++;
                    }
                }
                if(c == 0){
                    System.out.println("Prime");
                }
                else{
                    System.out.println("Not prime");
                    c = 0;
                }
            }
        } 
        sc.close();
    }
}