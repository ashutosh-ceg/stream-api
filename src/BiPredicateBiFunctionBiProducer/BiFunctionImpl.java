package BiPredicateBiFunctionBiProducer;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class BiFunctionImpl {
    public static void main(String[] args) {
        Function<String, Integer> function = str -> str.length();
        BiFunction<String, String, Integer> biFunction = (str1, str2) -> str1.length() + str2.length();
        System.out.println(biFunction.apply("ashutosh", "om"));

        Consumer<String> consumer = str -> {
            System.out.println(str);
        };

        BiConsumer<Integer, Integer> biConsumer = (x, y) -> {
            System.out.println(x + y);
        };

        biConsumer.accept(10, 2);

    }
}
