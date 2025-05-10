package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Remove Invalid Parentheses
 */
/*

Initial Call:
Start DFS with the original string, from index 0, and tracking the last removed index (last_i, last_j).

Use par = ['(', ')'] for the first pass (left to right).

Left-to-Right Pass:
Count the balance with a stack variable: increment for '(', decrement for ')'.

If stack < 0, it means too many ')', and we must remove one.

Try removing each redundant ')', skipping duplicates, and recursively call the function with the new string.

Right-to-Left Pass:
When the string is balanced left to right, reverse it and repeat the process with par = [')', '('] to handle extra '('.
Valid Case:
If after the second pass the string is valid, add it to the result list.

 */
public class Solution301 {
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        dfs(s, result, 0, 0, new char[]{'(', ')'});
        return result;
    }
    public void dfs(String s, List<String> result, int iLast, int jLast, char[] par) {
        for (int stack = 0, i = iLast; i < s.length(); i++) {
            if (s.charAt(i) == par[0]) stack++;
            if (s.charAt(i) == par[1]) stack--;
            if (stack >= 0) continue;
            for (int j = jLast; j <= i; j++)
                if (s.charAt(j) == par[1] && (j == jLast || s.charAt(j - 1) != par[1]))
                    dfs(s.substring(0, j) + s.substring(j + 1), result, i, j, par);
            return;
        }
        String reversed = new StringBuilder(s).reverse().toString();
        if (par[0] == '(') // finished left to right
            dfs(reversed, result, 0, 0, new char[]{')', '('});
        else // finished right to left
            result.add(reversed);
    }
}
