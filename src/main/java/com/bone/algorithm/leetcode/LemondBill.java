package com.bone.algorithm.leetcode;

/**
 * @author hejiwei
 */
public class LemondBill {

    public static boolean sulotion(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five > 0) {
                    five--;
                    ten++;
                } else {
                    return false;
                }
            } else {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five = five - 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] bills3 = new int[]{5,5,10,10,5,20,5,10,5,5};
        System.out.println(sulotion(bills3));

    }
}
