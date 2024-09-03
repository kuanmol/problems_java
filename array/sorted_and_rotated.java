package array;

public class sorted_and_rotated {
    static boolean checking(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                count++;
            }
        }

        if (arr[arr.length - 1] > arr[0]) {
            count++;
        }
        return count <= 1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 3};
        System.out.println(checking(arr));

    }
}
