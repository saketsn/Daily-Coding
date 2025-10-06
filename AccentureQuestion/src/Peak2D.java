package AccentureQuestion.src;

public class Peak2D {

    static int[] findPeak(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int current = matrix[i][j];
                boolean isPeak = true;

                 if (i > 0 && matrix[i - 1][j] > current)
                    isPeak = false;
                if (i < m - 1 && matrix[i + 1][j] > current)
                    isPeak = false;
                if (j > 0 && matrix[i][j - 1] > current)
                    isPeak = false;
                if (j < n - 1 && matrix[i][j + 1] > current)
                    isPeak = false;

                if (isPeak)
                    return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 15},
                {21, 30, 14},
                {7, 16, 32}
        };

        int[] peak1 = findPeak(matrix);
        System.out.println("Peak at: " + peak1[0] + ", " + peak1[1]);


    }
}
