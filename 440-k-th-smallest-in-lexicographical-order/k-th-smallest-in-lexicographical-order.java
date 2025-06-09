class Solution {
    public static long getNostep(long n,long curr){
        long steps=0;
        long next=curr+1;
        while(curr<=n){
            if(next<=n){
                steps+=next-curr;
            }
            else{
                steps+=n-curr+1;
            }
        
        curr=curr*10;
        next=next*10;
        }
        return steps;
    }
    public int findKthNumber(int n, int k) {
        long curr=1;
        k-=1;
        while(k>0){
            long steps=getNostep(n,curr);
            if(steps<=k){
                curr=curr+1;
                k-=steps;
            }
            else{
                curr=curr*10;
                k-=1;
            }
        }
        return (int)curr;
    }
}