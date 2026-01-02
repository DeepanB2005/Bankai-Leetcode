class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int m=l+(r-l)/2;
        while(l<=r)
        {
            m=l+(r-l)/2;
            if(target==nums[m])
            {
                return m;
            }
            if(nums[m]>target)
            {
                r=m-1;
            }
            else
            {
                l=m+1;
            }
            
        }
        return l;
    }
}