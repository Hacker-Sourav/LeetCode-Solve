class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean flag1 = false;
        boolean flag2 = false;
        // check for col 0 having 0's
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                flag1 = true;
                break;
            }
        }
        // check for row 0 having 0's
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                flag2 = true;
                break;
            }
        }
        // use row 0 and col 0 as the record
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        // modify others by records
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        // modify rest row 0 and col 0 through flags
        if (flag1) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
        if (flag2) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }
    }
}