package ru.job4j.loop;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        System.out.println(check(5));
        System.out.println(check(4));
        System.out.println(check(1));
    }

    public static boolean check(int number) {
        boolean prime = number > 1;
        if (number <= 1) {
            prime = false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}