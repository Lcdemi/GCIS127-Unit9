package unit09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SetsAndMaps {
    
    public static void addAndPrint(Set<String> set) {
        set.add("aardvark");
        set.add("Zoo");
        set.add("Monkey");
        set.add("zebra");
        set.add("shark");

        for(String animal : set) {
            System.out.println(animal);
        }
    }

    public static void putAndPrint(Map<String, Integer> map) {
        map.put("Zoo", 5);
        map.put("aardvark", 7);
        map.put("Monkey", 3);
        map.put("zebra", 12);
        map.put("shark", 0);

        for(String key : map.keySet()) {
            int value = map.get(key);
            System.out.println(key + ":" + value);
        }
    }

    public static void main(String[] args) {
        addAndPrint(new HashSet<String>()); //no real order
        System.out.println("**************************");
        addAndPrint(new TreeSet<String>()); //lexicographical order
        System.out.println("**************************");
        addAndPrint(new TreeSet<String>(new AlphabeticComparator())); //alphabetic order
        System.out.println();
        putAndPrint(new HashMap<>()); //no real order
        System.out.println("**************************");
        putAndPrint(new TreeMap<>()); //lexicographical order
        System.out.println("**************************");
        putAndPrint(new TreeMap<>(new AlphabeticComparator())); //alphabetic order
    }
}
