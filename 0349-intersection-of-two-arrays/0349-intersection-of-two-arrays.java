class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
            
        ArrayList<Integer> ans= new ArrayList<>();
        
        int i=0,j=0;
        
        while(i<nums1.length)
        { 
            j=0;
            while(j<nums2.length)
            {
                
            if(nums1[i]==nums2[j])
            {
                if(!ans.contains(nums1[i]))
                {
                    ans.add(nums1[i]); 
                }
            }
           
             j++;     
            
             }
             i++;
        }
        
        int[] arr=new int[ans.size()];
        
        for(int k=0;k<ans.size();k++)
        {
           arr[k] = ans.get(k);
        }
        
        return arr;
    }
}