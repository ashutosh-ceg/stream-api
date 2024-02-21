package comparator;

import java.util.Map;
import java.util.TreeMap;

public class NormalMap {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "a");
        treeMap.put(2, "b");
        treeMap.put(13, "null");
        treeMap.put(3, "c");

        System.out.println("Tree map without sorting " + treeMap);

        // Comparator inside Tree Map
        Map<Integer, String> tMap = new TreeMap<>((a, b) -> b - a);
        tMap.put(1, "a");
        tMap.put(2, "b");
        tMap.put(3, "c");
        tMap.put(4, "d");

        System.out.println("Tree map after sorting " + tMap);
    }
}
