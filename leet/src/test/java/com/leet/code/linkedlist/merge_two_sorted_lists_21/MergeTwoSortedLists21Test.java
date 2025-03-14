package com.leet.code.linkedlist.merge_two_sorted_lists_21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeTwoSortedLists21Test {


    @Test
    public void caseTwo() {
        MergeTwoSortedLists21.ListNode listNode1 = new MergeTwoSortedLists21.ListNode(1);
        MergeTwoSortedLists21.ListNode listNode11 = new MergeTwoSortedLists21.ListNode(2);
        MergeTwoSortedLists21.ListNode listNode12 = new MergeTwoSortedLists21.ListNode(4);
        listNode1.next = listNode11;
        listNode11.next = listNode12;

        MergeTwoSortedLists21.ListNode listNode2 = new MergeTwoSortedLists21.ListNode(1);
        MergeTwoSortedLists21.ListNode listNode21 = new MergeTwoSortedLists21.ListNode(3);
        MergeTwoSortedLists21.ListNode listNode22 = new MergeTwoSortedLists21.ListNode(4);
        listNode2.next = listNode21;
        listNode21.next = listNode22;

        MergeTwoSortedLists21.ListNode listNode = MergeTwoSortedLists21.mergeTwoLists(listNode1, listNode2);
        int[] ints = {1,1,2,3,4,4};


        for (int i = 0; i < ints.length; i++) {
            Assertions.assertEquals(ints[i], listNode.val);
            listNode = listNode.next;
        }
    }

}