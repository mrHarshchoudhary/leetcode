class Solution {
    public boolean canAliceWin(int[] nums) {
      
        int sum=0;
        int d=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                    sum=sum+nums[i];
            }
            else{
                    d+=nums[i];
            }
        }
       
        return sum!=d;
    }
}