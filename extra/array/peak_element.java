package extra.array;

public class peak_element {

    static int findpeakprocess(int[] arr, int low, int high, int n) {
        int mid = low + (high - low) / 2;
        System.out.println(mid);
        if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid]))
            return mid;
        else if (mid > 0 && arr[mid - 1] > arr[mid])
            return findpeakprocess(arr, low, (mid - 1), n);
        else
            return findpeakprocess(arr, (mid + 1), high, n);
    }

    static int findPeak(int[] arr, int n) {
        return findpeakprocess(arr, 0, n - 1, n);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 20, 4, 1, 0};
        var n = arr.length;
        System.out.println("Index of a peak point is " + findPeak(arr, n));
    }
}
