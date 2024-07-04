import java.util.*;

public class javaIntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toBinaryString(n);
        System.out.println(s);
        sc.close();

    }
}
