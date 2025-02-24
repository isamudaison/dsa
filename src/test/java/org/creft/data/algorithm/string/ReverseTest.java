package org.creft.data.algorithm.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    void reverseSentence() {

        String forwardSentence = "Hello world";

        assertEquals("world Hello", Reverse.reverseSentence(forwardSentence));
    }

}