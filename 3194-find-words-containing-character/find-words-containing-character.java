class Solution {
    public static boolean contain(String s,char ch){
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)==ch)return true;
        }
        return false;
    }
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer>arr=new ArrayList<>();

        for(int i=0;i<words.length;i++){
            if(contain(words[i],x)){
                arr.add(i);
            }
        }
        return arr;
    }
}