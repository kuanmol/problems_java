package leetcode.dp;

public class sixtwo {
    public static void main(String[] args) {
        int m=4;
        int n=3;
        System.out.println(uniquePaths(m,n));
    }

    private static int uniquePaths(int m, int n) {
        int[][]dp =new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0]=1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j]=1;
        }
        for(int i=1; i<m; i++){
            for (int j = 1; j < n; j++) {
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
