class Solution {
    public int maxArea(int[] height) {
        int m=0;
        int l=0;
        int r=height.length-1;
        while(l<r)
        {
            int w=r-l;
            int ch=height[l]>height[r]?height[r]:height[l];
            int wt=ch*w;
            m=m<wt?wt:m;
            if(height[l]>height[r])
            {
                r--;
            }
            else
            {
                l++;
            }
        }
        return m;
    }
}