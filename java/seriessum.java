import java.util.Scanner;

public class seriessum {
    static int seriesSum(int n){
    if (n == 0)
    return 0;
    
    if (n % 2 == 0){
    return seriesSum(n - 1) - n;}
    else{ 
    return seriesSum(n - 1) + n;
    }

}

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println(seriesSum(n));
        }
    }
}
