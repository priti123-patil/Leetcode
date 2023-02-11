class Solution {
    public int splitArray(int[] nums, int m) {
        int low=0 , high=0 , res=0;
        for(int n:nums){
            low = Math.max(low , n);
            high += n;
        }
        while(low < high){
            int mid= low + (high-low) / 2;
            int sum=0,count=1;
            for(int n:nums)
            {
                if(sum  +  n > mid){
                    count++;
                    sum=n;
                } 
                else {
                sum += n;
                }
            }
            if(count > m)
                low = mid+1;
            else
                high = mid;
        }
        return high;
    }
    
}