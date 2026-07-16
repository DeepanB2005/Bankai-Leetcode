class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int m=0;
        while(l<=r)
        {
            int w=(r-l)*Math.min(height[l],height[r]);
            
            m=Math.max(w,m);
            System.out.println(w);
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