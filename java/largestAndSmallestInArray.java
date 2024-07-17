public class largestAndSmallestInArray {

    public static int getLargest(int number[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {
                largest = number[i];
            }
        }
        return largest;
    }

    public static int getSmallest(int number[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] < smallest) {
                smallest = number[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 6, 3, 5 };
        System.out.println("Smallest of them is : " + getSmallest(number));
        System.out.println("Largest of them is : " + getLargest(number));
    }
}
