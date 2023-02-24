class Solution {
    public int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num % 2 == 1)
                num = num * 2;
            pq.offer(num);
            min = Math.min(min, num);
        }
        int minDeviation = Integer.MAX_VALUE;
        while (true) {
            int max = pq.poll();
            minDeviation = Math.min(minDeviation, max - min);
            if (max % 2 == 1)
                break;
            max = max / 2;
            min = Math.min(min, max);
            pq.offer(max);
        }
        return minDeviation;
    }
}