package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        char first = board[0][column];
        for (int row = 1; row < board.length; row++) {
            if (board[row][column] != first) {
                result = false;
                break;
            }
        }
        return result;
    }
}