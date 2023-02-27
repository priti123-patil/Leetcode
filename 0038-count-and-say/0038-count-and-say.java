class Solution {
    public String countAndSay(int n) {
        if(n == 1) 
            return "1";
        
        String res = countAndSay(n-1);
        StringBuilder ans = new StringBuilder();
        int l = 0, r = 0;
        while(r < res.length()){
            int counter = 0;
            while(r<res.length() && res.charAt(l) == res.charAt(r)){
                counter++;
                r++;
            }
            ans.append(counter);
            ans.append(res.charAt(l));
            //System.out.println(counter+""+res.charAt(l));
            l = r;
        }
        return ans.toString();
    }
}