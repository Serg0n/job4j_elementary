package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] prefix) {
        boolean result = true;
        int pref = prefix.length;
        if (word.length < prefix.length) {
            result = false;
        } else {
            for (int i = 0; i < pref; i++) {
                if (prefix[i] != word[i]) {
                    result = false;
                    break;
                }
            }
        }
    return result;
    }
}