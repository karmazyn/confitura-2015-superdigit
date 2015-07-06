package com.github.karmazyn.superdigit;

import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

/**
 * Created by m.karmazyn on 06/07/15.
 */
public class SuperDigitCalculatorTest {

    private SuperDigitCalculator calculator = new SuperDigitCalculator();

    @Test
    public void shouldReturnSameNumberAsInput() {
        assertThat(calculator.calculate(0L)).isEqualTo(0L);
        assertThat(calculator.calculate(1L)).isEqualTo(1L);
        assertThat(calculator.calculate(-1L)).isEqualTo(-1L);
    }

    @Test
    public void shouldAddTwoDigitsTogether() {
        assertThat(calculator.calculate(10L)).isEqualTo(1L);
        assertThat(calculator.calculate(-10L)).isEqualTo(-1L);
    }

    @Test
    public void shouldAddTwoDigitsTogetherTwice() {
        assertThat(calculator.calculate(92L)).isEqualTo(2L);
        assertThat(calculator.calculate(-92L)).isEqualTo(-2L);
    }

    @Test
    public void shouldAddThreeDigitsTogether() {
        assertThat(calculator.calculate(111L)).isEqualTo(3L);
    }

    @Test
    public void shouldCalculateSuperDigitsFromExtrema() {
     assertThat(calculator.calculate(Long.MAX_VALUE)).isEqualTo(7L);
     assertThat(calculator.calculate(Long.MIN_VALUE)).isEqualTo(-8L);
    }

    @Test
    public void shouldPassAC() {
        assertThat(calculator.calculate(98741)).isEqualTo(2);
    }
}
