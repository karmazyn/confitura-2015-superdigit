package com.github.karmazyn.superdigit;

/**
 * Created by m.karmazyn on 06/07/15.
 */
public class SuperDigitCalculator {

    public long calculate(long number) {
        if(Math.abs(number) < 10) {
            return number;
        }
        long sum = sumDigits(number);
        return calculate(sum);
    }

    private long sumDigits(long number) {
        long sum = 0;
        for(; Math.abs(number) >= 10; number /= 10) {
            sum += number % 10;
        }
        return sum + number;
    }
}
