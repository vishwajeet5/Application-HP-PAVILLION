public class ArrayRecursion {
    static void printarray(int[] arr, int idx) {
        // base case
        if (idx == arr.length)
            return;
        // self work
        System.out.println(arr[idx]);
        // recursive work
        printarray(arr, idx + 1);
    }

    static int maxInArray(int[] arr, int idx) {
        // base case
        if (idx == arr.length - 1)
            return arr[idx];
        // recursion work
        int smallAns = maxInArray(arr, idx + 1);
        // self work
        return Math.max(arr[idx], smallAns);
    }

    static int sumOfArray(int[] arr, int idx) {
        // base case
        if (idx == arr.length)
            return 0;
        // recusive work or subProblem
        int smallAns = sumOfArray(arr, idx + 1);
        // self work
        return smallAns + arr[idx];
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8 };
        printarray(arr, 0);
        System.out.println(maxInArray(arr, 0));
        System.out.println(sumOfArray(arr, 0));
    }
}
