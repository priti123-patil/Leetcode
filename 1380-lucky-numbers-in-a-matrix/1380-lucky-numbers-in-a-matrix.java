class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        ArrayList<Integer> res=new ArrayList<>();
        
        for(int[] rows:matrix)
        {
            int min=rows[0];
            int col=0;
            for(int i=0;i<rows.length;i++)
            {
                if(rows[i]<min)
                {
                    min=rows[i];
                    col=i;
                }
            }
            if(maxincol(matrix,col,min))
               {
                   res.add(min);
               }
        }
        return res;
    }
    public boolean maxincol(int[][] matrix , int col , int maxe)
    {
        int max=0;
        
        for(int i=0;i<matrix.length;i++)
        {
           if(matrix[i][col] >= max)
           {
               max=matrix[i][col];
           }
        }
        if(maxe==max)
            return true;
        return false;
    }
}