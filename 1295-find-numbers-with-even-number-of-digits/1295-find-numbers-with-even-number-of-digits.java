class Solution {
    public int findNumbers(int[] nums) {
        int n=0;
        for(int i:nums)
        {
            if(cnt(i)%2==0)
            {
                n++;
            }
        }
        return n;
    }
    public int cnt(int d)
    {
        int c=1;
        while(d>9)
        {
            d/=10;
            c++;
        }
        System.out.print(c);
        return c;
    }
}