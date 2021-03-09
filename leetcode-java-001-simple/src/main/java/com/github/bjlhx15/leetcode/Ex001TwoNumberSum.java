package com.github.bjlhx15.leetcode;

//    给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
//    你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
//
//     
//
//    示例:
//
//    给定 nums = [2, 7, 11, 15], target = 9
//
//    因为 nums[0] + nums[1] = 2 + 7 = 9
//    所以返回 [0, 1]
// 算法复杂度：https://www.cnblogs.com/bjlhx/p/10653677.html

import java.util.HashMap;
import java.util.Map;

public class Ex001TwoNumberSum {
    // 两遍循环
    // 时间复杂度：O(n*n)
    // 空间复杂度：O(1)
    public static int[] twoSum001(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int ex = target - nums[i];
                if (ex == nums[j]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new RuntimeException("no exist");
    }

    // 用hash存储
    // 时间复杂度：O(n) 少了嵌套循环
    // 空间复杂度：O(n) 多了n个元素的空间开销
    public static int[] twoSumTwoHash(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] { i, map.get(target - nums[i]) };
            }
        }
        throw new RuntimeException("不存在");
    }

    // 用hash存储 直接判断 上述的优化
    // 时间复杂度：O(n) 一次循环
    // 空间复杂度：O(n) 多了n个元素的空间开销
    public static int[] twoSumOneHash(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int exp = target - nums[i];
            if (map.containsKey(exp)) {
                return new int[] { i, map.get(exp) };
            }
            map.put(nums[i], i);
        }
        throw new RuntimeException("不存在");
    }
}
