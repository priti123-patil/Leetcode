class Solution {
    public int diagonalSum(int[][] mat) {
        
        int sum=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(i==j)
                    sum+=mat[i][j];
            }
        }
        int j=mat[0].length-1;
        for(int i=0;i<mat.length;i++)
        {
            sum += mat[i][j];
            j--;
        }
        
        int size=mat.length;
        
        if(size%2 != 0)
        {
            sum -= mat[size/2][size/2];
        }
        
        return sum;    
    }
}