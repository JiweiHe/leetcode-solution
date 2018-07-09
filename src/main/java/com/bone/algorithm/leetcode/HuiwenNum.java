package com.bone.algorithm.leetcode;

public class HuiwenNum {

    public static void main(String[] args) {
        System.out.println(solution(11211));
        System.out.println(solution(11212));
    }

    private static boolean solution(int x) {
        int tmp = x;
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        if (x % 10 == 0) {
            return false;
        }

        int reverse = 0;
        while (true) {
            int r = x % 10;
            reverse = reverse * 10 + r;
            x = x / 10;
            if (x < 10) {
                reverse = reverse * 10 + x;
                break;
            }
        }
        return reverse == tmp;
    }
}
