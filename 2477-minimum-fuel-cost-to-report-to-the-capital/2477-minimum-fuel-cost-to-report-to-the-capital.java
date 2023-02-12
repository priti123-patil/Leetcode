class Solution {
    long fuel;
    public long minimumFuelCost(int[][] roads, int seats) {
        HashMap<Integer, List<Integer>> adj = new HashMap<>();
        for(int[] road : roads){
            adj.computeIfAbsent(road[0], k-> new ArrayList<Integer>()).add(road[1]);
            adj.computeIfAbsent(road[1], k-> new ArrayList<Integer>()).add(road[0]);
        }
        dfs(0, -1, adj, seats);
        return fuel;
    }
    public long dfs(int node, int parent, Map<Integer, List<Integer>> adj, int seats){
        //r stands for representatives 
        int r=1;
        if(!adj.containsKey(node)){
            return r;
        }
        for(int child : adj.get(node)){
            if(child != parent){
                r += dfs(child, node, adj, seats); 
            }
        }
        if(node != 0){
            fuel += Math.ceil((double) r/seats);
        }
        return r;
    }
}