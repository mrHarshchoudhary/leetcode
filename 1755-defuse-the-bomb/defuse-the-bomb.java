class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;

        int arr[]=new int[n];
        if(k==0)return arr;
        for(int i=0;i<n;i++){
            int sum=0;
            if(k>0){
                for(int j=i+1;j<=i+k;j++){
                    sum+=code[j%n];
                }
            }
            else{
                for(int j=i+k;j<i;j++)sum+=code[(j+n)%n];
            }
            arr[i]=sum;
        }
return arr;
    }
}