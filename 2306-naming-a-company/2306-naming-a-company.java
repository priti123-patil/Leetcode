class Solution {
    public long distinctNames(String[] ideas) {
        
        HashSet<String>[] prefixGroups = new HashSet[26];
        for (int i = 0; i < 26; ++i)
            prefixGroups[i] = new HashSet<>();
        
        for (String s : ideas)
            prefixGroups[s.charAt(0) - 'a'].add(s.substring(1));
        
        long ans = 0;
        for (int i = 0; i < 26; ++i)
            for (int j = i + 1; j < 26; ++j) {
                long c = 0;
                
                for (String s : prefixGroups[i])
                    if (prefixGroups[j].contains(s))
                        c++;
                
                ans += 2*(prefixGroups[i].size() - c)*(prefixGroups[j].size() - c);
            }
        return ans;
    }
}