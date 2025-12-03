class Solution {
    public String[] findWords(String[] words) {

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> ans = new ArrayList<>();

        for (String word : words) {
            String w = word.toLowerCase();
            
            boolean inRow1 = true, inRow2 = true, inRow3 = true;

            for (char c : w.toCharArray()) {
                if (row1.indexOf(c) == -1) inRow1 = false;
                if (row2.indexOf(c) == -1) inRow2 = false;
                if (row3.indexOf(c) == -1) inRow3 = false;
            }

            if (inRow1 || inRow2 || inRow3)
                ans.add(word);
        }

        return ans.toArray(new String[0]);
    }
}
