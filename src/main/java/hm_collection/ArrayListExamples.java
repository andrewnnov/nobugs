package hm_collection;

import java.util.*;

public class ArrayListExamples {
    public static void main(String[] args) {
        // standard empty list
        List<String> list1 = new ArrayList<>();
        System.out.println("list1 size: " + list1.size());
        list1.add("A");
        System.out.println("list1 after adding: " + list1);

        //list with initial capacity
        List<Integer> list2 = new ArrayList<>(5);
        System.out.println("list2 size: " + list2.size());
        list2.add(100);
        System.out.println("list2: " + list2);

        //create list from other collection
        List<String> existingList = Arrays.asList("X", "Y", "Z");
        List<String> list3 = new ArrayList<>(existingList);
        System.out.println("list3: " + list3);

        //create list from hashset
        Set<String> set = new HashSet<>(Arrays.asList("one", "two", "three"));
        List<String> list4 = new ArrayList<>(set);
        System.out.println("list4: " + list4);

        //create immutable list (java 9+)
        List<String> list5 = List.of("Apple", "Banana", "Cherry");
        System.out.println("list5: " + list5);
        //list5.add("Mango"); //error UnsupportedOperationException

        //use Collection.nCopies() for create list with N same elements
        List<String> list6 =  new ArrayList<>(Collections.nCopies(5, "Hello"));
        System.out.println("list6: " + list6);

        //two-dimensional ArrayList
        List<List<Integer>> list7 = new ArrayList<>();
        list7.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        list7.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        System.out.println("list7: " + list7);



    }
}
