package com.bone.algorithm.leetcode;

public class TwoSum {

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {3,3};
        int[] solution = twoSum.solution(nums, 6);
        for (int s : solution) {
            System.out.println(s);
        }
    }

    public int[] solution(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int left = 0;
        int[] result = {0, 0};
        while (i < nums.length - 1) {
            left = nums[i];
            while (left + nums[j] != target && j > 0) {
                j = j - 1;
            }
            if (left + nums[j] == target && i != j) {
                result[0] = i;
                result[1] = j;
                break;
            }
            i++;
            j = nums.length - 1;
        }
        return result;
    }
}
