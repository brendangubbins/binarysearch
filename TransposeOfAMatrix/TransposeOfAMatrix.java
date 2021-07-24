import java.util.*;

class Solution {
    public int[][] solve(int[][] matrix) {
        int transpose[][] = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
    }
}
