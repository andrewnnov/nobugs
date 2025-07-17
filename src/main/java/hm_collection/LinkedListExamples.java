package hm_collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExamples {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        System.out.println("empty list: " + list);
        list.add("A");
        list.addFirst("B");
        list.addLast("C");
        list.add(1, "D");
        System.out.println("After adding: " + list);

        list.remove("D");
        list.remove(1);
        list.removeFirst();
        list.removeLast();
        System.out.println("After deleting: " +  list);

        //FIFO queue
        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("FIFO " + queue);
        System.out.println("Deleted element: " + queue.poll());
        System.out.println("FIFO after deleting: " + queue);

        //LIFO stack
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack LIFO: " + stack);
        System.out.println("Deleted element: " + stack.pop());
        System.out.println("Stack after deleting: " + stack);

        //test
        LinkedList<Integer> testList = new LinkedList<>(Arrays.asList(1, 2, 0, 3));
        testList.remove(1);
        System.out.println("list after deleting: " + testList);

        //access to elements
        LinkedList<String> accessList = new LinkedList<>(Arrays.asList("X", "Y", "Z"));
        System.out.println("First element: " + accessList.getFirst());
        System.out.println("Last element: " + accessList.getLast());
        System.out.println("Access by index: " + accessList.get(1));

        //iterating over a list
        for (String item : accessList) {
            System.out.println(item + " ");
        }
        System.out.println();

        //use ListIterator for two-way iteration
        ListIterator<String> iterator = accessList.listIterator();
        System.out.println("direct: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");

        }
        System.out.println();

        System.out.println("undirect");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous() + " ");
        }
        System.out.println();


        //linked list with null-elements
        LinkedList<String> nullList = new LinkedList<>();
        nullList.add(null);
        nullList.add("Hello");
        nullList.add(null);
        System.out.println("LinkedList with null: " + nullList);
    }


}
