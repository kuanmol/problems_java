package leetcode.array;

public class threeonetwoseven {
    public static void main(String[] args) {
        char[][] grid1 = {
                {'B', 'W', 'B'},
                {'B', 'W', 'W'},
                {'B', 'W', 'B'}
        };
        System.out.println(canMakeSquare(grid1));

        char[][] grid2 = {
                {'B', 'W', 'B'},
                {'W', 'B', 'W'},
                {'B', 'W', 'B'}
        };
        System.out.println(canMakeSquare(grid2));
        char[][] grid3 = {
                {'B', 'W', 'B'},
                {'B', 'W', 'W'},
                {'B', 'W', 'W'}
        };
        System.out.println(canMakeSquare(grid3));
    }

    public static boolean canMakeSquare(char[][] grid) {

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int bCount = 0, wCount = 0;

                if (grid[i][j] == 'B') bCount++;
                else wCount++;
                if (grid[i][j + 1] == 'B') bCount++;
                else wCount++;
                if (grid[i + 1][j] == 'B') bCount++;
                else wCount++;
                if (grid[i + 1][j + 1] == 'B') bCount++;
                else wCount++;

                if (bCount == 4 || wCount == 4 || bCount == 3 || wCount == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
