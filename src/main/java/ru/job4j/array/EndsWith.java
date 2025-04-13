package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        if (postfix.length > word.length) {
            return false;
        }
        for (int i = 0; i < postfix.length; i++) {
            if (word[word.length - postfix.length + i] != postfix[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}