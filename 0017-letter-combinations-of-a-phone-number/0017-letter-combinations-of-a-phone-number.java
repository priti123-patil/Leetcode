class Solution {
    public List<String> letterCombinations(String digits) {
    
        if(digits.isEmpty())
        {
            return new ArrayList<>();
        }
        return helper("",digits);
        
    }
    
    public List<String> helper(String p,String up)
    {
        if(up.isEmpty())
        {
            List<String> local=new ArrayList<>();
            local.add(p);
            return local;
        }
        List<String> ans=new ArrayList<>();
        int digit=up.charAt(0)-'0';
        
        int i=(digit-2)*3;
        
        if(digit>7)
        {
            i+=1;
        }
        int len=i+3;
        if(digit==7 || digit==9)
        {
            len+=1;
        }
        for(int j=i;j<len;j++)
        {
            char ch=(char) ('a'+ j) ;
            ans.addAll(helper(p+ch , up.substring(1)));
        }
        return ans;
        
    }
}