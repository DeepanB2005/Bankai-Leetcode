class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max=0;
        for(int i=0;i<prices.length;i++)
        {
            min=min<prices[i]?min:prices[i];
            max=max>prices[i]-min?max:prices[i]-min;
        }
        return max;
    }
}