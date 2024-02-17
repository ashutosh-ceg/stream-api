package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI2 {
    public static void main(String[] args) {
        // Creating empty stream of object 
        Stream<Object> emptyStream=Stream.empty();

        String name[]={"Ashutosh","Pritam","Ranjan","Ranjeet"};

        Stream<String> nameStream=Stream.of(name);
        nameStream.forEach(e->{
            System.out.println(e);
        });

        Stream<Object> streamBuilder= Stream.builder().build();

        List<String> list= new ArrayList<>();
        list.add("Ashutosh");
        list.add("Amit");
        list.add("Ranjan");
        list.add("Sudhanshu");
        list.add("Sachin");

        System.out.println("Name stream list");
        Stream<String> nStream=list.stream();

        nStream.forEach(e->{
            System.out.println(e);
        });

    }
}
