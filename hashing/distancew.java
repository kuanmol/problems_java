package hashing;

import java.util.HashMap;

public class distancew {

    static int MAXDISTANCE(int[] arr, int n) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (!hashMap.containsKey(arr[i]))
                hashMap.put(arr[i], i);
            else
                max = Math.max(max, i - hashMap.get(arr[i]));
        }
        return max;
    }

    public static void main(String[] args) {
        distancew distancew = new distancew();
        int[] arr = {3, 4, 2, 1, 5, 7, 5, 3, 5};
        int n = arr.length;
        System.out.println(MAXDISTANCE(arr, n));
    }
}
