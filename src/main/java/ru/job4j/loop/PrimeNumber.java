package ru.job4j.loop;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(calc(5));
        System.out.println(calc(11));
        System.out.println(calc(2));
    }

    public static int calc(int finish) {
        int sum = 0;

            for (int i = 2; i <= finish; i++) {
            if (isPrime(i)) {
                sum += 1;
            }
        }
        return sum;
    }
    public static boolean isPrime(int finish) {

        for (int i = 2; i * i <= finish; i++) {
            if (finish % i == 0) {
                return false;
            }
        }
        return true;
    }
}