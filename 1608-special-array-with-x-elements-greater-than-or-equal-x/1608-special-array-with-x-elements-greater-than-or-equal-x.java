class Solution {
    public int specialArray(int[] nums) {
        //Arrays.sort(nums);
        
        int[] arrx= new int[nums.length+1];
        
        int count=0;
        
        for(int i=0;i<nums.length+1;i++)
        {
            arrx[i]=i;
        }
        
        for(int i=0;i<arrx.length;i++)
        {
            count=0;
            
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j] >= arrx[i])
                {
                     count++;
                     //System.out.println(count + "number" +arrx[i] );
                }
            }
            if(count==arrx[i])
                return arrx[i];
            
        }
        return -1;
    }
}