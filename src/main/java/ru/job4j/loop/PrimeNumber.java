package ru.job4j.loop;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(calc(5));
    }

    public static int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            if (CheckPrimeNumber.check(i)) {
        count++;
            }
        }
        return count;

    }
}