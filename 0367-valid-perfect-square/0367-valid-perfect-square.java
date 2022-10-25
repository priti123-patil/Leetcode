class Solution {
    public boolean isPerfectSquare(int num) {
        
        if(num==1 || num==9 || num==4)
            return true;
        long i=1;
        long j=num/4;
        
        while(i<=j)
        {
            long mid=(i+j)/2;
            
            if(mid*mid == num)
                return true;
            if(mid*mid > num)
                j=mid-1;
            else
                i=mid+1;
        }
        return false;
    }
}