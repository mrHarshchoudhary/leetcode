class Solution {
    public int findLHS(int[] nums) {
         Arrays.sort(nums);

        int maxLen = 0;
        int start = 0;

        for (int end = 0; end < nums.length; end++) {
   
            while (nums[end] - nums[start] > 1) {
                start++;
            }
          
            if (nums[end] - nums[start] == 1) {
                maxLen = Math.max(maxLen, end - start + 1);
            }
        }
        return maxLen;
    }
}