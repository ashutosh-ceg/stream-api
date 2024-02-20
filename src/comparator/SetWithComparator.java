package comparator;

import java.util.Set;
import java.util.TreeSet;

public class SetWithComparator {
    public static void main(String[] args) {
        // TreeSet is shorted bydefault in natural sorting order 
        Set<Integer> newSet = new TreeSet<>();
        newSet.add(12);
        newSet.add(1);
        newSet.add(0);
        newSet.add(10);
        System.out.println("Set before sorting "+newSet);
        // Sorting in descending order
        Set<Integer> ss= new TreeSet<>((a,b)->b-a);
        ss.add(21);
        ss.add(12);
        ss.add(1);
        System.out.println("Set after shorting "+ss);
    }
}
