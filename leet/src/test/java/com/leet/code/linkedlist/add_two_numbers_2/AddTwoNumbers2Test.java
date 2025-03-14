package com.leet.code.linkedlist.add_two_numbers_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddTwoNumbers2Test {

    @Test
    public void caseTwo() {
        AddTwoNumbers2.ListNode listNode1 = new AddTwoNumbers2.ListNode(2);
        AddTwoNumbers2.ListNode listNode11 = new AddTwoNumbers2.ListNode(4);
        AddTwoNumbers2.ListNode listNode12 = new AddTwoNumbers2.ListNode(3);
        listNode1.next = listNode11;
        listNode11.next = listNode12;

        AddTwoNumbers2.ListNode listNode2 = new AddTwoNumbers2.ListNode(5);
        AddTwoNumbers2.ListNode listNode21 = new AddTwoNumbers2.ListNode(6);
        AddTwoNumbers2.ListNode listNode22 = new AddTwoNumbers2.ListNode(4);
        listNode2.next = listNode21;
        listNode21.next = listNode22;

        AddTwoNumbers2.ListNode listNode = AddTwoNumbers2.addTwoNumbers(listNode1, listNode2);
        int[] ints = {7, 0, 8};
        for (int i = 0; i < ints.length; i++) {
            Assertions.assertEquals(ints[i], listNode.val);
            listNode = listNode.next;
        }
    }

}