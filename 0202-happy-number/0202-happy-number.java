class Solution {
    public boolean isHappy(int n) {
        while(n!=1 && n!=4)
        {
            int r=0;
            while(n>0)
            {
                int l=n%10;
                r+=l*l;
                n/=10;
            }
            n=r;
        }
        return n==1;
    }
}