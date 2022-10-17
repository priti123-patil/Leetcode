class Solution {
    public int repeatedStringMatch(String a, String b) 
    {
        String original = a;
        
        for (int rep = 1; rep <= b.length() / a.length() + 2; rep++, original += a)
            
            if (original.indexOf(b) != -1) 
                return rep;
        
        return -1;
    }
}