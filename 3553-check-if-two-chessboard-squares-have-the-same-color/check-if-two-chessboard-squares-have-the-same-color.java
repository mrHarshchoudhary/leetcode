class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
    int xDifference = coordinate1.charAt(0) - coordinate2.charAt(0);
        // Calculate the difference in the number part of the coordinates
        int yDifference = coordinate1.charAt(1) - coordinate2.charAt(1);
        // Both coordinates have the same color if the sum of differences is even
        return (xDifference + yDifference) % 2 == 0;
    }
}