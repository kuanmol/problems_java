package hashing;

import java.util.HashSet;

public class arraysubsetcheck {
    static boolean isSubset(int[] arr1, int[] arr2, int m, int n) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < m; i++) {
            hashSet.add(arr1[i]);
        }

        for (int i = 0; i < n; i++) {
            if (!hashSet.contains(arr2[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        arraysubsetcheck arraysubsetcheck = new arraysubsetcheck();
        int[] arr1 = {4, 5, 6, 7, 8, 9, 1, 2};
        int[] arr2 = {7, 1};
        int m = arr1.length;
        int n = arr2.length;
        if (isSubset(arr1, arr2, m, n)) {
            System.out.println("array 2 is the subset of array 1");
        } else {
            System.out.println("array2 is not subset of array1");
        }
    }
}
