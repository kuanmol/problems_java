package extra.sorting;

public class selectionsort {
    static void sorting(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_indx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_indx])
                    min_indx = j;
            int temp = arr[min_indx];
            arr[min_indx] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        selectionsort selectionsort = new selectionsort();
        int[] arr = {34, 213, 745, 325, 12, 23435, 76532, 2121, 24};
        sorting(arr);
    }
}

