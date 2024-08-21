public class maxSubArraySumKadane_sAlgorithm {
    public static void kadanes(int arr[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            cs += arr[i];
            if (cs < 0){
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("our max sunarray sum is : "+ms);
    }
    public static void main(String [] args){
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(arr);
    }
}
