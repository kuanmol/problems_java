package hashing;

import java.util.*;

public class getDefault {

    // Main
    public static void main(String[] args) {

        HashMap<String, Integer> map
                = new HashMap<>();
        map.put("a", 100);
        map.put("b", 200);
        map.put("c", 300);
        map.put("d", 400);

        System.out.println("HashMap: " + map.toString());

        // return value in k

        int k = map.getOrDefault("e", 5000);

        // print the value of k returned by
        // getOrDefault(Object key, V defaultValue) method
        System.out.println("Returned Value: " + k);
    }
}
