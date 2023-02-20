class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int ind=0;
        int l=0,h=nums.length-1,mid;
        for(int i=0;i<nums.length;i++)
        {
            mid=(l+h)/2;
            if(target == nums[mid])
                ind = mid;
            if(target>nums[mid])
            {
                l=mid+1;
                ind = mid+1;
            }
            else
            {
                h=mid-1;
                ind = mid;
            }
           }
        return ind;
    }
}