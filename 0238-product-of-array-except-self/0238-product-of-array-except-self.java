class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int[] res=new int[nums.length];
        
        int left=1;
        
        int right=1;
        
        //left to right multiplication
        for(int i=0;i<nums.length;i++)
        {
            if(i>0)
                left = left * nums[i-1];
            res[i] = left;
        }
        //System.out.println(Arrays.toString(res));
        
        //right to left
        //and then multiplying with res
        for(int i=nums.length-2 ;i>=0;i--)
        {
            if(i < nums.length-1)
                right *= nums[i+1];
            
            res[i] *= right;
        }
        //System.out.println(Arrays.toString(res));
        return res;
    }
}