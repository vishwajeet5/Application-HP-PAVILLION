// import java.util.*;

public class spiralMatrix {
    public static void spiral(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] +" ");
            }
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] +" ");
            }
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] +" ");
            }
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] +" ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // int matrix[][] = new int[4][4];
        // Scanner sc = new Scanner(System.in);
        // for(int i = 0; i < matrix.length; i++){
        // for(int j = 0; j < matrix[i].length; j++){
        // matrix[i][j] = sc.nextInt();
        // }
        // }
        int matrix[][] = { {1, 2, 3, 4 }, {5, 6, 7, 8 }, {9, 10, 11, 12 }, {13, 14, 15, 16 } };
        spiral(matrix);
        // sc.close();
    }

}