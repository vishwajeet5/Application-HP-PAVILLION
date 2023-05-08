public class arraySearch {

       // returnindex of target if target is Present in array
    // otherwise return -1
    static int FindIndex(int[]arr ,int target , int idx){
        // Base case
        if(idx >= arr.length) return -1;
        // Self Work
        if(arr[idx] == target) return idx;
        // Recursive Work(Better)
        return FindIndex(arr ,target, idx+1);
        // Recursive Work
        // if(FindIndex(arr, target, idx + 1)){
        //     return idx;
        // }else{
        //     return -1;
        // }  
        }

    static boolean search(int[] arr, int target, int idx) {
        // Base case
        if (idx >= arr.length)
            return false;
        // Self Work
        if (arr[idx] == target)
            return true;
        // Recursive Work(Better)
        return search(arr, target, idx + 1);
        // Recursive Work
        // if(search(arr, target, idx + 1)){
        // return true;
        // }else{
        // return false;
        // }
    }

   
    public static void main(String[] args) {
        int[] arr = { 2, 5, 9, 4, 3, 8 };
        int target = 9;
        if(search(arr,target,0)){
        System.out.println("Present");
        }else{
        System.out.println("Not Present");
        }

        System.out.println("Idex is - "+FindIndex(arr, target, 0));
    }
}
