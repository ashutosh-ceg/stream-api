package unaryAndBinaryOperator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryAndBinaryOperator {
    public static void main(String[] args) {
        Function<Integer, Integer> function = i -> i * i; // we can replace write this with UnaryOperator
        Function<String, String> stringFunction = str1 -> str1.toLowerCase();

        System.out.println(function.apply(1));
        System.out.println(stringFunction.apply("ASHUTOSH"));

        // Unary operaotr work on same argument type, the best thing is that we
        // don't have to pass variable types two times.
        UnaryOperator<Integer> unaryOperator = i -> i * i;
        System.out.println(unaryOperator.apply(10));

        UnaryOperator<String> unaryOperator2 = str -> str.toLowerCase();

        System.out.println(unaryOperator2.apply("ASHUTOSH"));

        BiFunction<String, String, String> biFunction = (str1, str2) -> str1 + str2;

        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2;

        System.out.println(binaryOperator.apply("Ashutosh ", "Kumar"));

    }
}
