class Solution {
    public int largestAltitude(int[] gain) {
        int m=0;
        int t=0;
        for(int i=0;i<gain.length;i++)
        {
            t+=gain[i];
            m=m>t?m:t;
        }
        return m;
    }
}