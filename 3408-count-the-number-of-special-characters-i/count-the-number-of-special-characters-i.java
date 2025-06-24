class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] lower = new boolean[26]; 
        boolean[] upper = new boolean[26]; 

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isLowerCase(ch)) {
                lower[ch - 'a'] = true;
            } else if (Character.isUpperCase(ch)) {
                upper[ch - 'A'] = true;
            }
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (lower[i] && upper[i]) {
                count++;
            }
        }

        return count;
    }
}