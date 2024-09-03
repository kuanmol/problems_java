package hackerank;

import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int[][] matrix = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        sumCol(matrix, M, N);
    }

    public static void sumCol(int[][] mat, int rows, int cols) {
        for (int col = 0; col < cols; col++) {
            int sum = 0;
            for (int row = 0; row < rows; row++) {
                sum += mat[row][col];
            }
            System.out.print(sum);
            if (col < cols - 1) {
                System.out.print(" ");
            }
        }
    }
}
