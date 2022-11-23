class Solution {
    
    int cnt=0;
    
    public int countArrangement(int n) {
        
        if (n == 0) 
            return 0;
        
        helper(n, 1, new int[n + 1]);
        
        return cnt;
    }
    
    private void helper(int n, int pos, int[] done) 
    {
        if (pos > n) 
        {
            cnt++;
            return;
        }
        
        for (int i = 1; i <= n; i++) 
        {
            if (done[i] == 0 && (i % pos == 0 || pos % i == 0)) 
            {
                done[i] = 1;
                
                //backtracking
                helper(n, pos + 1, done);
                
                done[i] = 0;
            }
        }
    }
    
}