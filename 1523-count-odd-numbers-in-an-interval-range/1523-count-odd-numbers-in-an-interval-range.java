class Solution {
    public int countOdds(int low, int high) {
        int ans = 0;
        if(low%2 != 0)
            ans++;
        if(ans==0 && high%2 != 0)
            ans++;
        ans += (high-low)/2;
        return ans;
    }
}