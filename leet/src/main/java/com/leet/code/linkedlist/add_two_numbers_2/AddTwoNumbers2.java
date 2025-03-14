package com.leet.code.linkedlist.add_two_numbers_2;

public class AddTwoNumbers2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode response = new ListNode((l1.val + l2.val) % 10);
        int tmp = (l1.val + l2.val) / 10;
        l1 = l1.next;
        l2 = l2.next;

        dummy.next = response;

        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {

                response.next = new ListNode((l1.val + l2.val + tmp) % 10);
                tmp = (l1.val + l2.val + tmp) / 10;
                l1 = l1.next;
                l2 = l2.next;

            } else if (l1 != null) {

                response.next = new ListNode((l1.val + tmp) % 10);
                tmp = (l1.val + tmp) / 10;
                l1 = l1.next;
            } else {

                response.next = new ListNode((l2.val + tmp) % 10);
                tmp = (l2.val + tmp) / 10;
                l2 = l2.next;
            }
            response = response.next;
        }

        if (tmp > 0) {
            response.next = new ListNode(tmp);
        }

        return dummy.next;
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
