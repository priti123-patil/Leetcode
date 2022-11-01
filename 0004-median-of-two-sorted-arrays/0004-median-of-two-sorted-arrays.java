class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        if(nums2.length < nums1.length)
        {
            return findMedianSortedArrays(nums2 , nums1);
        }
        int n1=nums1.length;
        int n2=nums2.length;
        int low=0;
        int high=n1;
        
        while(low<=high)
        {
            int cut1 = low+(high-low)/2;
            int cut2 = ((n1+n2+1)/2 )-cut1;
            
            int l1=0;
            if(cut1 == 0)
            {
                l1=Integer.MIN_VALUE;
            }
            else
            {
                l1=nums1[cut1 - 1];
            }
            int l2=0;
            if(cut2 == 0)
            {
                l2=Integer.MIN_VALUE;
            }
            else
            {
                l2=nums2[cut2-1];
            }
            
            int r1=0;
            if(cut1 == n1)
            {
                r1=Integer.MAX_VALUE;
            }
            else
            {
                r1=nums1[cut1];
            }
            double r2=0;
            if(cut2 == n2)
            {
                r2=Integer.MAX_VALUE;
            }
            else
            {
                r2=nums2[cut2];
            }
            
            if(l1 <= r2 && l2 <=r1)
            {
                if((n1+n2)%2 == 0)
                {
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2;
                }
                else
                {
                    return Math.max(l1,l2);
                }
            }
            else if(l1>r2)
            {
                high=cut1-1;
            }
            else
            {
                low=cut1+1;
            }
        }
        
        return 0;
    }
}