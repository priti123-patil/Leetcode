class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxweight=0;
        //minimum capacity
        int sum=0;
        //maximum capacity
        for(int i:weights)
        {
            maxweight=Math.max(maxweight,i);
            sum+=i;
        }
        //binary search
        int left=maxweight;
        int right=sum;
        
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(possible(mid,days,weights))
            {
                right=mid;
            }
            else
            {
                left=mid+1;
            }
        }
        return left;
    }
    public boolean possible(int capacity,int D,int[] weights)
    {
        int days=1;
        int curr=0;
        for(int x:weights)
        {
            curr += x;
            if(curr>capacity)
            {
                curr = x;
                days += 1;
                if(days > D)
                {
                    return false;
                }
            }
        }
        return true;
    }
}