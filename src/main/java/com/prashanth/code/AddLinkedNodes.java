package com.prashanth.code;

import java.math.BigInteger;

public class AddLinkedNodes {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger firstArray = extractValues(l1);
        BigInteger secondArray = extractValues(l2);
        String sum = firstArray.add(secondArray) + "";
        String[] values = sum.split("");
        ListNode returnValue = new ListNode();
        for (int i = 0; i < values.length; i++) {
            if (i == 0) {
                returnValue = new ListNode(Integer.parseInt(values[i]));
            } else {
                returnValue = new ListNode(Integer.parseInt(values[i]), returnValue);
            }
        }
        return returnValue;
    }

    private BigInteger extractValues(ListNode node) {
        ListNode currentNode = new ListNode(node.val, node.next);
        StringBuilder value = new StringBuilder();
        while (true) {
            if (value.equals("")) {
                value.append(node.val);
            } else {
                value.append(currentNode.val);
            }
            if (currentNode.next == null) {
                break;
            } else {
                currentNode = new ListNode(currentNode.next.val, currentNode.next.next);
            }
        }
        return new BigInteger(value.reverse().toString());
    }


}
