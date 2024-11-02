package extra.face.graph;

import java.util.Scanner;

class NumberOfIslands {
    int rows, cols;
    int[][] grid;
    boolean[][] visited;

    NumberOfIslands(int rows, int cols, int[][] grid) {
        this.rows = rows;
        this.cols = cols;
        this.grid = grid;
        this.visited = new boolean[rows][cols];
    }

    // DFS traversal to mark all connected land cells as visited
    void dfs(int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= cols || grid[row][col] == 0 || visited[row][col])
            return;

        visited[row][col] = true;

        // Explore all 8 directions
        dfs(row - 1, col); // up
        dfs(row + 1, col); // down
        dfs(row, col - 1); // left
        dfs(row, col + 1); // right
        dfs(row - 1, col - 1); // up-left
        dfs(row - 1, col + 1); // up-right
        dfs(row + 1, col - 1); // down-left
        dfs(row + 1, col + 1); // down-right
    }

    int countIslands() {
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j);
                    count++;
                }
            }
        }
        return count;
    }
}

public class islandGrapf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] grid = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        NumberOfIslands numIslands = new NumberOfIslands(rows, cols, grid);
        System.out.println(numIslands.countIslands());

        scanner.close();
    }
}

