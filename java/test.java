import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // 1st
        /*
         * {
         * int var1 = 0;
         * int var2 = 2;
         * 
         * while ((var2 != 0) && ((var1 / var2)>= 0)){
         * var1++;
         * var2--;
         * }
         * System.out.println("var1 is "+var1 +"\nvar2 is "+var2 );
         * }
         */
        // 2nd
        /*
         * {
         * int i = 1, j=1;
         * while(i < 3)
         * {
         * do
         * {
         * System.out.println(j+ ",");
         * j++;
         * }while(j<4);
         * i++;
         * }
         * }
         */

        // 3rd
        /*
         * int i = 1, j = 1;
         * while (i < 3) {
         * do {
         * System.out.print(j + ",");
         * j++;
         * } while (j < 4);
         * i++;
         * }
         */

        // Scanner userInput = new Scanner (System.in);
        // System.out.println ("How old are you?");
        // int age = userInput.nextInt();
        // System.out.println (age + " is a very good age to be!");

        String input = "1 fish 2 fish red fish blue fish";
        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
        System.out.println(s.nextInt());
        System.out.println(s.nextInt());
        System.out.println(s.next());
        System.out.println(s.next());
        s.close();
    }
}