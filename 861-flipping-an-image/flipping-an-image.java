class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        for (int[] row : image) {
           
            for (int i = 0; i < (n + 1) / 2; i++) {
           
                int temp = row[i] == 0 ? 1 : 0;
                row[i] = row[n - 1 - i] == 0 ? 1 : 0;
                row[n - 1 - i] = temp;
            }
        }
        
        return image;

    }
}