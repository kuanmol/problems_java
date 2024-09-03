package sorting;

public class mergesort {

    static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(arr, l + 0, L, 0, n1);
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void sorted(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sorted(arr, l, m);
            sorted(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }


    public static void main(String[] args) {
        int[] arr = {214, 354635, 33, 4254, 4647, 545, 536, 42, 364, 845, 3, 32242, 6, 4, 85, 986, 7};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sorted(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
