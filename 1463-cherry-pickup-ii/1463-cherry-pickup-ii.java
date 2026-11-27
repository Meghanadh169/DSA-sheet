
class Solution {
    public int cherryPickup(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][][] dp = new int[m][n][n];

        findMaxCherry(grid, m, n, dp);

        return dp[0][0][n-1];
    }

    private static void findMaxCherry(
        int[][] grid, int m, int n, int[][][] dp) {

        // Base case
        for(int j1 = 0; j1 < n; j1++) {
            for(int j2 = 0; j2 < n; j2++) {

                dp[m-1][j1][j2] = (j1 == j2)
                    ? grid[m-1][j1]
                    : grid[m-1][j1] + grid[m-1][j2];
            }
        }

        // Tabulation
        for(int i = m-2; i >= 0; i--) {

            for(int j1 = 0; j1 < n; j1++) {
                for(int j2 = 0; j2 < n; j2++) {

                    int max = -100000000;

                    for(int i1 = -1; i1 <= 1; i1++) {
                        for(int j = -1; j <= 1; j++) {

                            int value = (j1 == j2)
                                ? grid[i][j1]
                                : grid[i][j1] + grid[i][j2];

                            if(j1+i1 >= 0 && j1+i1 < n &&
                               j2+j >= 0 && j2+j < n) {

                                value += dp[i+1][j1+i1][j2+j];
                            }
                            else {
                                value += -100000000;
                            }

                            max = Math.max(max, value);
                        }
                    }

                    dp[i][j1][j2] = max;
                }
            }
        }
    }
}
