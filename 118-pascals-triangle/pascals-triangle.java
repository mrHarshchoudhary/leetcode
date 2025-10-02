class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> triangle = new ArrayList<>();

        // Base case: first row is always [1]
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        // Build from row 2 to numRows
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> newRow = new ArrayList<>();

            // first element is always 1
            newRow.add(1);

            // middle elements = sum of two above
            for (int j = 1; j < i; j++) {
                newRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // last element is always 1
            newRow.add(1);

            triangle.add(newRow);
        }

        return triangle;
    }
}