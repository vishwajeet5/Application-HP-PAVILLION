public class maxSubArraySum {
    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        // int arr[] = {2, 4, 6, 8, 10};
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                System.out.println(sum += arr[j]);
            }
            if (maxSum < sum) {
                maxSum = sum;
            }
        }
        System.out.println("Max Sum = " + maxSum);
    }
}
