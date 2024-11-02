package extra.array;

public class zeroatend {
    static void putzeroatend(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        while (count < n) {
            arr[count] = 0;
            count++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 0, 7, 4, 0, 0, 0, 4, 2, 4, 0, 3};
        int n = arr.length;
        putzeroatend(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }
}