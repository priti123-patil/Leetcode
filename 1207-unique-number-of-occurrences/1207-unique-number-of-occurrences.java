class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       
        HashMap<Integer,Integer> ocurence=new HashMap<>();
        for(int i:arr)
            ocurence.put(i,ocurence.getOrDefault(i,0)+1);
          HashSet set=new HashSet<>(ocurence.values());
        return ocurence.size()==set.size();
   
    }
}