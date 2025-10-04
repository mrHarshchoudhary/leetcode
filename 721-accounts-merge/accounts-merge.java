class Solution {
    public void dfs(String srcEmail,  HashSet<String>visited,  HashMap<String,List<String>>adjMap,  List<String>subList){
        visited.add(srcEmail);
        subList.add(srcEmail);
        if(!adjMap.containsKey(srcEmail)){
            return;
        }
        for(String neighbours:adjMap.get(srcEmail)){
            if(!visited.contains(neighbours)){
                dfs(neighbours,visited,adjMap,subList);
            }
        }
    }
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        //adj map
        HashMap<String,List<String>>adjMap=new HashMap<>();
        for(List<String>account:accounts){
            String firstEmail=account.get(1);
            for(int i=2;i<account.size();i++){
                String Email=account.get(i);
                if(!adjMap.containsKey(firstEmail)){
                    adjMap.put(firstEmail,new ArrayList<>());
                }
                adjMap.get(firstEmail).add(Email);

                if(!adjMap.containsKey(Email)){
                    adjMap.put(Email,new ArrayList<>());
                }
                adjMap.get(Email).add(firstEmail);
            }
        }
         List<List<String>>res=new ArrayList<>();
         HashSet<String>visited=new HashSet<>();
         for(List<String>account:accounts){
            String firstEmail=account.get(1);
            if(!visited.contains(firstEmail)){
                List<String>subList=new ArrayList<>();
                dfs(firstEmail,visited,adjMap,subList);
                Collections.sort(subList);
                subList.add(0,account.get(0));
                res.add(subList);
            }
         }
         return res;
    }
}