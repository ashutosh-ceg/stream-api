package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMap {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1290);
        list.add(1999);
        list.add(1213);
        list.add(1400);
        list.add(2);

        // list.stream().forEach(e->System.err.println(e));

        List<String> list1 = new ArrayList<>();
        list1.add("Ashutosh");
        list1.add("Amit");
        list1.add("Ranjan");
        list1.add("Sudhanshu");
        list1.add("Sachin");

        // Filter method take predicate as input,it return boolean that is true or
        // false.
        List<String> namelist1 = list1.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println("Name List starting with A " + namelist1);

        // Map method take consumer (consume input as element) and it return element
        // value that is processed.
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        List<Integer> newNumber = integerList.stream().map(i -> i * i).collect(Collectors.toList());

        System.out.println("New number with square of the number " + newNumber);

        list1.stream().forEach(System.out::println); // here println is referenece associated with double colon(::)
                                                     // operator

        System.out.println("Sorted name ");
        list1.stream().sorted().forEach(System.out::println); // Sorted name

        Integer nuInteger = list.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println(nuInteger);

        Integer maxInteger = list.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println(maxInteger);

    }
}
