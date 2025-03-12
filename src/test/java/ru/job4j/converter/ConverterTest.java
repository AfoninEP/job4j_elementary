package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {
    @Test
    void whenConvert140RblThen2dotEuro() {
        float input = 140f;
        float expected = 2f;
        float output = (float) Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
    @Test
    void whenConvert200RblThen2dot2222Euro() {
        float input = 200f;
        float expected = 2.2222f;
        float output = (float) Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
    @Test
    void whenConvert180RblThen3dotDollar() {
        float input = 180f;
        float expected = 3f;
        float output = (float) Converter.rubleToDollar(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
    @Test
    void whenConvert150RblThen2dotDollar() {
        float input = 150f;
        float expected = 2f;
        float output = (float) Converter.rubleToDollar(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}