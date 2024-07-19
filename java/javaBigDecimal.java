import java.util.*;
import java.math.BigDecimal;

public class javaBigDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BigDecimal arr[] = new BigDecimal[n];

        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
