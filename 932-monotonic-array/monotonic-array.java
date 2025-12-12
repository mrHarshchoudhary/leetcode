class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length < 2) return true;
        int dire = 0;  

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {  
                if (dire == 0) dire = 1;
                else if (dire == -1) return false;
            } else if (nums[i] < nums[i-1]) {  
                if (dire == 0) dire = -1;
                else if (dire == 1) return false;
            }
        }

        return true;
    }
}