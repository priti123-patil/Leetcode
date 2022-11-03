class Solution {
    
    private static final int MOD = 1_000_000_007;
    
    public int countGoodNumbers(long n) {
        return (int)(helper(n / 2, 4 * 5) * (n % 2 == 0 ? 1 : 5) % MOD);
    }
    
    private long helper(long  power, long x) 
    {
        if (power == 0) 
        {
            return 1;
        }
        else if (power % 2 == 0) 
        {
            return helper(power / 2, x * x % MOD);
        } 
        return x * helper(power - 1, x) % MOD;
    }
}