package com.prashanth.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListTest {

    @Test
    void isPalindromeSuccess() {
        PalindromeLinkedList obj = new PalindromeLinkedList();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2, listNode1);
        ListNode listNode3 = new ListNode(2, listNode2);
        ListNode listNode4 = new ListNode(1, listNode3);
        assertEquals(obj.isPalindrome(listNode4), true);
    }

    @Test
    void isPalindromeFailure() {
        PalindromeLinkedList obj = new PalindromeLinkedList();
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(1, listNode1);
        assertEquals(obj.isPalindrome(listNode2), false);
    }
}