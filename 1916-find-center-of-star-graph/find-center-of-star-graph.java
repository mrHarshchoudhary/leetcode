class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,Integer>mp=new HashMap<Integer,Integer>();
        int totaledge=edges.length;
        for(int i=0;i<edges.length;i++){
            int v1=edges[i][0];
            int v2=edges[i][1];
            mp.put(v1,mp.getOrDefault(v1,0)+1);
            mp.put(v2,mp.getOrDefault(v2,0)+1);
            if(mp.get(v1)==totaledge)return v1;
            if(mp.get(v2)==totaledge)return v2;

        }
        return -1;
    }
}