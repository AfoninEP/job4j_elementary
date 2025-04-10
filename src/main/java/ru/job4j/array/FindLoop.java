package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int element) {
        int result = -1; /* если элемента нет в массиве, то возвращаем -1. */
        for (int index = 0; index < data.length; index++) {
            if (data[index] == element) {
                result = index;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] data = new int[] {5, 10, 3};
        for (int index = 0; index < data.length; index++) {
            System.out.println(data[index]);
        }
    }
}