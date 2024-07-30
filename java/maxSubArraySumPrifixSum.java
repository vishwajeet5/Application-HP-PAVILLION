public class maxSubArraySumPrifixSum {
    public static void main(String[] args){
        int arr[] = {1, -2, 6, -1, 3};
        int prifix [] = new int[arr.length];
        int maxSum = Integer.MIN_VALUE;

        prifix[0] = arr[0];
        for(int i = 1; i < prifix.length; i++){
            prifix[i] = prifix[i-1] + arr[i];
        }
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                sum = i == 0 ? prifix[j] : prifix[j] - prifix[i-1];
                System.out.println(sum);
                if (sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        System.out.println("Max Sum = " + maxSum);
    }
}
