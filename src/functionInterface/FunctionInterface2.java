package functionInterface;

import java.util.function.Function;

public class FunctionInterface2 {
    public static void main(String[] args) {
        Function<String, String> function1 = str -> str.toUpperCase();
        Function<String, String> function2 = str -> str.substring(0, 3);

        System.out.println(function1.andThen(function2).apply("Ashutosh"));

    }
}
