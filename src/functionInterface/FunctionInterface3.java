package functionInterface;

import java.util.function.Function;

public class FunctionInterface3 {
    public static void main(String[] args) {
        Function<Integer, Integer> function1 = x -> x * 2;
        Function<Integer, Integer> function2 = x -> x * x * x;

        System.out.println(function1.andThen(function2).apply(2));

        System.out.println(function2.andThen(function1).apply(3));
        // or
        System.out.println(function1.compose(function2).apply(4));

        // Identity function

        Function<String, String> identityFunction = Function.identity();
        System.out.println(identityFunction.apply("Ashutosh"));

    }
}
