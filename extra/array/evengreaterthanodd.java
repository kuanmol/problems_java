package extra.array;

public class
evengreaterthanodd {
    static void rearrange(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                }
            } else {
                if (arr[i] > arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2, 5};
        int n = arr.length;
        rearrange(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
