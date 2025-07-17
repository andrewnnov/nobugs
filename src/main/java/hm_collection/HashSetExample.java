package hm_collection;

import practice_5.task_2.Item;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        System.out.println("Created empty Hashset: " + set);
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");
        System.out.println("After adding: " + set);

        System.out.println("Contains A " + set.contains("A"));
        System.out.println("Contains C " + set.contains("C"));

        set.remove("B");
        System.out.println("After deleting: " + set);

        //Iteration
        for (String item : set) {
            System.out.println(item + " ");
        }
        System.out.println();

        //using Iterator
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();

        set.add(null);
        System.out.println("set with null " + set);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        System.out.println(linkedHashSet);

        TreeSet<Integer> treeSet = new TreeSet<>(linkedHashSet);
        System.out.println(treeSet);
    }
}
