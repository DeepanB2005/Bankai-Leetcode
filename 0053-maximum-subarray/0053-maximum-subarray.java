class Solution {
    public int maxSubArray(int[] nums) {
        int m=nums[0];
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
            m=m<s?s:m;
            if(s<=0)
            {
                s=0;
            }
        }
        return m;
    }
}