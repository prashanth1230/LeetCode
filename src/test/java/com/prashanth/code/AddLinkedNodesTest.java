package com.prashanth.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddLinkedNodesTest {
    @Test
    public void testAddTwoNumbers() {
        AddLinkedNodes obj = new AddLinkedNodes();
        ListNode a1 = new ListNode(3);
        ListNode a2 = new ListNode(4, a1);
        ListNode a3 = new ListNode(2, a2);
        ListNode b1 = new ListNode(4);
        ListNode b2 = new ListNode(6, b1);
        ListNode b3 = new ListNode(5, b2);
        ListNode answer = obj.addTwoNumbers(a3, b3);
        assertEquals(answer.val, 7);
        assertEquals(answer.next.val, 0);
        assertEquals(answer.next.next.val, 8);
    }
}