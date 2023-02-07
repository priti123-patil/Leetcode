class Solution {
    public int totalFruit(int[] fruits) {
        //2baskets- each will contain single type of fruit
        //exactly 1 fruit from 1 tree
        //hashmap
        // i freq
        // 1 1
        // 2 3
        // 3 1
        //longest subarray which has utmost 2 unique subarrays
        //sliding window - i starting point j-ending point of window
        HashMap<Integer,Integer> basket=new HashMap<>();
        int i=0,j=0,max=0;
        for(j=0;j<fruits.length;j++){
            basket.put(fruits[j], basket.getOrDefault(fruits[j],0)+1);
            while(basket.size() > 2){
                basket.put(fruits[i] , basket.get(fruits[i])-1);//reducethe ith keys value by 1 as we areincrementingi
                if(basket.get(fruits[i]) == 0)
                    basket.remove(fruits[i]);
                i++;
            }
            max = Math.max(max,j-i+1);
        }
        return max;
    }
}