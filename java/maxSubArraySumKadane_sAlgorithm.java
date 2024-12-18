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
/* best approach
public static int maxKannades(int arr[]){
      int n =  arr.length;
        long maxsum = Integer.MIN_VALUE;
        long currsum = 0;
        
        for(int i = 0 ;i < n; i++)
        {
            currsum += arr[i];
            if(currsum < 0)
            {
                currsum = 0;
            }
            maxsum = Math.max(maxsum,currsum);
        }
        if(maxsum > 0)
        {
            return (int)maxsum;
        }
        else
        {
            Arrays.sort(arr);
            return arr[n-1];
        }
    }
        */

    public static void main(String [] args){
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(arr);
    }
}
