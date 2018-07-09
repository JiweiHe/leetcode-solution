package com.bone.algorithm.leetcode;

/**
 * 给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * @author hejiwei
 */
public class ArrayAddOne {

    public static int[] solution(int[] num) {
        int carry = 0;
        num[num.length - 1] += 1;
        for (int i = num.length - 1; i >= 0; i--) {
            int sum = num[i] + carry;
            num[i] = sum % 10;
            carry = sum / 10;
        }
        int[] results;
        if (carry != 0) {
            results = new int[num.length + 1];
            results[0] = carry;
            System.arraycopy(num, 0, results, 1, results.length - 1);
        } else {
            results = new int[num.length];
            System.arraycopy(num, 0, results, 0, results.length);
        }
        return results;
    }

    public static void main(String[] args) {
        int[] nums = {9};
        int[] solution = solution(nums);
        for (int i : solution) {
            System.out.print(i);
        }
        System.out.println();
    }
}
