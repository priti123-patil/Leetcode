class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //sort s1 and compare it with the all sorted substrings of the s2
        if(s1.length() > s2.length())
            return false;
        s1 = sort(s1);
        for(int i=0;i <= s2.length()-s1.length();i++){
            String substr = sort(s2.substring(i , i+s1.length()));
            if(s1.equals(substr))
                return true;
        }
        return false;
    }
    public String sort(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}