public class setIthBit {
    public static int setIth(int n, int i){
        int bitMask = 1 << i;
        return n|bitMask;
    }
    public static void main(String args[]){
        System.out.println(setIth(10,2));
    }
}
