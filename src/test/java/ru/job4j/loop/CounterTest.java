/**
 * Тестирование суммы всех чисел, если Start <= Finish.
 * Если Start > Аinish, то сумма будет равна 0.
 */

package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.BDDAssertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void whenStart0AndFinish10ThenSum55() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        int output = Counter.sum(start, finish);
    }

    @Test
    void whenStart3AndFinish8ThenSum33() {
        int start = 3;
        int finish = 8;
        int expected = 33;
        int output = Counter.sum(start, finish);
    }

    @Test
    void whenStart1AndFinish1ThenSum1() {
        int start = 1;
        int finish = 1;
        int expected = 1;
        int output = Counter.sum(start, finish);
    }

    @Test
    void whenStart5AndFinish1ThenSum0() {
        int start = 5;
        int finish = 1;
        int expected = 0;
        int output = Counter.sum(start, finish);
    }
}