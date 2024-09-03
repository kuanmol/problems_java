package TCS;

import java.util.Scanner;

class MaxProductSplitting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(maxProduct(N));
    }

    public static int maxProduct(int N) {

        if (N == 0) return 0;
        if (N == 1) return 0;
        if (N == 2) return 1;
        if (N == 3) return 2;

        int[] dp = new int[N + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for (int i = 4; i <= N; i++) {
            for (int j = 1; j <= i / 2; j++) {
                dp[i] = Math.max(dp[i], dp[j] * dp[i - j]);
            }
        }

        return dp[N];
    }
}

