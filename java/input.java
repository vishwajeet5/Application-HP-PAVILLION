import java.util.Scanner;

public class input {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String i = sc.nextLine();

            System.out.println("float value " + i);
        }
    }
}
