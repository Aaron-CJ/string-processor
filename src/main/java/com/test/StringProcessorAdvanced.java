package com.test;

public class StringProcessorAdvanced {
    public String process(String input) {
        boolean changed;
        StringBuilder sb = new StringBuilder(input.length()); // 预分配容量
        do {
            changed = false;
            sb.setLength(0); // 清空内容，复用对象

            for (int i = 0; i < input.length(); i++) {
                char current = input.charAt(i);
                int count = 1;
                while (i + 1 < input.length() && input.charAt(i + 1) == current) {
                    count++;
                    i++;
                }
                if (count >= 2) {
                    changed = true;
                    if (i - count >= 0 && i + 1 < input.length()) {
                        sb.append(input.charAt(i - count)).append(input.substring(i + 1));
                        break;
                    }
                } else {
                    sb.append(current);
                }
            }

            input = sb.toString();
        } while (changed);
        return input;
    }
}