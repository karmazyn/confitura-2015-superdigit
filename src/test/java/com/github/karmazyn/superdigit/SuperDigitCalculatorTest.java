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
        assertThat(calculator.calculate(0)).isEqualTo(0);
        assertThat(calculator.calculate(1)).isEqualTo(1);
        assertThat(calculator.calculate(-1)).isEqualTo(-1);
    }

    @Test
    public void shouldAddTwoDigitsTogether() {
        assertThat(calculator.calculate(10)).isEqualTo(1);
        assertThat(calculator.calculate(-10)).isEqualTo(-1);
    }

    @Test
    public void shouldAddTwoDigitsTogetherTwice() {
        assertThat(calculator.calculate(92)).isEqualTo(2);
        assertThat(calculator.calculate(-92)).isEqualTo(-2);
    }

    @Test
    public void shouldAddThreeDigitsTogether() {
        assertThat(calculator.calculate(111)).isEqualTo(3);
    }

    @Test
    public void shouldCalculateSuperDigitsFromExtrema() {
     assertThat(calculator.calculate(Integer.MAX_VALUE)).isEqualTo(1);
     assertThat(calculator.calculate(Integer.MIN_VALUE)).isEqualTo(-2);
    }

    @Test
    public void shouldPassAC() {
        assertThat(calculator.calculate(98741)).isEqualTo(2);
    }
}
