class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        int max_time = 0;
        for(int i:time)
            max_time = Math.max(max_time,i);
        long low = 0, high =(long) max_time * totalTrips;//lower and upper boundary
        while(low < high){
            long mid = (low+high)/2;
            if(canComplete(time, mid, totalTrips)){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    public boolean canComplete(int[] time,long curr_time,int totalTrips)
    {
        long total = 0L;
        for(int i:time)
        {
            total = total + (curr_time/i);
        }
        return total >= totalTrips;
    }
}