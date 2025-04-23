package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SandboxTest {
    @Test
    void twoSum() {
        int[] nums = {2, 7, 11, 15};
        Sandbox sandbox = new Sandbox();
        int[] result = sandbox.twoSum(nums, 9);
        Assertions.assertArrayEquals(new int[] {0, 1}, result);
    }
    @Test
    void twoSum1() {
        int[] nums = {3, 2, 4};
        Sandbox sandbox = new Sandbox();
        int[] result = sandbox.twoSum(nums, 6);
        Assertions.assertArrayEquals(new int[] {1, 2}, result);
    }
    @Test
    void twoSum2() {
        int[] nums = {3, 3};
        Sandbox sandbox = new Sandbox();
        int[] result = sandbox.twoSum(nums, 6);
        Assertions.assertArrayEquals(new int[] {0, 1}, result);
    }
}