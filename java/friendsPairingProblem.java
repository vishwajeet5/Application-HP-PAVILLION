/*
 Given n friends, each one can remain single or can be paired up with 
 some other friend. Each friend can be paired only once. Find the total 
 number of ways in which friends can remain single or can be paired up.
 */

public class friendsPairingProblem {
    public static int solution(int n){
        // Base case
        if(n == 1 || n == 2){
            return n;
        }
        // Choice
        // Single
        int fnm1 = solution(n-1);
        // Pair
        int fnm2 = solution(n-2);
        int pairWays = (n-1) * fnm2;

        // total ways
        int totWays = fnm1 + pairWays;
        return totWays;
    }
    public static void main(String args[]){
        System.out.println(solution(3));
    }
}
