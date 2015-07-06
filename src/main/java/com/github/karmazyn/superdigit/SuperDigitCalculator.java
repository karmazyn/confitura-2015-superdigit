package com.github.karmazyn.superdigit;

/**
 * Created by m.karmazyn on 06/07/15.
 */
public class SuperDigitCalculator {

    public int calculate(int number) {
        if(number < 10 && number > -10) {
            return number;
        }
        return calculate(number / 10 + number % 10);
    }
}
