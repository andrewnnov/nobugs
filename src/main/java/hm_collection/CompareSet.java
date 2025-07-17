package hm_collection;

import java.util.HashSet;
import java.util.TreeSet;

public class CompareSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        long start, end;

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            hashSet.add(i);
        }
        end = System.nanoTime();
        System.out.println("HashSet add 10K elements " + (end - start) / 1_000_000 + " mc");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            treeSet.add(i);
        }
        end = System.nanoTime();
        System.out.println("TreeSet add 10K elements " + (end - start) / 1_000_000 + " mc");

    }
}
