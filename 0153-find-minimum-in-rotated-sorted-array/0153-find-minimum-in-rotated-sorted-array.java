class Solution {
    public int findMin(int[] nums) {
        
        if(nums.length==1)
            return nums[0];
        
        int first=0;
        
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                first=i+1;
                break;
            }
        }
        int min=nums[0];
        
        if(nums[first] < min)
        {
            min = search(nums,first,nums.length-1,min);
        }
        else
        {
            min = search(nums,0,first-1,min);
        }
        return min;
    }
    
    public int search(int[] nums , int l , int h , int min)
    {
        for(int i=l;i<=h;i++)
        {
            if(nums[i]<min)
                min=nums[i];
        }
        return min;
    }
}