class Solution {
    public int maxProfit(int[] prices) {
        int m=prices[0];
        int t=0;
        for(int i=0;i<prices.length;i++)
        {
            if(m>prices[i])
            {
                m=prices[i];
            }
            else
            {
                t=t>prices[i]-m?t:prices[i]-m;
            }
        }
        return t;
    }
}