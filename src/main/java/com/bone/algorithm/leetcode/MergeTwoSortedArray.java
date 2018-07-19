package com.bone.algorithm.leetcode;

/**
 * @author hejiwei
 */
public class MergeTwoSortedArray {

    public static void solution(int[] nums1, int m, int[] nums2, int n) {
        int mergedArrayIndex = m + n - 1;
        int nums1Index = m - 1;
        int nums2Index = n - 1;
        while (nums1Index >= 0 && nums2Index >= 0) {
            if (nums1[nums1Index] > nums2[nums2Index]) {
                nums1[mergedArrayIndex--] = nums1[nums1Index--];
            } else {
                nums1[mergedArrayIndex--] = nums2[nums2Index--];
            }
        }
        while (nums2Index >= 0) {
            nums1[mergedArrayIndex--] = nums2[nums2Index--];
        }
        for (int s : nums1) {
            System.out.print(s);
        }
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{1,2,3,0,0,0};
        int[] num2 = new int[]{2,5,6};
        solution(num1, 3, num2, 3);
    }
}
