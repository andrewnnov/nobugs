package hm_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompareLists {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start, end;

        //insert into start ArrayList
        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(0, i);
        }
        end = System.nanoTime();
        System.out.println("ArrayList: add to first 100K elements = " + (end - start) /1_000_000 + " ms");



        //insert into start LinkedList
        for (int i = 0; i < 100000; i++) {
            linkedList.add(0, i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList: add to first 100K elements = " + (end - start) /1_000_000 + " ms");

        //delete all elements
        linkedList.clear();
        System.out.println("After deleting " + linkedList);
    }
}
