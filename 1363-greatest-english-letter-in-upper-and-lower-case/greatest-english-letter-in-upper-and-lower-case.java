class Solution {
    public String greatestLetter(String s) {
 boolean[] upper = new boolean[26];
        boolean[] lower = new boolean[26];
        
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upper[ch - 'A'] = true;
            } else if (Character.isLowerCase(ch)) {
                lower[ch - 'a'] = true;
            }
        }
        
     
        for (int i = 25; i >= 0; i--) {
            if (upper[i] && lower[i]) {
         
                return Character.toString((char) (i + 'A'));
            }
        }
        
        return "";
    }
}