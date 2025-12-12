class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq = new int[1001];  
        for (int num : arr1) {
            freq[num]++;
        }

        int[] result = new int[arr1.length];
        int idx = 0;   
        for (int num : arr2) {
            while (freq[num] > 0) {
                result[idx++] = num;
                freq[num]--;
            }
        }  
        for (int num = 0; num < freq.length; num++) {
            while (freq[num] > 0) {
                result[idx++] = num;
                freq[num]--;
            }
        }

        return result;
    }
}
