package leetcode.dp;

public class fiveoneeight {
    public static void main(String[] args) {
        int amount = 9;
        int[] arr = {1, 2, 4};
        System.out.println(change(amount, arr));
    }

    public static int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) {
                dp[j] += dp[j - coin];
            }
        }

        return dp[amount];
    }
}
