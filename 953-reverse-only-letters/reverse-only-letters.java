class Solution {
    public String reverseOnlyLetters(String s) {
       int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();

        while (left < right) {
            if (Character.isLetter(chars[left]) && Character.isLetter(chars[right])) {
                // Swap both letters
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                left++;
                right--;
            } else if (!Character.isLetter(chars[left])) {
                // Skip non-letter on the left
                left++;
            } else if (!Character.isLetter(chars[right])) {
                // Skip non-letter on the right
                right--;
            }
        }

        return new String(chars);
    }
}