class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res=new ArrayList<>();   
        
        int sRow=0;
        int sCol=0;
        int r=matrix.length;
        int c=matrix[0].length;
        int eRow=r-1;
        int eCol=c-1;
        //take the count of elements to avaoid duplicates and go forward;
        
        int count=0;
        int total=r*c;
        //total no of elements
        
        while(count<total)
        {
        //Print starting row
        for(int i=sCol;count<total && i<=eCol;i++)
        {
            res.add(matrix[sRow][i]);
            count++;
        }
        sRow++;
        // 1 2  3  4 
        // 5 6  7  8  
        // 9 10 11 12
        
        //print ending column
        for(int i=sRow;count<total && i<=eRow;i++)
        {
            res.add(matrix[i][eCol]);
            count++;
        }
        eCol--;
        
        //print ending row
        for(int i=eCol;count<total && i>=sCol;i--)
        {
            res.add(matrix[eRow][i]);
            count++;
        }
        eRow--;
        
        //print starting column
        for(int i=eRow;count<total && i>=sRow;i--)
        {
            res.add(matrix[i][sCol]);
            count++;
        }
        sCol++; 
         
        }
        
        return res;
        
    }
}