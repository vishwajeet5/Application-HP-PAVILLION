public class power {
    // static int pow(int p, int q) {
    //     if (q == 0)
    //         return 1;

    //     return pow(p, q - 1) * p;
    // }

    static int pow(int p , int q){
        if (q == 0 ) return 1;
        
        int smallpow = pow(p, q/2);
        
        if (q%2 == 0) //for even q
        return smallpow*smallpow;

        else //for odd q
        return p * smallpow * smallpow;
    }


    public static void main(String[] args) {
        System.out.println(pow(2, 4));
    }
}