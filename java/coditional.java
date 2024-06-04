import java.util.Scanner;

public class coditional {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
        System.out.println("enter whole number to check");
        Scanner sc = new Scanner(System.in); 
          int num = sc.nextInt();

          //if else condition
          
             if (num % 2 == 0) {
            System.out.println("even number " + num);
            } else {
            System.out.println("odd number " + num);
            }
           

          // by using ternary operator
          
            String output;
            output = (num % 2 == 0) ? "even" : "odd" ;
            System.out.println(output);
        
         
    }
}
