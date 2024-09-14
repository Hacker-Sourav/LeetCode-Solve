class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean rows[][] = new boolean[9][10];
        boolean cols[][] = new boolean[9][10];
        boolean sqrs[][][] = new boolean[3][3][10];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j]=='.') continue;
                int k = board[i][j]-'0';
                if (rows[i][k] == true || cols[j][k] == true || sqrs[i / 3][j / 3][k] == true) {
                    return false;
                }
                rows[i][k] = true;
                cols[j][k] = true;
                sqrs[i / 3][j / 3][k] = true;
            }
        }
        return true;
    }
}