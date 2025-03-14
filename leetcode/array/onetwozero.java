package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class onetwozero {
    public static void main(String[] args) {
        onetwozero solution = new onetwozero();

        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>(List.of(2)));
        triangle.add(new ArrayList<>(Arrays.asList(3, 4)));
        triangle.add(new ArrayList<>(Arrays.asList(6, 5, 7)));
        triangle.add(new ArrayList<>(Arrays.asList(4, 1, 8, 3)));

        int result = solution.minimumTotal(triangle);
        System.out.println("Minimum path sum: " + result);
    }

    public int minimumTotal(List<List<Integer>> triangle) {

        int n = triangle.size();
        int[][] dp = new int[n][n];
        for (int[] i : dp) Arrays.fill(i, -1);
        return solve(0, 0, n, triangle, dp);
    }

    int solve(int i, int j, int n, List<List<Integer>> triangle, int[][] dp) {

        if (i >= n || j >= n) return (int) (1e9);

        if (i == n - 1) return triangle.get(i).get(j);

        if (dp[i][j] != -1) return dp[i][j];

        int down = triangle.get(i).get(j) + solve(i + 1, j, n, triangle, dp);
        int diagonal = triangle.get(i).get(j) + solve(i + 1, j + 1, n, triangle, dp);

        return dp[i][j] = Math.min(down, diagonal);
    }
}
