package hackerank;

import java.util.HashMap;
import java.util.Scanner;

public class unique2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = cin.nextInt();
        }
        int result = solveit(arr);
        System.out.println(result);
    }

    private static int solveit(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int n : arr) {
            hashMap.put(n, hashMap.getOrDefault(n, 0) + 1);
        }
        for (int n : arr) {
            if (hashMap.get(n) == 1) {
                return n;
            }
        }
        return -1;
    }
}
