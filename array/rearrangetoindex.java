package array;

public class rearrangetoindex {

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void reorder(int[] arr, int[] index, int n) {
        for (int i = 0; i < n; i++) {
            while (index[i] != i) {
                swap(arr, i, index[i]);
                swap(index, i, index[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {50, 40, 70, 60, 90};
        int[] index = {3, 0, 2, 1, 4};
        int n = arr.length;
        reorder(arr, index, n);
        System.out.print("Reordered array is: \n");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nModified Index array is: \n");
        for (int i = 0; i < n; i++) {
            System.out.print(index[i] + " ");
        }
    }
}
