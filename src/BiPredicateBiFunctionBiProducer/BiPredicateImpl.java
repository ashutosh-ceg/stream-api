package BiPredicateBiFunctionBiProducer;

import java.util.function.BiPredicate;

public class BiPredicateImpl {
    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate = (str, i) -> str.length() == i;
        System.out.println(biPredicate.test("Ashutosh", 5)); // False
        System.out.println(biPredicate.test("Ashutosh", 8)); // true
    }
}
