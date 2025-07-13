class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
       int takeOnes = Math.min(k, numOnes);
       int sum=0;
        sum += takeOnes;
        k -= takeOnes;

       
        int takeZeros = Math.min(k, numZeros);
     
        k -= takeZeros;

     
        int takeNegOnes = Math.min(k, numNegOnes);
        sum -= takeNegOnes;
        k -= takeNegOnes;

        return sum;
    }
}