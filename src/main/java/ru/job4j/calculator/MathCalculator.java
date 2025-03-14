package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

public class MathCalculator {

    public static double DifferenceAndDivision(double first, double second) {
        return MathFunction.difference(first, second)
                + MathFunction.division(first, second);
    }

    public static double SumAll(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second)
                + MathFunction.difference(first, second)
                + MathFunction.division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета суммы первого метода равен: " + DifferenceAndDivision(10, 20));
        System.out.println("Результат расчета суммы второго метода равен: " + SumAll(10, 20));
    }
}