package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FactorialTest {

    @Test
    void whenFactorial10ThanResult3628800() {
        int number = 10;
        int expected = 3628800;
        int result = Factorial.calculate(number);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFactorial5ThanResult120() {
        int number = 5;
        int expected = 120;
        int result = Factorial.calculate(number);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFactorial0ThanResult1() {
        int number = 0;
        int expected = 1;
        int result = Factorial.calculate(number);
        assertThat(result).isEqualTo(expected);
    }
}