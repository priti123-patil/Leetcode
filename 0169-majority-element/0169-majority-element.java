class Solution {
    public int majorityElement(int[] nums) {
    
        int major=nums[0];
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(major==nums[i])
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count==0)
            {
                count=1;
                major=nums[i];
            }
        }
        return major;
    }
}