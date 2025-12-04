class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        int currentNum = 0;
        String currentString = "";

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNum = currentNum * 10 + (c - '0');
            } 
            else if (c == '[') {
                countStack.push(currentNum);
                stringStack.push(currentString);
                currentNum = 0;
                currentString = "";
            }
            else if (c == ']') {
                int repeatTimes = countStack.pop();
                StringBuilder sb = new StringBuilder(stringStack.pop());
                sb.append(currentString.repeat(repeatTimes));
                currentString = sb.toString();
            }
            else {
                currentString += c;
            }
        }

        return currentString;
    }
}
