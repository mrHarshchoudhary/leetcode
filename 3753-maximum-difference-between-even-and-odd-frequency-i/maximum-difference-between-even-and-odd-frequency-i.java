class Solution {
    public int maxDifference(String s) {
        int odd=0;
        int even=Integer.MAX_VALUE;
         int[] c = new int[26]; 
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < c.length; i++) {
            if(c[i]==0)continue;
            if (c[i] % 2 != 0) {
                odd = Math.max(odd, c[i]);
            } else if (c[i]%2==0&&c[i] != 0) {
                even = Math.min(even, c[i]);
            }
        }

        return odd - even; 
    }
}