class Solution {
    public int maxProfit(int[] prices) {
        int l=prices[0];
        int m=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<l)
            {
                l=prices[i];
            }
            else
            {
                m=m<prices[i]-l?prices[i]-l:m;
            }
        }
        return m;
    }
}