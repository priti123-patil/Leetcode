class Solution {
    public int splitArray(int[] nums, int m) {
        
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++)
        {
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }
        //Maximum value will be in start
        //end will contain the sum of all elements in an array 
        //now the start and end will be the limits for adding the elements  
        //here start and end are the 2 limits 
        //the sum of the elements in subarrays should not exceed this limit of end
        
        
        while(start<end)
        {
            int mid=start+(end-start) / 2;
            
            //calcualte the total parts you can divide array
            //we calculate the mid and set the limit for addition
            //sum cannt exceed mid 
            //when it is exceeding make new one and now pieces will increase
            int sum=0;
            int pieces=1;
            
            for(int num:nums)
            {
                if(sum  +  num > mid)
                {
                 //if this sum is exceeding the limit make new subarray
                   //ans add that num to next subaray
                   
                   sum=num;
                   pieces++;
                }
                else
                {
                    sum+=num;
                }
            }
            if(pieces>m)
            {
                start=mid+1;
            }
            else
            {
                end=mid;
            }
            
        }
        return end;
        
    }
}