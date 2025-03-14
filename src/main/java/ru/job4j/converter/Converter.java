/**
 *Assuming the conversion rate is 1 Euro = 90 Rubles;
 * Assuming the conversion rate is 1 Dollar = 75 Rubles;
 */
package ru.job4j.converter;

public class Converter {
    public static double rubleToEuro(double value) {
        return value / 90;
    }

    public static double rubleToDollar(double value) {
        return value / 75;
    }
}
