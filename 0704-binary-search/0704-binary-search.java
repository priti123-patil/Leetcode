class Solution {
    public int search(int[] nums, int target) {
         
       return helper(nums, target, 0, nums.length-1);
         
    }
    
    static int helper(int[] nums, int target,  int l,   int h)
    {
        if(l>h)
        {
            return -1;
        }
    
        int mid= l+(h-l) / 2 ;
        
        if(nums[mid]==target)
        {
            return mid;
        }
        
        if(nums[mid] > target)
        {
            return helper(nums, target, l, mid-1);
        }
        
        return helper(nums,  target,   mid+1,  h);
        
    }
}