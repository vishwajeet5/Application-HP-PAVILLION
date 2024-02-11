public class testrunner {
    public static void main(String[] args) {
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
    }
}


