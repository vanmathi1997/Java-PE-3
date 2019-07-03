public class MatrixAddition {
    public int[][] addmatrix(int m,int n,int a[][],int b[][])
    {
        int c[][]=new int[m][n];
        for (int i = 0; i < m; i++)//loop for row
        {
            for (int j = 0; j < n; j++)//loop for column
            {
                for (int k = 0; k < n; k++)//add matrix
                {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
        }
        return c;
    }
    }
