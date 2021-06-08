package com.prashanth.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    public void testPalindrome() {
        Palindrome palindrome = new Palindrome();
        assertEquals(palindrome.isPalindrome(121), true);
        assertEquals(palindrome.isPalindrome(1121), false);
        assertEquals(palindrome.isPalindrome(-121), false);
        assertEquals(palindrome.isPalindrome(1210), false);
        assertEquals(palindrome.isPalindrome(1), true);
        assertEquals(palindrome.isPalindrome(0), true);
        assertEquals(palindrome.isPalindrome(-1), false);
    }
}