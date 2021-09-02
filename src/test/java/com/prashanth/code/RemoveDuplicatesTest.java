package com.prashanth.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    void removeDuplicates() {
        RemoveDuplicates obj = new RemoveDuplicates();
        int[] firstInput = new int[]{1,1,2};
        assertEquals(2, obj.removeDuplicates(firstInput));
        assertEquals(firstInput[0], 1);
        assertEquals(firstInput[1], 2);
        int[] secondInput = new int[]{0,0,1,1,1,2,2,3,3,4};
        assertEquals(5, obj.removeDuplicates(secondInput));
        assertEquals(0, secondInput[0]);
        assertEquals(1, secondInput[1]);
        assertEquals(2, secondInput[2]);
    }
}