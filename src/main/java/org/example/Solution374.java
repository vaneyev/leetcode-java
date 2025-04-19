package org.example;

/**
 * Guess Number Higher or Lower
 */
public class Solution374 {
    private final int pickedNumber;

    public Solution374(int pickedNumber) {
        this.pickedNumber = pickedNumber;
    }

    public int guessNumber(int n) {
        int left = 1, right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int answer = guess(mid);
            if (answer == 0) {
                return mid;
            }
            if (answer == 1) {
                left = mid + 1;
            }
            if (answer == -1) {
                right = mid - 1;
            }
        }
        return -1;
    }

    public int guess(int num) {
        if (pickedNumber < num) {
            return -1;
        }
        if (pickedNumber > num) {
            return 1;
        }
        return 0;
    }
}
