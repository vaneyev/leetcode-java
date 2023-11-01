package org.example;

/**
 * Valid Sudoku
 */
public class Solution36 {
    public boolean isValidSudoku(char[][] board) {
        boolean[] s;
        int si;
        int i, j, k, l;
        char c;
        for (i = 0; i < 9; i++) {
            s = new boolean[9];
            for (j = 0; j < 9; j++) {
                c = board[i][j];
                if (c != '.') {
                    si = c - '1';
                    if (s[si]){
                        return false;
                    }
                    s[si] = true;
                }
            }
        }
        for (i = 0; i < 9; i++) {
            s = new boolean[9];
            for (j = 0; j < 9; j++) {
                c = board[j][i];
                if (c != '.') {
                    si = c - '1';
                    if (s[si]){
                        return false;
                    }
                    s[si] = true;
                }
            }
        }
        for (k = 0; k < 9; k += 3) {
            for (l = 0; l < 9; l += 3) {
                s = new boolean[9];
                for (i = k; i < k + 3; i++) {
                    for (j = l; j < l + 3; j++) {
                        c = board[i][j];
                        if (c != '.') {
                            si = c - '1';
                            if (s[si]){
                                return false;
                            }
                            s[si] = true;
                        }
                    }
                }
            }
        }
        return true;
    }
}
