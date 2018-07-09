package com.bone.algorithm.leetcode;

/**
 * @author hejiwei
 */
public class ReverseNum {

    public static void main(String[] args) {
        System.out.println(solution(88993890));
    }

    public static Integer solution(int x) {//num => 19888
        long[] output = new long[10];
        boolean isFirst = true;
        boolean isNegative = false;
        if (x < 0) {
            x = -x;
            isNegative = true;
        }
        int i = 0;
        while(x >= 10) {
            long tail = x % 10;
            x = x / 10;
            if (tail != 0 || !isFirst) {
                output[i++] = tail;
                isFirst = false;
            }
        }
        output[i] = x;
        String result = "";
        for (int j = 0; j <= i; j++) {
            result = result + output[j];
        }
        long longResult = isNegative ? -Long.parseLong(result) : Long.parseLong(result);
        if (longResult > Integer.MAX_VALUE || longResult < Integer.MIN_VALUE) {
            return 0;
        } else {
            return isNegative ? -Integer.parseInt(result) : Integer.parseInt(result);
        }
    }
}
