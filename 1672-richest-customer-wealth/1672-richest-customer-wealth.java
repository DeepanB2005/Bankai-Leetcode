class Solution {
    public int maximumWealth(int[][] accounts) {
        int m=0;
        for(int i=0;i<accounts.length;i++)
        {
            int t=0;
            for(int j=0;j<accounts[0].length;j++)
            {
                t+=accounts[i][j];
            }
            m=t>m?t:m;
        }
        return m;
    }
}