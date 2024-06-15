import java.util.*;

public class right_left_{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            // Complete this line

            if (s1.length() < 15) {
                for (int y = s1.length(); y < 15; y++) {
                    // System.out.print(" ");
                    s1 += " ";
                }
                String a = String.valueOf(x);
                if (a.length()<3){
                    for (int q = a.length(); q<3;q++);
                    a = "0" + a;
                }
                System.out.println(s1 + a);
            }

            

        }

        
        System.out.println("================================");
    sc.close();
}

}