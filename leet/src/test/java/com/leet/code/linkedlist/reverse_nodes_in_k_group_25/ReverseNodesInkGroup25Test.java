package com.leet.code.linkedlist.reverse_nodes_in_k_group_25;

import org.junit.jupiter.api.Test;

class ReverseNodesInkGroup25Test {

    @Test
    public void caseOne() {
        ReverseNodesInkGroup25.ListNode listNode1 = new ReverseNodesInkGroup25.ListNode(1);
        ReverseNodesInkGroup25.ListNode listNode2 = new ReverseNodesInkGroup25.ListNode(2);
        ReverseNodesInkGroup25.ListNode listNode3 = new ReverseNodesInkGroup25.ListNode(3);
        ReverseNodesInkGroup25.ListNode listNode4 = new ReverseNodesInkGroup25.ListNode(4);
        ReverseNodesInkGroup25.ListNode listNode5 = new ReverseNodesInkGroup25.ListNode(5);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        // head = [1,2,3,4,5], k = 2
        ReverseNodesInkGroup25.ListNode listNode = ReverseNodesInkGroup25.reverseKGroup(listNode1, 2);

        System.out.println();


    }
}