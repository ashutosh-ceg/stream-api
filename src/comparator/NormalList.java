package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NormalList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(1);
        list.add(120);
        list.add(300);
        list.add(50);

        System.out.println("List element " + list);

        Collections.sort(list, (a, b) -> a - b);

        System.out.println("List after sorting " + list);
    }
}
