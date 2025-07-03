class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");
        
        while (word.length() < k) {
            int len = word.length();
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < len; i++) {
                char nextChar = (char) ((word.charAt(i) - 'a' + 1) % 26 + 'a');
                temp.append(nextChar);
            }
            word.append(temp);
        }

        return word.charAt(k - 1);
    }
}