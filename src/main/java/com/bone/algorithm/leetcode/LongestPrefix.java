package com.bone.algorithm.leetcode;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * @author hejiwei
 */
public class LongestPrefix {

    public static String solution(String[] strs) {
        String commonPrefix = "";
        if (strs.length == 0) {
            return commonPrefix;
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String firstStr = strs[0];
        boolean stop = false;
        int index = -1;
        int j = 0;
        for (; j < firstStr.length(); j++) {
            for (int i = 1; i < strs.length; i++) {
                if (j >= strs[i].length() || !(Character.compare(firstStr.charAt(j), strs[i].charAt(j)) == 0)) {
                    stop = true;
                    break;
                }
            }
            if (stop) {
                index = j;
                break;
            }
        }
        //全部遍历完
        if (j == firstStr.length()) {
            index = j;
        }
        if (index != -1) {
            commonPrefix = firstStr.substring(0, index);
        }
        return commonPrefix;
    }

    public static void main(String[] args) {
        String[] strArr2 = new String[]{"c", "c"};
        System.out.println(solution(strArr2));
    }
}
