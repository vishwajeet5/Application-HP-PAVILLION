/*
 Tiling Problem
 Given a "2xn" board and tiles of size "2x1", count the number of ways 
 to the tile given board using the 2x1 tiles.
 (A tile can either be placed horizontally or vertically.)
 */

public class tilingProblem {
    public static int problem(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        // Vertical case
        int fnm1 = problem(n - 1);
        // Horizontal case
        int fnm2 = problem(n - 2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void main(String args[]){
        System.out.println(problem(4));
    }    
}
