class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int m=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<prices[l])
            {
                l=i;
            }
            else
            {
                m=m>prices[i]-prices[l]?m:prices[i]-prices[l];
            }
        }
        return m;
    }
}