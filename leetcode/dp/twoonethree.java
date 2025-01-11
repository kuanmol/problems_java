package leetcode.dp;

public class twoonethree {
    public static void main(String[] args) {
        int[] nums = {2, 3, 2, 1, 6, 3, 5};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        int n = nums.length;

        if (n == 0) return 0;
        if (n == 1) return nums[0];

        int maxRob = Math.max(robLinear(nums, 0, n - 2), robLinear(nums, 1, n - 1));

        return maxRob;
    }

    public static int robLinear(int[] nums, int start, int end) {
        int prev1 = 0;
        int prev2 = 0;
        for (int i = start; i <= end; i++) {
            int currnet = Math.max(prev1, nums[i] + prev2);
            prev2 = prev1;
            prev1 = currnet;
        }
        return prev1;
    }
}
