public class ChessBoard {
    public String[][] chess(int m, int n) {
        if (m == n) {
            int i, j;
            String[][] board = new String[m][n];
            String string1 = "WW|";
            String string2 = "BB|";
            for (i = 0; i < m; i++)//loop for row
            {
                for (j = 0; j < n; j++)//loop for column
                {
                    if (((i + j) % 2) == 0)
                        board[i][j] = string1;
                    else
                        board[i][j] = string2;
                }
            }
            return board;//return chessboard structure
        }else
        return null;
    }
}
