class Solution {
    // public static int factorial(int n){
//        if (n == 0 || n == 1) return 1;
//         return n * factorial(n - 1);
//     }
     public int trailingZeroes(int n) {
//         int a=factorial(n);
// int rev=0;
// int c=0;
//         while(a>0){
//             rev=a%10;
//             if(rev==0)c++;
//             else break;
//             a=a/10;
//             rev=0;
//         }
//         return c;
 int count = 0;
    while (n > 0) {
        count += n / 5;
        n /= 5;
    }
    return count;
    }
}