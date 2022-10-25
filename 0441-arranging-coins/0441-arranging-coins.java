class Solution {
    public int arrangeCoins(int n) {
        
        long i=0;
        long j=n;
        long mid=0;
        long count=0;
        
        while(i<=j)
        {
            mid=i+(j-i)/2;
            
            count=mid*(mid+1)/2;
            
            if(count==n)
                return (int)mid;
            
            else if(count>n)
                j=mid-1;
            
            else if(count<n)
                i=mid+1;
            
        }
        return (int)j;
        
    }
}