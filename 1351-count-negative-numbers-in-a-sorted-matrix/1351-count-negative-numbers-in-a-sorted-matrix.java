class Solution {
    public int countNegatives(int[][] grid) {
        int i=0;
        int count=0;
        
        for(int[] row:grid)
        {
            for(i=0;i<row.length;i++)
            {
                if(row[i]<0)
                    count++;
            }
        }
        return count;
    }
}