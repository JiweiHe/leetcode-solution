package com.bone.algorithm.leetcode;

/**
 * 在一排座位（ seats）中，1 代表有人坐在座位上，0 代表座位上是空的。
 * <p>
 * 至少有一个空座位，且至少有一人坐在座位上。
 * <p>
 * 亚历克斯希望坐在一个能够使他与离他最近的人之间的距离达到最大化的座位上。
 * <p>
 * 返回他到离他最近的人的最大距离。
 *
 * @author hejiwei
 */
public class MaximizeDistance {

    public static int maxDistToClosest(int[] seats) {
        int index = 0;
        int max = 0;
        while (index < seats.length) {
            if (seats[index] != 0) {
                index++;
                continue;
            }
            int left = index - 1;
            while (left >= 0 && seats[left] == 0) {
                left--;
            }
            int right = index + 1;
            while (right < seats.length && seats[right] == 0) {
                right++;
            }
            int leftMin = Integer.MAX_VALUE;
            int rightMin = Integer.MAX_VALUE;
            if (left >= 0 && seats[left] == 1) {
                leftMin = index - left;
            }
            if (right < seats.length && seats[right] == 1) {
                rightMin = right - index;
            }
            if (leftMin < rightMin) {
                if (leftMin > max) {
                    max = leftMin;
                }
            } else {
                if (rightMin > max) {
                    max = rightMin;
                }
            }
            index++;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 0, 0, 0, 1, 0, 1};
        int[] arr2 = new int[]{1, 0, 0, 0};
        int[] arr3 = new int[]{0, 1};
        System.out.println(maxDistToClosest(arr1));
        System.out.println(maxDistToClosest(arr2));
        System.out.println(maxDistToClosest(arr3));
    }
}
