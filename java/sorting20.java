import java.util.*;

public class sorting20 {

    public static void swap(int i, int j){
        int temp = i;
        i = j;
        j = temp;
        
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr [] = new int [n] ;
        int swapCount = 0;

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i= 0; i<n;i++){
            for(int j = 0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr[j] , arr[j+1]);
                    swapCount++;
                }
            }
        }
       
        System.out.println("Array is sorted in "+swapCount+" swaps.");
        System.out.println("First element = " + arr[0]);
        System.out.println("Last element = " + arr[n-1]);
        
        sc.close();
    }
}
