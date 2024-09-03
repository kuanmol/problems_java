package array;

public class array_perutation {
    static int[] buildarray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = n * (arr[arr[i]] % n) + arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / n;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 5, 3, 4};
        int[] ans = buildarray(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
