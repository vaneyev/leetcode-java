package org.example;

/**
 * Search a 2D Matrix
 */
public class Solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0;
        int end = m * n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int i = mid / n;
            int j = mid % n;
            if (matrix[i][j] == target) {
                return true;
            }
            if (matrix[i][j] < target) {
                start = mid + 1;
            }
            if (matrix[i][j] > target) {
                end = mid - 1;
            }
        }
        return false;
    }
}
