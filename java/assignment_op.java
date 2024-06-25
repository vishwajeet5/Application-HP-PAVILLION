public class assignment_op{
    public static void main (String[] arg){
        int A = 7;
        System.out.println("add = " + (A += 10)); //here A = 7
        System.out.println("substract = " + (A-= 10)); //here A = 17
        System.out.println("multiplication = " + (A *= 10)); //here A  = 7
        System.out.println("division = " + (A /= 10)); // here A = 70
        System.out.println("modulo(remainder) = " + (A %= 10)); //here A = 7
    }
}