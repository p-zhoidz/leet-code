package com.leet.code.arrays.copy_list_with_random_pointer_138;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CopyListWithRandomPointer138Test {

    @Test
    public void caseOne() {

        CopyListWithRandomPointer138.Node node0 = new CopyListWithRandomPointer138.Node(3);
        CopyListWithRandomPointer138.Node node1 = new CopyListWithRandomPointer138.Node(3);
        CopyListWithRandomPointer138.Node node2 = new CopyListWithRandomPointer138.Node(3);

        node0.next = node1;
        node1.next = node2;
        node1.random = node1;


        CopyListWithRandomPointer138.Node node = CopyListWithRandomPointer138.copyRandomList(node0);

        Assertions.assertNotNull(node);

    }

}