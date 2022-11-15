class Solution {
    public int countHomogenous(String s) {
        if (s == null || s.length() == 0)
            return 0;
        long res = 0;
        char[] ch = s.toCharArray();
        int len = ch.length;
        int l = 0, r = 0;
        long count = 0;
        
        while (r < len) {
            while (r < len && (l - r == 0 || ch[r] == ch[r - 1])) {
                count++;
                r++;
            }
            res += (((count) % 1000000007) * ((count + 1) % 1000000007) / 2) % 1000000007;
            l = r;
            count = 0;
        }
        return (int)(res % 1000000007);
    }
}