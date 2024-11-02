package extra.array;

public class concatenation_array {
    public static int[] concat(int[] arr) {
        int n = arr.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = arr[i];
            ans[i + n] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int[] ans = concat(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }
    }
}
