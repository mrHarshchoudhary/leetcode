class Solution {
    public int pivotInteger(int n) {
        int ans=(n*n+n)/2;
        int s=(int)Math.sqrt(ans);
        if(s*s==ans)return s;
        return -1;
    }
}