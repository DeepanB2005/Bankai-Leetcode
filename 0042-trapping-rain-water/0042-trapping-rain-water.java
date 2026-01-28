class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int lm=height[0];
        int rm=height[height.length-1];
        int w=0;
        while(l<r)
        {
            if(lm>rm)
            {
                r--;
                rm=rm>height[r]?rm:height[r];
                w+=rm-height[r];
            }
            else
            {
                l++;
                lm=lm>height[l]?lm:height[l];
                w+=lm-height[l];
            }
        }
        return w;
    }
}