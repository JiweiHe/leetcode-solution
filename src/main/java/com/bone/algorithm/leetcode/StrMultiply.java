package com.bone.algorithm.leetcode;

public class StrMultiply {

    public static String solution(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        int length1 = chars1.length;
        int length2 = chars2.length;
        if (length1 == 1) {
            if (chars1[0] == '0') {
                return "0";
            }
        }
        if (length2 == 1) {
            if (chars2[0] == '0') {
                return "0";
            }
        }
        int[] result = new int[length1 + length2];
        int[] num1 = new int[length1];
        for (int i = 0; i < length1; i++) {
            num1[length1 - i - 1] = Integer.parseInt(chars1[i] + "");
        }
        int[] num2 = new int[length2];
        for (int i = 0; i < length2; i++) {
            num2[length2 - i - 1] = Integer.parseInt(chars2[i] + "");
        }
        for (int i = 0; i < length1; i++) {
            for(int j = 0; j < length2; j++) {
                result[i + j] += num1[i] * num2[j];
            }
        }
        for (int i = 0; i < result.length; i++) {
            if (result[i] > 9) {
                if (i + 1 < result.length) {
                    result[i + 1] = result[i + 1] + (result[i] / 10);
                    result[i] = result[i] % 10;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        boolean isFirst = true;
        for (int i = result.length - 1; i >= 0; i--) {
            if (result[i] != 0) {
                isFirst = false;
                stringBuilder.append(result[i]);
            } else {
                if (!isFirst) {
                    stringBuilder.append(result[i]);
                }
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("10000", "10000"));
        System.out.println(solution("98", "9"));
        System.out.println(solution("10", "0"));
    }
}
