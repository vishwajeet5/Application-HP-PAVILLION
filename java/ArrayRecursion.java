public class ArrayRecursion {
    static void printarray(int[] arr, int idx) {
        // base case
        if (idx == arr.length) return;
        //self work
        System.out.println(arr[idx]);
        //recursive work
        printarray(arr, idx + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8 };
        printarray(arr, 0);
    }
}
