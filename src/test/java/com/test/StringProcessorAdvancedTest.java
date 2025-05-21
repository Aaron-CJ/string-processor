package com.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringProcessorAdvancedTest {
    @Test
    void testProcess() {
        StringProcessorAdvanced processor = new StringProcessorAdvanced();
        assertEquals("d", processor.process("abcccbad"));
        assertEquals("d", processor.process("abbbad"));
        assertEquals("d", processor.process("aaad"));
        assertEquals("d", processor.process("abcccbbbad"));
        assertEquals("d", processor.process("abccccbbad"));
        assertEquals("d", processor.process("abccad"));
        assertEquals("abcd", processor.process("abcd"));
        assertEquals("", processor.process("aabbccdd"));
    }
}