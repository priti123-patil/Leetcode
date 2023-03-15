class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 1;
        int high = nums.length;
        int ans = 0;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(isPossible(mid,target,nums)){
                ans = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int mid,int target,int[] nums)
    {
        if(mid < 0)
            return false;
        int sum=0;
        for(int i=0;i<mid;i++){
            sum += nums[i];
        }
        if(sum >= target)
            return true;
        for(int i=mid;i<nums.length;i++){
            sum += nums[i] - nums[i-mid];
            if(sum >= target)
                return true;
        }
    return false;
    }
}