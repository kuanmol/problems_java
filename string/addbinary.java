package string;

import java.util.Scanner;

class Knapsack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of items
        int N = scanner.nextInt();

        // Read the maximum capacity of the truck
        int C = scanner.nextInt();

        // Read the values of the items
        int[] V = new int[N];
        for (int i = 0; i < N; i++) {
            V[i] = scanner.nextInt();
        }

        // Read the weights of the items
        int[] W = new int[N];
        for (int i = 0; i < N; i++) {
            W[i] = scanner.nextInt();
        }

        // Create a DP table
        int[][] dp = new int[N + 1][C + 1];

        // Fill the DP table
        for (int i = 1; i <= N; i++) {
            for (int w = 0; w <= C; w++) {
                if (W[i - 1] <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - W[i - 1]] + V[i - 1]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        // The maximum value that can be obtained with the given capacity
        System.out.println(dp[N][C]);
    }
}
