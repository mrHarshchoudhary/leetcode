class Solution {
    public List<String> commonChars(String[] words) {
       
        int cfs[]=new int[26];
        for(char c:words[0].toCharArray()){
            cfs[c-'a']++;
        }
      
        for(int i=1;i<words.length;i++){
  int curr[]=new int[26];
  for(char ch:words[i].toCharArray()){
    curr[ch-'a']++;
  }
  for(int j=0;j<26;j++){
    cfs[j]=Math.min(cfs[j],curr[j]);
  }

  }
   List<String>ans=new ArrayList<>();
for(int k=0;k<26;k++){
    if(cfs[k]!=0){
        char s=(char)(k+97);
        int count=cfs[k];
        while(count>0){
            ans.add(""+s);
            count--;
        }

    }
}
return ans;
    }
}