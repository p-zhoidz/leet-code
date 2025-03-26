package com.leet.code.linkedlist.remove_duplicates_from_sorted_list_82;


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
public class RemoveDuplicatesFromSortedList82 {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode result = new ListNode(-1, head);
        ListNode current = result;

        while (current.next != null && current.next.next != null) {
            if (current.next.val == current.next.next.val) {
                int val = current.next.val;
                while (current.next != null && current.next.val == val) {
                    current.next = current.next.next;
                }
            } else {
                current = current.next;
            }

        }

        return result.next;

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