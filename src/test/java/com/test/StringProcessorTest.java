package com.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringProcessorTest {
    @Test
    void testProcess() {
        StringProcessor processor = new StringProcessor();
        assertEquals("d", processor.process("aabcccbbad"));
        assertEquals("d", processor.process("aabbbad"));
        assertEquals("d", processor.process("aaad"));
        assertEquals("aabad", processor.process("aabcccbbbad"));
        assertEquals("aabad", processor.process("aabccccad"));
        assertEquals("aabccad", processor.process("aabccad"));
        assertEquals("", processor.process("aaa"));
    }
}