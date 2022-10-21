import java.io.*;
import java.util.*;
class Solution {
    public int maxSubArray(int[] nums) 
    {
         //if it is less than 0 then make it 0
        int sum=  0;
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
            if(sum >= max)
                max=sum;
            if(sum < 0 )
                sum=0;
        
        }
        return max;
    }
    
}
