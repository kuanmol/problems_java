package array;

public class leader_array {
    public static void main(String[] args) {
        leader_array leaderArray = new leader_array();
        int[] arr = {16, 17, 4, 3, 2};
        int n = arr.length;
        leaderArray.lead(arr, n);
    }

    void lead(int[] arr, int n) {
        int max_right = arr[n - 1];
        System.out.print(max_right + " ");
        for (int i = n - 2; i > 0; i--) {
            if (max_right < arr[i]) {
                max_right = arr[i];
                System.out.print(max_right + " ");
            }
        }
    }
}
