package com.bone.algorithm.leetcode;

/**
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 * <p>
 * 输入为非空字符串且只包含数字 1 和 0。
 *
 * @author hejiwei
 */
public class BinaryStrSum {

    public static String solution(String str1, String str2) {
        String[] strArr1 = str1.split("");
        String[] strArr2 = str2.split("");
        int i = strArr1.length;
        int j = strArr2.length;
        int[] sum = new int[i > j ? i : j];
        int carry = 0;
        int index = sum.length - 1;
        while (true) {
            int a = 0;
            if (i > 0) {
                a = Integer.parseInt(strArr1[i - 1]);
                i = i - 1;
            }
            int b = 0;
            if (j > 0) {
                b = Integer.parseInt(strArr2[j - 1]);
                j = j - 1;
            }
            sum[index--] = (a + b + carry) % 2;
            carry = (a + b + carry) / 2;
            if (i == 0 && j == 0) {
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (carry != 0) {
            sb.append(carry);
        }
        for (int s : sum) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("110", "11"));
    }
}
