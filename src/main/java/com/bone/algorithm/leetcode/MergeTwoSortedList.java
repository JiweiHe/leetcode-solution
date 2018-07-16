package com.bone.algorithm.leetcode;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * @author hejiwei
 */
public class MergeTwoSortedList {


    public static ListNode mergeTwoLists(ListNode listNode1, ListNode listNode2) {
        if (listNode1 == null || listNode2 == null) {
            if (listNode1 == null) {
                return listNode2;
            } else {
                return listNode1;
            }
        }
        ListNode sortedListNode = new ListNode(-1);
        ListNode sortedCursorListNode = sortedListNode;

        while (listNode1 != null && listNode2 != null) {
            if (listNode1.val < listNode2.val) {
                sortedCursorListNode.next = new ListNode(listNode1.val);
                listNode1 = listNode1.next;
            } else {
                sortedCursorListNode.next = new ListNode(listNode2.val);
                listNode2 = listNode2.next;
            }
            sortedCursorListNode = sortedCursorListNode.next;
        }
        sortedCursorListNode.next = listNode1 == null ? listNode2 : listNode1;
        return sortedListNode.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(4);

        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(3);
        listNode2.next.next = new ListNode(4);

        ListNode result = mergeTwoLists(listNode1, listNode2);

        while(result != null) {
            System.out.print(result.getVal());
            result = result.next;
        }
    }
}
