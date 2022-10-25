class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=0;
        int h=arr.length-1;
        int mid=0;
        if(arr.length==1)
        {
            return 0;
        }
        while(l<h)
        {
            mid=l+(h-l) / 2;
            if(arr[mid]>arr[mid+1])
            {
                //mid also can be the answer so make h as mid
                //and as we are not reducing h 
                //we will give a condition l<h to while
                //otherwise it will go to infinite loop
                //this loop will break when we l and h are pointing to the same element
                //which is the answer
                
                h=mid;
            }
            else
            {
                l=mid+1; 
            }
        }
        //after this loop l and h are pointing to the answer 
        
        return l;
}
}