package org.example;

/**
 * Rotate Image
 */
public class Solution48 {
    public void rotate(int[][] matrix) {
        int half = matrix.length / 2;
        int max = matrix.length - 1;
        int temp, i, j, ri, rj;
        for(i = 0; i < half; i++) {
            ri = max - i;
            for(j = i; j < ri; j++) {
                rj = max - j;
                temp = matrix[rj][i];
                matrix[rj][i] = matrix[ri][rj];
                matrix[ri][rj] = matrix[j][ri];
                matrix[j][ri] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }

    public void rotate2(int[][] matrix) {
        int i, j;
        for(i = 0; i < matrix.length; i++) {
            for(j = i + 1; j < matrix.length; j++) {
                matrix[i][j] ^= matrix[j][i];
                matrix[j][i] ^= matrix[i][j];
                matrix[i][j] ^= matrix[j][i];
            }
        }
        for(int[] row: matrix) {
            i = 0;
            j = matrix.length - 1;
            while(i < j) {
                row[i] ^= row[j];
                row[j] ^= row[i];
                row[i++] ^= row[j--];
            }
        }
    }
}
