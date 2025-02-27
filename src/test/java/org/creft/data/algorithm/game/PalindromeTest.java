package org.creft.data.algorithm.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void isPalindrome() {

        String isPalindrome = "abccba";
        String isNotPalindrome = "abcxyz";
        assertTrue(Palindrome.isPalindrome(isPalindrome));
        assertFalse(Palindrome.isPalindrome(isNotPalindrome));

        String isPalindromeWithGarbage = "A man, a plan, a canal: Panama";
        assertTrue(Palindrome.isPalindrome(isPalindromeWithGarbage));

        String edgeCase = "0P";
        assertFalse(Palindrome.isPalindrome(edgeCase));

    }
}