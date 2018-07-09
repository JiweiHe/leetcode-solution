package com.bone.algorithm.leetcode;

/**
 * @author hejiwei
 */
public class ListNodeTwoNumAdd {

    public static ListNode addTwoNum(ListNode listNode1, ListNode listNode2) {
        ListNode total = null;
        ListNode next = null;
        int carry = 0;
        while (listNode1 != null || listNode2 != null) {
            int l1 = listNode1 != null ? listNode1.val : 0;
            int l2 = listNode2 != null ? listNode2.val : 0;
            int sum = (l1 + l2 + carry);
            carry = sum > 9 ? sum / 10 : 0;
            sum = sum % 10;
            if (total == null) {
                total = new ListNode(sum);
            } else {
                if (next == null) {
                    next =  new ListNode(sum);
                    total.next = next;
                } else {
                    next.next = new ListNode(sum);
                    next = next.next;
                }
            }
            listNode1 = listNode1 != null ? listNode1.next : null;
            listNode2 = listNode2 != null ? listNode2.next : null;
        }
        if (carry != 0) {
            if (next != null) {
                next.next = new ListNode(carry);
            } else {
                total.next = new ListNode(carry);
            }
        }
        return total;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(5);
        ListNode listNode2 = new ListNode(5);
        ListNode listNode = addTwoNum(listNode1, listNode2);
        while (listNode != null) {
            System.out.println(listNode.getVal());
            listNode = listNode.next;
        }
    }
}
