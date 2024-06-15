import java.util.*;

public class input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            String i = sc.next(); //take a sigle word input
            sc.nextLine(); //this should be written before taking input of line 
            String a = sc.nextLine(); //this will take the whole input of line 

            System.out.println("String value: " + i);
            System.out.println("Line value: " + a);
        sc.close();
    }
}
