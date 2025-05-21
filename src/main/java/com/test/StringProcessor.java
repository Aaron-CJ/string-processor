package com.test;

public class StringProcessor {
    public String process(String input) {
        boolean changed;
        StringBuilder sb = new StringBuilder(input.length()); // 预分配容量
        do {
            changed = false;
            sb.setLength(0); // 清空内容，复用对象

            for (int i = 0; i < input.length(); i++) {
                char current = input.charAt(i);
                int count = 1;
                int start = i;
                while (i + 1 < input.length() && input.charAt(i + 1) == current) {
                    count++;
                    i++;
                }
                if (count >= 3) {
                    changed = true;
                } else {
                    sb.append(input, start, i + 1);
                }
            }

            input = sb.toString();
        } while (changed);
        return input;
    }
}