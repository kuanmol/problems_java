package leet.dp;

public class sevenfoursix {
    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        System.out.println(minCostClimbingStairs(cost));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        if (n == 0) return 0;
        if (n == 1) return cost[0];

        int prev1 = cost[0];
        int prev2 = cost[1];

        for (int i = 2; i < n; i++) {
            int currentCost = cost[i] + Math.min(prev1, prev2);
            prev1 = prev2;
            prev2 = currentCost;
        }

        return Math.min(prev1, prev2);
    }
}
