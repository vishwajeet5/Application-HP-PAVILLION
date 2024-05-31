import java.util.Scanner;
public class testrunner {
   /*  public static void main(String[] args) {
        // Creating an array of integers
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Accessing elements of the array
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        // Modifying an element
        numbers[2] = 10;

        // Looping through the array
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Enhanced for loop (foreach loop)
        System.out.println("Array elements using foreach:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }*/

    // @SuppressWarnings("resource")
    public static void main (String[] args){
        try (// @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            // Convert the number from desimal to binary
            String binary = Integer.toBinaryString(N);

            // Toggle the bits
            StringBuilder st = new StringBuilder();
            for (char i: binary.toCharArray()){
                if (i == '1'){
                    st.append('0');
                }else {
                    st.append('1');
                }
            }

            // Convert the number from binary to desimal
            int result = Integer.parseInt(st.toString(),2);

            System.out.println(result);
        }

    }
}


