class Solution {
    public int findUnsortedSubarray(int[] nums) {
         int n = nums.length;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int left = -1, right = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] < max) {
                right = i;
            } else {
                max = nums[i];
            }
        }


        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > min) {
                left = i;
            } else {
                min = nums[i];
            }
        }

        return (right == -1) ? 0 : right - left + 1;
    }
}