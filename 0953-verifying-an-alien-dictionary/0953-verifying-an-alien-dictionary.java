class Solution {
    
    public boolean isAlienSorted(String[] words, String order) {
        int[] arr = new int[26];
        for(int i = 0; i < order.length(); i++) {
            arr[order.charAt(i) - 'a'] = i;
        }
        for (int i = 1; i < words.length; i++) {
            String before = words[i - 1];
            String after = words[i];
            int n = before.length();
            int m = after.length();
            boolean flag = false;
            for (int j = 0 , k = 0; j < n && k < m; j++, k++) {
                if (arr[before.charAt(j) - 'a'] < arr[after.charAt(k) - 'a']) {
                    flag = true;
                    break;
                }
                else if (arr[before.charAt(j) - 'a'] > arr[after.charAt(k) - 'a']) {
                    return false;
                }
            }
            if (!flag && before.length() > after.length()) {
                return false;
            }
        }
        return true;
    }
}