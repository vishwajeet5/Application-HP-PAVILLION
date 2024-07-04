import java.util.*;

public class generics21 {
    public static void printArray(String arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
    
        Scanner sc =  new Scanner(System.in);
        
        for(int ia = 0; ia <=1; ia++){

        int n = sc.nextInt();
        String arr[] = new String[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }
        printArray(arr);
    }

        sc.close();

    }
}

