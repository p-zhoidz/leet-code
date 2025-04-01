package com.leet.code.linkedlist.reverse_nodes_in_k_group_25;

;

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
class ReverseNodesInkGroup25 {
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode result = new ListNode();

        ListNode currIterationHead = null;
        ListNode prevIterationHead = null;

        while (head != null) {
            ListNode current = head;
            ListNode tmp = null;
            currIterationHead = null;


            for (int i = 0; i < k; i++) {

                if (head == null) {
                    tmp = current;
                    break;
                }

                ListNode iteratated = new ListNode(head.val);
                iteratated.next = tmp;
                tmp = iteratated;
                head = head.next;
                if(currIterationHead == null) {
                    currIterationHead = tmp;
                }

            }

            if (prevIterationHead != null) {
                prevIterationHead.next = tmp;
            }

            prevIterationHead = currIterationHead;

            if (result.next == null) {
                result.next = tmp;
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