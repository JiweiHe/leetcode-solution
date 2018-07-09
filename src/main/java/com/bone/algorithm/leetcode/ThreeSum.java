package com.bone.algorithm.leetcode;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {3, 0, -2, -1, 1, 2};
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> results = threeSum.solution(nums);
        for (List<Integer> result : results) {
            for (int num : result) {
                System.out.print(num);
            }
            System.out.println("============");
        }
    }

    public List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);


        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] < 0) {
                    ++j;
                    while (nums[j] == nums[j - 1] && j < k) {
                        ++j;
                    }
                } else if (nums[i] + nums[j] + nums[k] > 0) {
                    --k;
                    while (nums[k] == nums[k + 1] && j < k) {
                        --k;
                    }
                } else {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    ++j;
                    --k;
                    while (nums[j] == nums[j - 1] && j < k) {
                        ++j;
                    }
                    while(nums[k] == nums[k + 1] && j < k) {
                        --k;
                    }
                }
            }
        }
        return result;

//        return new ArrayList<>(set);
    }
}

