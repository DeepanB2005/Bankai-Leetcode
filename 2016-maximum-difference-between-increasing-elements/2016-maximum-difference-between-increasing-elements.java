class Solution {
    public int maximumDifference(int[] nums) {
        int m=-1;
        int l=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<nums[l])
            {
                l=i;
            }
            else
            {
                m=m>nums[i]-nums[l]?m:nums[i]-nums[l];
            }
        }
        return m==0?-1:m;
    }
}