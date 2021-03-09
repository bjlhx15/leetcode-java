package com.github.bjlhx15.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class Ex001TwoNumberSumTest {

    int nums[] = { 2, 7, 22, 15 };

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void twoSum001() {
        int target = 9;
        int[] ints = Ex001TwoNumberSum.twoSum001(nums, target);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void twoSumTwoHash() {
        int target = 9;
        int[] ints = Ex001TwoNumberSum.twoSumTwoHash(nums, target);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void twoSumOneHash() {
        int target = 22;
        int[] ints = Ex001TwoNumberSum.twoSumOneHash(nums, target);
        System.out.println(Arrays.toString(ints));
    }
}