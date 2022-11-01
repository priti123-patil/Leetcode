class Solution {
    public int maxDistance(int[] position, int m) {
        int low=1;
        Arrays.sort(position);
        int high=position[position.length-1]-position[0];
        int res=0;
        int mid=0;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(isPossible(position,m,mid))
            {
                res=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return res;
    }
    
    public boolean isPossible(int[] arr , int balls , int dist)
    {
        int count=1;
        int temp=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]-temp >= dist)
            {
                temp=arr[i];
                count++ ;
            }
            if(count == balls)
                return true;
        }
        return false;
        
    }
}