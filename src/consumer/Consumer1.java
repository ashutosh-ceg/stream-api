package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer1 {
    public static void main(String[] args) {

        // Consumer consume input but does not return anything

        Consumer<List<Integer>> listConsumer = li -> {
            for (Integer l : li) {
                System.out.println(l + 100);
            }
        };

        Consumer<List<Integer>> listConsumer2 = li -> {
            for (Integer i : li) {
                System.out.println(i);
            }
        };

        Consumer<List<Integer>> listConsumer3 = listConsumer.andThen(listConsumer2);
        listConsumer3.accept(Arrays.asList(1, 2, 3, 4, 5));
    }
}
