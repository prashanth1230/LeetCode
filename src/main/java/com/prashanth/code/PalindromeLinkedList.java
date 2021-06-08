package com.prashanth.code;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head != null) {
            List<Integer> extractedList = new ArrayList<>();
            ListNode currentNode = new ListNode(head.val, head.next);
            while (true) {
                extractedList.add(currentNode.val);
                if (currentNode.next == null) {
                    break;
                } else {
                    currentNode = new ListNode(currentNode.next.val, currentNode.next.next);
                }
            }
            for (int i = 0; i < extractedList.size() - i; i++) {
                if (extractedList.get(i) != extractedList.get(extractedList.size() -1 - i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
