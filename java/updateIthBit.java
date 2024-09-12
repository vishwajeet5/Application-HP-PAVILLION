public class updateIthBit {
    public static int setIth(int n, int i){
        int bitMask = 1 << i;
        return n|bitMask;
    }
    public static int clearIth(int n, int i){
        int bitMask = ~(1 << i);
        return n & bitMask;
    }
    public static int updateIth(int n, int i, int newBit){
        if(newBit == 0){
            return clearIth(n,i);
        }else{
            return setIth(n, i);
        }

        // also we can do this 
        // n = clearIth(n, i);
        // int bitMask = newBit << i;
        // return n|bitMask;
    }
    public static void main(String args[]){
        System.out.println(updateIth(10, 2, 1));
    }
}
