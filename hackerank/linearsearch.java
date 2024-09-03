package hackerank;

import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int find = scanner.nextInt();
        System.out.println(linear(arr, n, find));

    }

    private static int linear(int[] arr, int n, int find) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == find) {
                return i;
            }
        }
        return -1;
    }
}
