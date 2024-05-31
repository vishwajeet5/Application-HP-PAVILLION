import java.util.Scanner;

public class tem1 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // Convert the number from desimal to binary
        String binary = Integer.toBinaryString(N);

        // Toggle the bits
        StringBuilder st = new StringBuilder();
        for (char i : binary.toCharArray()) {
            if (i == '1') {
                st.append('0');
            } else {
                st.append('1');
            }
        }

        // Convert the number from binary to desimal
        int result = Integer.parseInt(st.toString(), 2);

        System.out.println(result);
    }

}