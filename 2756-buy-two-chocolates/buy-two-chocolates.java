class Solution {
    public int buyChoco(int[] prices, int money) {
      Arrays.sort(prices);

      int t=prices[0]+prices[1];
      if(t<=money)return money-t;
      else return money;

    }
}