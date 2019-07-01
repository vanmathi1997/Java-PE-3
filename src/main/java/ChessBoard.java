public class ChessBoard {
    public String[][] chess()
    {
        int i,j;
        String[][] board=new String[8][8];
        String string1="WW|";
        String string2="BB|";
        for(i=0;i<8;i++)
        {
            for(j=0;j<8;j++)
            {
                if(((i+j)%2)==0)
                    board[i][j]=string1;
                else
                    board[i][j]=string2;
            }
        }
        return board;
    }
}
