package leetcode.dp;

import java.util.Arrays;

public class threetwotwo {

    public static void main(String[] args) {
        threetwotwo solution = new threetwotwo();

        // Example 1
        int[] coins1 = {1, 2, 5};
        int amount1 = 11;
        System.out.println(solution.coinChange(coins1, amount1)); // Output: 3
    }

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}

//i is the updated amount and +1 mean the new coin added i.e coin consumed and decrease the i i.e amt so one coin added.