class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
       int a[]=new int[grid.length];
       int b[]=new int[grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                    a[i]=Math.max(a[i],grid[i][j]);
                    b[j]=Math.max(b[j],grid[i][j]);
            }
        }
        int total=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int h=Math.min(a[i],b[j]);
            total+=h-grid[i][j];
            }
        }
        return total;
    }
}