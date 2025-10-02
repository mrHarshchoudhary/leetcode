class Solution {
    public List<String>getNeighbors(String word,HashSet<String>set){
        List<String>neighbours=new ArrayList<>();
        for(int i=0;i<word.length();i++){
            for(char ch='a';ch<='z';ch++){
                if(ch==word.charAt(i)){
                    continue;
                }
                String newWord=word.substring(0,i)+ch+word.substring(i+1,word.length());
                if(set.contains(newWord)){
                    neighbours.add(newWord);
                }
                          }
        }
        return neighbours;
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String>set=new HashSet<>(wordList);
        if(!set.contains(endWord)){
            return 0;

        }
        Queue<String>q=new LinkedList<>();
        q.offer(beginWord);
        if(set.contains(beginWord)){
            set.remove(beginWord);
        }
        int level=0;
        while(!q.isEmpty()){
            int currlevelsize=q.size();
            for(int i=0;i<currlevelsize;i++){
                String node=q.poll();
                //adjlist
                if(node.equals(endWord)){
                    return level+1;
                }
                List<String>neighbors=getNeighbors(node,set);
                for(String word:neighbors){
                        if(set.contains(word)){
                            q.offer(word);
                            set.remove(word);
                        }
                }
            }
            level++;
        }
return 0;
    }
}