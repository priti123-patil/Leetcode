class Solution {
    public int compress(char[] chars) {
        if(chars.length == 1)
            return 1;
        int n = chars.length;
        int i = 0, j = 0;
        while ( i < n) {
            int count = 1;
            while ( i < n-1  && chars[i] == chars[i+1]) {
                i++;
                count++;
            }
            chars[j++] = chars[i++];
            if (count > 1) {
                for ( char c : String.valueOf(count).toCharArray()){
                    chars[j++] = c;
                }
            }
        }
        return j;
    }
}