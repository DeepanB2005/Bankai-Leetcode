class Solution {
    public int trap(int[] height) {
        int lm=height[0];
        int rm=height[height.length-1];
        int w=0;
        int l=0;
        int r=height.length-1;
        while(l<r)
        {
            if(lm>rm)
            {
                r--;
                rm=Math.max(height[r],rm);
                w+=rm-height[r];
            }
            else
            {
                l++;
                lm=Math.max(height[l],lm);
                w+=lm-height[l];

            }
        }
        return w;
    }
}