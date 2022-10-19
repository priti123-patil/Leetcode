class Solution {
    public boolean checkIfPangram(String sentence) 
    {
        
        if(sentence.length()<26)
            return false;
        
        HashSet<Character> set=new HashSet<Character>();
        
        for(int i=0;i<sentence.length();i++)
        {
            set.add(sentence.charAt(i));
        }
        
        if(set.size()>=26)
            return true;
        
        return false;
    }
}