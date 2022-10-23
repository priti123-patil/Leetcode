class Solution {
    public int rob(int[] nums) {

        int a = 0;
        int b = 0;
        for (int n : nums) 
        {
            int temp = a;
            a = Math.max(a, b);
            b = n + temp;
        }
        
        return Math.max(a, b);
    }
}