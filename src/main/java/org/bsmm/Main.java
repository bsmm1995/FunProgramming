package org.bsmm;

import org.bsmm.functions.ArithmeticOperations;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArithmeticOperations sum = Double::sum;
        System.out.println(sum.operation(15.5, 10));
        System.out.println(sum.operation());
        System.out.println(getSum());
    }

    public static int getSum() {
        List<Integer> numbers
                = Arrays.asList(11, 22, 33, 44,
                55, 66, 77, 88,
                99, 100);
        int factor = 2;
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(e -> e * factor)
                .sum();
    }
}