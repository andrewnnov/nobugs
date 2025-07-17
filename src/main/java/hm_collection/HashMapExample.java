package hm_collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println("Creted empty HashMap: " + map);
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("A", 100);

        System.out.println("After adding: " + map);
        System.out.println("get element: "  + map.get("A"));
        System.out.println("ContainsKey B " + map.containsKey("B"));
        map.remove("B");
        System.out.println("After deleting B: " +  map );

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
