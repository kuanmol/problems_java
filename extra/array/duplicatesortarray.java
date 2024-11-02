package extra.array;

import java.io.*;
import java.util.*;

public class duplicatesortarray {

    public static List<Integer> findDuplicates(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int size = cin.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = cin.nextInt();
        }

        List<Integer> duplicates = findDuplicates(arr);
        System.out.println(duplicates);
    }
}

