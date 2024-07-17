public class BinarySearchCode {

    public static int BinarySearch(int number[], int key){
        for(int i = 0; i < number.length; i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1 ;
    }
    public static void main(String[] args){
        int number[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        System.out.println("Found on index :" + BinarySearch(number , key));
    }
}
