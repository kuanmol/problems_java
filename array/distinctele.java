package array;

import java.util.HashSet;

public class distinctele {
    static void distinct(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int j : arr) {
            if (!hashSet.contains(j)) {
                hashSet.add(j);
                System.out.println(j);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4};

        distinct(arr);
    }
}
