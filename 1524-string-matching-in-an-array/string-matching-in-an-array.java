class Solution {
    public List<String> stringMatching(String[] words) {
         List<String> matchedStrings = new ArrayList<>();
      
        int numberOfWords = words.length;
      
      
        for (int i = 0; i < numberOfWords; ++i) {
           
            for (int j = 0; j < numberOfWords; ++j) {
                
                if (i != j && words[j].contains(words[i])) {
        
                    matchedStrings.add(words[i]);
                
                    break;
                }
            }
        }
        // Return the list of matched strings
        return matchedStrings;
    }
}