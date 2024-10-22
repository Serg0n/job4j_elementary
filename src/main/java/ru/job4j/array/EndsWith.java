package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        if (word.length < postfix.length) {
            result = false;
        } else {
            for (int i = postfix.length; i >= 0; i--) {
                if (postfix[postfix.length - 1] != word[word.length - 1]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}