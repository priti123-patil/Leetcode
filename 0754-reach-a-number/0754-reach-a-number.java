class Solution {
    public int reachNumber(int target) {
        
        target = Math.abs(target);
        int step = 0;
        int ans = 0;
        while (ans < target) 
        {
            step++;
            ans += step;
        }
        while ((ans - target) % 2 != 0) 
        {
            step++;
            ans += step;
        }
        return step;
    }
}