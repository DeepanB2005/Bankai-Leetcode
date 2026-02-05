class Solution {
    public int mySqrt(int x) {
        int l=0;
        int r=x;
        while(l<=r)
        {
            int m=(l+r)/2;
            long s=(long)m*m;
            if(s==x)
            {
                return m;
            }
            if(s>x)
            {
                r=m-1;
            }
            else
            {
                l=m+1;
            }
        }
        return r;
    }
}