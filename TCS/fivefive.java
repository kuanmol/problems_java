package TCS;

import java.util.Scanner;

public class fivefive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int ans = fibo(arr, size);
    }

    private static int fibo(int[] arr, int size) {
        int[] ser = new int[size];
        ser[0] = 2;
        ser[1] = 1;
        for (int i = 2; i < size; i++) {
            ser[i] = ser[i - 1] + ser[i - 2];
        }
        int c = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] != ser[i]) {
                c++;
            }
        }
        return c;

    }
}
