import java.util.Arrays;

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);  

        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

       
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            ans[i] = binarySearch(prefix, queries[i]);
        }
        return ans;
    }

    
    private int binarySearch(int[] prefix, int target) {
        int left = 0, right = prefix.length - 1;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (prefix[mid] <= target) {
                result = mid + 1;  
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
