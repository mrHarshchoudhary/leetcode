class Solution {
    public int[] rearrangeArray(int[] nums) {
        // int n=nums.length;
        // int neg[]=new int [n/2];
        // int pos[]=new int[n/2];
        // int j=0;
        // for(int i=0;i<n;i++){
        //     if(nums[i]>0)
        //         pos[j++]=nums[i];
            
          
        // }
        // int k=0;
        // for(int i=0;i<n;i++){
        //     if(nums[i]<0)neg[k++]=nums[i];
        // }
        // j=0;k=0;
        // for(int i=0;i<n;i++){
        //     if(i%2==0)
        //     nums[i]=pos[j++];
        //     else
        //     nums[i]=neg[k++];
        // }
        // return nums;
         int [] arr = new int[nums.length];
        int p = 0 , n = 1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>=0){
               arr[p] = nums[i];
               p+=2;
            }else{
                arr[n] = nums[i];
                n+=2;
            }
        }
        return arr;
    }
}