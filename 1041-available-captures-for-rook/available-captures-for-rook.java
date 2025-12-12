class Solution {
    public int numRookCaptures(char[][] board) {
        int R = 0, C = 0;

        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                if (board[r][c] == 'R') {
                    R = r;
                    C = c;
                }
            }
        }
        int count = 0;
   
        for (int i = R - 1; i >= 0; i--) {
            if (board[i][C] == 'B') break;
            if (board[i][C] == 'p') {
                count++;
                break;
            }
        }

        for (int i = R + 1; i < 8; i++) {
            if (board[i][C] == 'B') break;
            if (board[i][C] == 'p') {
                count++;
                break;
            }
        }
        for (int i = C - 1; i >= 0; i--) {
            if (board[R][i] == 'B') break;
            if (board[R][i] == 'p') {
                count++;
                break;
            }
        }
     
        for (int i = C + 1; i < 8; i++) {
            if (board[R][i] == 'B') break;
            if (board[R][i] == 'p') {
                count++;
                break;
            }
        }
        return count;
    }
}
