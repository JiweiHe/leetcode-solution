package com.bone.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hejiwei
 */
public class RomaToInt {

    public static int solution(String s) {
        String[] split = s.split("");
        int sum = 0;
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("I", 1);
        mapping.put("V", 5);
        mapping.put("X", 10);
        mapping.put("L", 50);
        mapping.put("C", 100);
        mapping.put("D", 500);
        mapping.put("M", 1000);
        for (int i = 0; i < split.length; ) {
            String cur = split[i];
            if (i < split.length - 1) {
                if (cur.equals("I")) {
                    if (split[i + 1].equals("V")) {
                        sum = sum + 4;
                        i = i + 2;
                        continue;
                    } else if (split[i + 1].equals("X")) {
                        sum = sum + 9;
                        i = i + 2;
                        continue;
                    }
                } else if (cur.equals("X")) {
                    if (split[i + 1].equals("L")) {
                        sum = sum + 40;
                        i = i + 2;
                        continue;
                    } else if (split[i + 1].equals("C")) {
                        sum = sum + 90;
                        i = i + 2;
                        continue;
                    }
                } else if (cur.equals("C")) {
                    if (split[i + 1].equals("D")) {
                        sum = sum + 400;
                        i = i + 2;
                        continue;
                    } else if (split[i + 1].equals("M")) {
                        sum = sum + 900;
                        i = i + 2;
                        continue;
                    }
                }
            }
            sum = sum + mapping.get(cur);
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(solution("III"));
        System.out.println(solution("IV"));
        System.out.println(solution("IX"));
        System.out.println(solution("LVIII"));
        System.out.println(solution("MCMXCIV"));
    }
}
