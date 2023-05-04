public class SUMOFDIGITS {
    static int sumofdigits(int n) {
        if (n>=0 && n <=9) return n;
            return sumofdigits(n/10) + (n % 10);
    }
    public static void main(String[] args) {
        System.out.println(sumofdigits(6207));
    }
}
