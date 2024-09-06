import java.util.*;

public class stringSubstring {
    public static String substring(String str, int st, int end){
        String pStr = "";
        for(int i = st; i < end; i++){
            pStr = pStr + str.charAt(i);
        }
        return pStr;
    }
    public static void main(String args[]){
        String str = "Hello World";
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        int end = sc.nextInt();
        // System.out.println(substring(str, st, end)); //method 1
        System.out.println(str.substring(st, end)); //method 2
        sc.close();
    }
}
