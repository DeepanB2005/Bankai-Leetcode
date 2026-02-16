class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int lm=height[l];
        int rm=height[r];
        int m=0;
        while(l<r)
        {
            if(lm<rm)
            {
                l++;
                lm=lm<height[l]?height[l]:lm;
                m+=lm-height[l];
            }
            else
            {
                r--;
                rm=rm<height[r]?height[r]:rm;
                m+=rm-height[r];
            }
        }
        return m;
    }
}