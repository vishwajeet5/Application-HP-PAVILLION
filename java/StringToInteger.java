import java.util.*;

public class StringToInteger{
    /*public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            // int n = Integer.parseInt(s);
            System.out.println(n);
        } 
            catch (Exception e) {
            System.out.println("Bad String");
        }
*/

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            try {
                int n = Integer.parseInt(s);
                System.out.println(n);
            } 
            catch (NumberFormatException e) {
                System.out.println("Bad String");
            }
    
        sc.close();

    }

}