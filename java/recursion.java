public class recursion {
    
    static int factorial(int var0) {
       return var0 == 0 ? 1 : var0 * factorial(var0 - 1);
    }
 
    public static void main(String[] var0) {
       System.out.println(factorial(0));
    }
 }