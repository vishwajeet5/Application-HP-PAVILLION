public class countSetBit {
    public static void countSet(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){
                count++;   
            }
            n = n >> 1;
        }
        System.out.println(count);
    }
    public static void main(String args[]){
        countSet(10);
    }
}
