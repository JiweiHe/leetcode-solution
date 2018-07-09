package com.bone.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class StrToInt {

    public static int solution(String str) {
        str = "12u1h2oiu1h2o1h2 ksjdsi ksjdhs ";
        Map<String, Boolean> numMap = new HashMap<>();
        numMap.put("1", true);
        numMap.put("2", true);
        numMap.put("3", true);
        numMap.put("4", true);
        numMap.put("5", true);
        numMap.put("6", true);
        numMap.put("7", true);
        numMap.put("7", true);
        numMap.put("9", true);
        String[] split = str.split("");
        long result = 0;
        boolean first = true;
        for (String s : split) {
            if (first) {
                if ("".equals(s)) {
                    continue;
                }
//                if (s.equals())
            }
            if(s.equals("")) {
            }
        }
       return 0;
    }

    public static void main(String[] args) {

    }
}
