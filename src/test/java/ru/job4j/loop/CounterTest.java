package ru.job4j.loop;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenStart0Finish10ThenSum55() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart20Finish80ThenSum3050() {
        int start = 20;
        int finish = 80;
        int expected = 3050;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart20Finish10Then0() {
        int start = 20;
        int finish = 10;
        int expected = 0;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart0Finish10SumEvenNumbers30() {
        int start = 0;
        int finish = 10;
        int expectedSumEvenNumbers = 30;
        int result = Counter.sumByEven(start, finish);
        assertThat(result).isEqualTo(expectedSumEvenNumbers);
    }

    @Test
    void whenStart3Finish8ThenSum30() {
        int start = 3;
        int finish = 8;
        int expected = 33;
        int expectedSumEvenNumbers = 18;
        int output = Counter.sum(start, finish);
        int result = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
        assertThat(result).isEqualTo(expectedSumEvenNumbers);
    }

    @Test
    void whenStart3Finish8SumEvenNumbers18() {
        int start = 3;
        int finish = 8;
        int expectedSumEvenNumbers = 18;
        int result = Counter.sumByEven(start, finish);
        assertThat(result).isEqualTo(expectedSumEvenNumbers);
    }

    @Test
    void whenStart1Finish1ThenSum1() {
        int start = 1;
        int finish = 1;
        int expected = 1;
        int expectedSumEvenNumbers = 0;
        int output = Counter.sum(start, finish);
        int result = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
        assertThat(result).isEqualTo(expectedSumEvenNumbers);
    }

    @Test
    void whenStart1Finish1SumEvenNumbers0() {
        int start = 1;
        int finish = 1;
        int expectedSumEvenNumbers = 0;
        int result = Counter.sumByEven(start, finish);
        assertThat(result).isEqualTo(expectedSumEvenNumbers);
    }

    @Test
    void whenStart20Finish80SumEvenNumbers1550() {
        int start = 20;
        int finish = 80;
        int expectedSumEvenNumbers = 1550;
        int result = Counter.sumByEven(start, finish);
        assertThat(result).isEqualTo(expectedSumEvenNumbers);
    }

    @Test
    void whenStart20Finish10SumEvenNumbers0() {
        int start = 20;
        int finish = 10;
        int expectedSumEvenNumbers = 0;
        int result = Counter.sumByEven(start, finish);
        assertThat(result).isEqualTo(expectedSumEvenNumbers);
    }

    @Test
    void whenStartNegative20Finish10SumEvenNumbers0() {
        int start = -20;
        int finish = 10;
        int expectedSumEvenNumbers = -80;
        int result = Counter.sumByEven(start, finish);
        assertThat(result).isEqualTo(expectedSumEvenNumbers);
    }
}