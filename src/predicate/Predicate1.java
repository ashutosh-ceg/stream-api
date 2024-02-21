package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate1 {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x > 10000;
        System.out.println(predicate.test(100)); // Return false

        Predicate<Integer> isEven = x -> x % 2 == 0;
        List<Integer> nList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        for (Integer i : nList) {
            if (isEven.test(i)) {
                System.out.println(i);
            }
        }

        Predicate<String> startsWithLetterA = str -> str.charAt(0) == 'A';
        // System.out.println(startsWithLetterA.test("ashutosh"));
        // System.out.println(startsWithLetterA.test("Kumar"));

        Predicate<String> endsWithLetterH = str -> str.toLowerCase().charAt(str.length() - 1) == 'h';
        Predicate<String> and = startsWithLetterA.and(endsWithLetterH);
        System.out.println(and.test("Ashutosh"));
        System.out.println(startsWithLetterA.or(endsWithLetterH));
        System.out.println(endsWithLetterH.negate());

    }
}
