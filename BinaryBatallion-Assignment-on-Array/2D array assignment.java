1)RICHEST CUSTOMER WEALTH


class Solution {
    public int maximumWealth(int[][] accounts) {
       int res = 0;
       for(int i=0; i<accounts.length; i++)
       {
           int add = 0;
           for(int j=0; j<accounts[i].length; j++)
           {
               add += accounts[i][j];
               if(res < add)
               {
                   res = add;
               }
           }
       } 
        return res;
    }
}




2) TOEOLITZ MATRIX



class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=1; i<matrix.length; i++)
        {
            for(int j=1; j<matrix[0].length; j++)
            {
                if(matrix[i-1][j-1] != matrix[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    }
}



3) MATRIX DIAGONAL SUM



class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int res = 0;
        for(int i=0; i<n; i++)
        {
            res += mat[i][i];
            res += mat[n-1-i][i];
        }
        if(n%2 != 0)
        {
            res -= mat[n/2][n/2];
        }
        return res; 
    }
}



4) COUNT NEGATIVE NUMBERS IN A SORTED MATRIX


class Solution {
    public int countNegatives(int[][] grid) {
        int count  = 0;
        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<grid[0].length; j++)
            {
                if(grid[i][j] < 0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}



5) TRANSPOSE MATRIX


class Solution {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int s = matrix[0].length;
        int[][] rs = new int[s][r];
        for(int i=0; i<s; i++)
        {
            for(int j=0; j<r; j++)
            {
                rs[i][j] = matrix[j][i];
            }
        }
        return rs;
    }
}



6) SET MATRIX ZEROES



class Solution {
    public void setZeroes(int[][] matrix) {
        int s = 1;
        int r = matrix.length;
        int k = matrix[0].length;
        for(int i=0; i<r; i++)
        {
            if(matrix[i][0] == 0)
            {
                s = 0;
            }
            for(int j=1; j<k; j++)
            {
                if(matrix[i][j] == 0)
                {
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        } 
        for(int i=r-1; i>=0; i--)
        {
            for(int j=k-1; j>=1; j--)
            {
                if(matrix[i][0] == 0  ||  matrix[0][j] == 0)
                {
                    matrix[i][j] = 0;
                }
            }
            if(s == 0)
            {
                matrix[i][0] = 0;
            }
        }
    }
}

