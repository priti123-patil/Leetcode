class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        //adj list- list of pair of integers - adj[node] - neighbours of node - [nighbour,color]
        Map<Integer, List<List<Integer>>> adj = new HashMap<>();
        //red-0 blue-1
        for (int[] red : redEdges) {
            adj.computeIfAbsent(red[0], k -> new ArrayList<List<Integer>>()).add(Arrays.asList(red[1], 0));
        }
        for (int[] blue : blueEdges) {
            adj.computeIfAbsent(blue[0], k -> new ArrayList<List<Integer>>()).add(Arrays.asList(blue[1], 1));
        }
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        boolean[][] visited = new boolean[n][2];
        //queue contains - 1.the current node
        //2. the steps taken to visit the node
        //3. the color of the previous edge used.
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] { 0, 0, -1 });
        ans[0] = 0;
        visited[0][0] = true;
        visited[0][1] = true;
        while (!q.isEmpty()) 
        {
            int[] element = q.poll();
            int node = element[0], steps = element[1], prevColor = element[2];
            if (!adj.containsKey(node)) {
                continue;
            }
            for (List<Integer> neighbours : adj.get(node)) 
            {
                int ne = neighbours.get(0);
                int color = neighbours.get(1);
                if (!visited[ne][color] && color != prevColor) {
                    if (ans[ne] == -1)
                        ans[ne] = 1 + steps;
                    visited[ne][color] = true;
                    q.offer(new int[] { ne, 1 + steps, color });
                }
            }
        }
        return ans;
    }
}