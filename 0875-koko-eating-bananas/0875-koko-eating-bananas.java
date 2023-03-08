class Solution {
    public int minEatingSpeed(int[] piles, int h) 
    {
        long lo = 1, hi = getMaxPile(piles);
        // Binary search to find the smallest valid K.
        while (lo <= hi) 
        {
            long K = lo + (hi - lo) /2 ;
            if (canEatAll(piles, K, h)) {
                hi = K - 1;
            } 
            else {
                lo = K + 1;
            }
        }
        return (int)lo;
    }
    private boolean canEatAll(int[] piles, long K, long H) 
    {
        long countHour = 0; // Hours take to eat all bananas at speed K.
        for (int pile : piles){
            countHour += pile / K;
            if (pile % K != 0)
                countHour++;
        }
        return countHour <= H;
    }
    private int getMaxPile(int[] piles) 
    {
        int maxPile = Integer.MIN_VALUE;
        for (int pile : piles) {
            maxPile = Math.max(pile, maxPile);
        }
        return maxPile;
    }
    
}