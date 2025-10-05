class Solution {
    public long minimumSteps(String s) {
        // char ch[]=s.toCharArray();
        int n=s.length();
        int l=0;
        long sns=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                    sns+=i-l;
                    l++;
            }
        }
        return sns;
        
       
    }
}