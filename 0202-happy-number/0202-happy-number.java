class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)){
            set.add(n);
            n = next(n);
        }
        return (n == 1);
    }
    public int next(int n) {
        int total = 0;
        while (n > 0) {
            int t = n % 10;
            n = n / 10;
            total += t * t;
        }
        return total;
    }
}