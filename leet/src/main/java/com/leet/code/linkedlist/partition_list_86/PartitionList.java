package com.leet.code.linkedlist.partition_list_86;

public class PartitionList {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode partition(ListNode head, int x) {

        ListNode lower = new ListNode();
        ListNode upper = new ListNode();

        ListNode lowerPointer = lower;
        ListNode upperPointer = upper;


        while (head != null) {
            if (head.val < x) {
                lower.next = head;
                lower = lower.next;
            } else {
                upper.next = head;
                upper = upper.next;
            }
            head = head.next;
        }

        upper.next = null;
        lower.next = upperPointer.next;


        return lowerPointer.next;

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}



