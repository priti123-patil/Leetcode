class Solution {
    public int countValidWords(String sentence) {
        
        String[] str = sentence.split(" ");
        int res = 0;
        for (String s : str) 
        {        
            if (!s.equals("") && isValid(s)) 
            {
                res++;
            }
        }
        return res;
    }
    
    public boolean isValid(String s) 
    {
        int h = 0, m = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) 
        {
            
            if (Character.isDigit(ch[i]) || ch[i] == ' ') 
            {
                return false;
            }
            if (ch[i] == '-') 
            {
                h++;
                if (h >= 2) 
                    return false;
                
                else if (i == 0 || i == ch.length - 1 || !Character.isLetter(ch[i - 1]) ||                                !Character.isLetter(ch[i + 1])) 
                    return false;
            }
            if (ch[i] == '!' || ch[i] == '.' || ch[i] == ',') 
            {
                m++;
                if (m >= 2) 
                    return false;
                
                if (i != ch.length - 1) 
                    return false;
            }
        }
        return true;
    }
}