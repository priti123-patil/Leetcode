class Solution {
    Integer memo[][];
    
    public int minDistance(String s1, String s2) {
        if(s1.equals(s2))
            return 0;
        
        memo = new Integer[s1.length() + 1][s2.length() + 1];
        
        return  helper(s1, s2, s1.length(), s2.length());
    }
    //last character to first character of string 
    public int helper(String s1,String s2, int si1 , int si2)
    {
        if(si1 == 0)
            return si2;
        
        if(si2 == 0)
            return si1;
        
        if(memo[si1][si2] != null)
            return memo[si1][si2];
        
        int minDis = 0;
        
        if(s1.charAt(si1 - 1) == s2.charAt(si2 - 1)){
            minDis = helper(s1, s2, si1-1, si2-1);
        }
        else
        {
            int insert = helper(s1, s2, si1, si2-1);
            int delete = helper(s1, s2, si1-1, si2);
            int replace = helper(s1, s2, si1-1, si2-1);
            
            minDis = Math.min(insert, Math.min(delete , replace)) +1;
        }
        memo[si1][si2] = minDis;
        return minDis;
    }
}