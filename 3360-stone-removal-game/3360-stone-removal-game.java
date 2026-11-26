class Solution {
    public boolean canAliceWin(int n) {
        int m=10;
        while(m<=n)
        {
            n-=m;
            m--;
            if(m>n)return true;
            n-=m;
            m--;
            if(m>n)return false;
        }
        return m<n;
    }
}