class Solution 
{
    public int oddCells(int m, int n, int[][] indices) {
        
        int[] row=new int[m];
        int[] col=new int[n];
        
        for(int[] ind : indices)//row by row traversing , ind will contain indices's row
        {
            
            row[ind[0]]++;//incrementing row
            col[ind[1]]++;//incrementing column
            
        }
        int count=0;
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
              if((row[i]+col[j])%2 != 0)
                count++;                
            }
        }
        return count;
    }
}