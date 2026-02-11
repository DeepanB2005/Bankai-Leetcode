class Solution {
    public int maxProfit(int[] prices) {
        int l=Integer.MAX_VALUE;
        int m=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<l)
            {
                l=prices[i];
            }
            else
            {
                m=m>prices[i]-l?m:prices[i]-l;
                System.out.print(m);
            }
        }
        return m;
    }
}