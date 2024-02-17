package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI1 {
    public static void main(String[] args) {
        System.out.println("In main method of StreamAPI");

       List<Integer> list= List.of(1,2,3,4,5,20,30,40,50);
       System.out.println("Elements of immutable list");
       list.forEach(l->System.out.println(l));
      // list.add(12); It will throw an exception as this list is immutable, we can't add or change the list.

      List<Integer> list2=Arrays.asList(1,2,3,4,5);
       // list2.forEach(e->System.out.println(e));
        //list2.add(30);

        Stream<Integer> stream=list.stream();

        List<Integer> newList=stream.filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> newList1=list.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println("List of filtered element using lambda expression." +newList1);

        List<Integer> newList2=list.stream().filter(e->e>10).collect(Collectors.toList());
        System.out.println("List of element greater than 10 using stream."+newList2);

    }
}
