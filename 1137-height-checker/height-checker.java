class Solution {
    public int heightChecker(int[] heights) {
        int []arr=new int[heights.length];
        int c=0;
        int index=0;
        for(int i=0;i<heights.length;i++){
            arr[index++]=heights[i];

        }
        Arrays.sort(arr);
        for(int i=0;i<heights.length;i++){
            if(arr[i]!=heights[i])c++;
                
            
        }
        return c;
    }
}