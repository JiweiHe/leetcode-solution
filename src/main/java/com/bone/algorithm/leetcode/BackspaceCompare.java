package com.bone.algorithm.leetcode;

import java.util.Stack;
import java.util.stream.Collectors;

/**
 * 给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。
 *
 * @author hejiwei
 */
public class BackspaceCompare {

    public static boolean solution(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        Stack<Character> sc1 = new Stack<>();
        for (char c : chars1) {
            if (c == '#') {
                if (!sc1.empty()) {
                    sc1.pop();
                }
            } else {
                sc1.push(c);
            }
        }
        char[] chars2 = str2.toCharArray();
        Stack<Character> sc2 = new Stack<>();
        for (char c : chars2) {
            if (c == '#') {
                if (!sc2.isEmpty()) {
                    sc2.pop();
                }
            } else {
                sc2.push(c);
            }
        }
        String result1 = sc1.stream().map(c -> c + "").collect(Collectors.joining(""));
        String result2 = sc2.stream().map(c -> c + "").collect(Collectors.joining(""));
        return result1.equals(result2);
    }

    public static void main(String[] args) {
        solution("ab#c", "ad#c");
        solution("ab##", "c#d#");
    }
}
