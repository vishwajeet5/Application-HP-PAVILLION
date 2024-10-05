public class RecursionBasics {
    public static void printDecreasing(int n) {
        if (n == 1) { // base case
            System.out.println("1");
            return;
        }
        System.out.print(n + " "); // self work
        printDecreasing(n - 1); // recursive work
    }

    public static void printIncreasing(int n) {
        if (n == 1) { // Base case
            System.out.print(1);
            return;
        }
        printIncreasing(n - 1); // Recursive work
        System.out.print(" " + n); // Self work
    }

    public static int printFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        int factorial = n * printFactorial(n - 1);
        return factorial;
    }

    public static int sumOfN(int n) {
        if (n == 0) {
            return 0;
        }
        int sum = n + sumOfN(n - 1);
        return sum;
    }

    public static int fabonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fab = fabonacci(n - 1) + fabonacci(n - 2);
        return fab;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        
        return firstOccurence(arr, key, i+1);}

    public static int lastOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        
        return lastOccurence(arr, key, i - 1);}

    public static int printXn(int x, int n){
        if(n == 0){
            return 1;
        }
        int xn = x * printXn(x, n-1);
            return xn;
        }

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfxn = power(x, n/2);
        int xn = halfxn * halfxn;
        if(n % 2 != 0){
            xn = xn * x;
        }
        return xn;
    }
    @SuppressWarnings("unused")
    public static void main(String args[]) {
        // printDecreasing(10);
        // printIncreasing(5);
        // System.out.println(printFactorial(5));
        // System.out.println(sumOfN(5));
        // System.out.println(fabonacci(48)); // can't calculate more then 48 after this
        // it will give garbage value.
        int arr[] = { 3, 1, 5, 2, 4, 5, 7, 3};
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstOccurence(arr, 5, 0));
        // System.out.println(lastOccurence(arr, 5, arr.length -1));
        // System.out.println(printXn(2, 10));
        System.out.println(power(2, 10));
    }
}
