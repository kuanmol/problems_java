package leetcode.dp;

public class oneonefourthree {
    public static void main(String[] args) {
        oneonefourthree solution = new oneonefourthree();

        String text1 = "abc";
        String text2 = "ace";
        System.out.println(solution.longestCommonSubsequence(text1, text2)); // Output: 3
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int[][] dp = new int[m + 1][n + 1];
        dp[0][0] = 0;
        for (int i = 1; i <= m; i++) {
            char c = text1.charAt(i - 1);
            for (int j = 1; j <= n; j++) {
                if (text2.charAt(j - 1) == c) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }
}

