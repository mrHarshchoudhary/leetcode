class Solution {
    int rows;
    int cols;
    void dfs(int row,int col,int newcolor,int currcolor,boolean visited[][],int image[][]){
        if(row<0||row>=rows||col<0||col>=cols||image[row][col]!=currcolor||visited[row][col])return;

        image[row][col]=newcolor;
        visited[row][col]=true;
        int adjList[][]={{row-1,col},{row,col+1},{row+1,col},{row,col-1}};
        for(int neighbor[]:adjList){
            dfs(neighbor[0],neighbor[1],newcolor,currcolor,visited,image);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        rows=image.length;
        cols=image[0].length;
        boolean visited[][]=new boolean[rows][cols];
        dfs(sr,sc,color,image[sr][sc],visited,image);
        return image;
    }
}