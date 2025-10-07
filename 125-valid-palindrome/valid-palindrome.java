class Solution {
    public static boolean palindrom(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right))return false;
            left++;
            right--;
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char c = Character.toLowerCase(ch);
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
            
        }
        String str=new String(sb);
        if(palindrom(str))return true;
        
        return false;
    }
}