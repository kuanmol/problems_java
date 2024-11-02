package leetcode.dp;

public class sevenzero {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(climb(n));
    }

    private static int climb(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int prev = 1, curr = 1;
        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;
    }
}
