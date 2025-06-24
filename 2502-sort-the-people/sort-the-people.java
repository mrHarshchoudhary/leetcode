import java.util.*;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        String[] sortedNames = new String[n];
        Integer[] indices = new Integer[n];

        // Initialize indices array
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        // Sort indices based on corresponding heights in descending order
        Arrays.sort(indices, (i1, i2) -> heights[i2] - heights[i1]);

        // Arrange names according to sorted indices
        for (int i = 0; i < n; i++) {
            sortedNames[i] = names[indices[i]];
        }

        return sortedNames;
    }
}
