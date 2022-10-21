class Solution {
    public int[] sumZero(int n) 
    {
        int[] res=new int[n];
        
        if(n==1)
        {
            res[0]=0;
            return res;
        }
        
        for(int i=0 ;i < n-1 ;i+=2)
        {
            res[i]  =   i+1;
            res[i+1]= -(i+1);
        }
        
        if(n%2!=0)
            res[n-1]=0;
        
        return res;
    }
}