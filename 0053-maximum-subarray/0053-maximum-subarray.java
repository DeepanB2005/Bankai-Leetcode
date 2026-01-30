class Solution {
    public int maxSubArray(int[] nums) {
        int cm=0;
        int m=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(cm<0)cm=0;
            cm+=nums[i];
            m=m<cm?cm:m;
        }
        return m;
    }
}