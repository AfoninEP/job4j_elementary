package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

public class MathCalculator {

    public static double differenceAnddivision (double first, double second) {
        return MathFunction.difference (first, second)
                + MathFunction.division (first, second);
    }

    public static double sumall(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second)
                + MathFunction.difference(first, second)
                + MathFunction.division(first, second);
        }

    public static void main (String[] args) {
        System.out.println("Результат расчета суммы первого метода равен: " + differenceAnddivision(10, 20));
        System.out.println("Результат расчета суммы второго метода равен: " + sumall(10, 20));
    }
}