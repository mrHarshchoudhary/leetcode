class Solution {
    public int dfs(int src,int par, List<List<Integer>>adjList,List<Boolean>hasApple){
        int totaltime=0;
        for(int neighbour:adjList.get(src)){
            if(neighbour==par)continue;
            int timetakenbychild=dfs(neighbour,src,adjList,hasApple);
            if(timetakenbychild>0||hasApple.get(neighbour)){
                totaltime+=timetakenbychild+2;
            }

        }
        return totaltime;
    }
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<List<Integer>>adjList=new ArrayList<>();
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        for(int edge[]:edges){
            int from=edge[0];
            int to=edge[1];
            adjList.get(from).add(to);
             adjList.get(to).add(from);
        }
        return dfs(0,-1,adjList,hasApple);
    }
}