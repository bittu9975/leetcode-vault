class Solution {
    public int[] pathsWithMaxScore(List<String> board) {
        int n = board.size();
        int MOD = 1_000_000_007;

        // dpScore[i][j] = maximum score from (i,j) to E
        int[][] dpScore = new int[n][n];

        // dpWays[i][j] = number of ways to achieve dpScore[i][j]
        int[][] dpWays = new int[n][n];

        // Initialize scores as unreachable
        for (int i = 0; i < n; i++) {
            Arrays.fill(dpScore[i], -1);
        }

        // Start from S
        dpScore[n - 1][n - 1] = 0;
        dpWays[n - 1][n - 1] = 1;

        // Traverse from bottom-right to top-left
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {

                char ch = board.get(i).charAt(j);

                // Skip blocked cells
                if (ch == 'X')
                    continue;

                // Skip S because it's already initialized
                if (i == n - 1 && j == n - 1)
                    continue;

                int maxScore = -1;
                int ways = 0;

                // Down (reverse of moving up)
                if (i + 1 < n && dpScore[i + 1][j] != -1) {
                    if (dpScore[i + 1][j] > maxScore) {
                        maxScore = dpScore[i + 1][j];
                        ways = dpWays[i + 1][j];
                    } else if (dpScore[i + 1][j] == maxScore) {
                        ways = (ways + dpWays[i + 1][j]) % MOD;
                    }
                }

                // Right (reverse of moving left)
                if (j + 1 < n && dpScore[i][j + 1] != -1) {
                    if (dpScore[i][j + 1] > maxScore) {
                        maxScore = dpScore[i][j + 1];
                        ways = dpWays[i][j + 1];
                    } else if (dpScore[i][j + 1] == maxScore) {
                        ways = (ways + dpWays[i][j + 1]) % MOD;
                    }
                }

                // Diagonal
                if (i + 1 < n && j + 1 < n && dpScore[i + 1][j + 1] != -1) {
                    if (dpScore[i + 1][j + 1] > maxScore) {
                        maxScore = dpScore[i + 1][j + 1];
                        ways = dpWays[i + 1][j + 1];
                    } else if (dpScore[i + 1][j + 1] == maxScore) {
                        ways = (ways + dpWays[i + 1][j + 1]) % MOD;
                    }
                }

                // If unreachable, skip
                if (maxScore == -1)
                    continue;

                // Add current cell's value (except E)
                if (ch != 'E') {
                    maxScore += ch - '0';
                }

                dpScore[i][j] = maxScore;
                dpWays[i][j] = ways;
            }
        }

        if (dpWays[0][0] == 0)
            return new int[]{0, 0};

        return new int[]{dpScore[0][0], dpWays[0][0]};
    }
}