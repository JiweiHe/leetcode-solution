package com.bone.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * @author hejiwei
 */
public class ListNodeDelete {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> list = new ArrayList<>();
        ListNode trace = head;
        while (true) {
            if (trace == null) {
                break;
            }
            list.add(trace);
            trace = trace.next;
        }
        int index = list.size() - n;
        if (index == 0) {
            if (list.size() > 1) {
                return list.get(1);
            } else {
                return null;
            }
        } else {
            list.get(index - 1).next = list.get(index).next;
            return head;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(2);
        listNode.next = new ListNode(1);
        ListNode result = removeNthFromEnd(listNode, 2);
        while(result != null) {
            System.out.print(result.val);
            result = result.next;
        }
    }
}
