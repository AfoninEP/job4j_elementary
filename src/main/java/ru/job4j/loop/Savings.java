package ru.job4j.loop;

public class Savings {

    public static void main(String[] args) {

        System.out.println(years(500, 100, 5));
        System.out.println(years(1000, 200, 10));
        System.out.println(years(1000, 100, 20));
    }

    public static int years(double goal, double annualDeposit, double percent) {
        int years = 0;
        double total = 0;
        do { total = total + (annualDeposit + total * percent * 0.01);
            years += 1;
        } while (total < goal);
        return years;
    }
}