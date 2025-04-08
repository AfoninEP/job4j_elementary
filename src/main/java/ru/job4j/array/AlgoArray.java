/**
 * переменная для временного хранения значение ячейки с индексом 0/1/3
 * записываем в ячейку с индексом 0 значение ячейки с индексом 3/2/4
 * записываем в ячейку с индексом 3/2/4 значение временной переменной
 */
package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};

        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;

        int num = array[1];
        array[1] = array[2];
        array[2] = num;

        int number = array[3];
        array[3] = array[4];
        array[4] = number;

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}