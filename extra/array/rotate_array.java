package extra.array;

public class rotate_array {
    static int[] rotated(int[] arr, int k) {
        int[] temp = new int[arr.length]; // Corrected the extra.array size initialization
        for (int i = 0; i < arr.length; i++) {
            temp[(i + k) % arr.length] = arr[i];
        }
        return temp; // Return the rotated extra.array 'temp', not the original 'arr'
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] ans = rotated(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i]);
        }
    }
}
