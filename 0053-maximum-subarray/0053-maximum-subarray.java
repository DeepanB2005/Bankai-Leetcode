class Solution {
    public int maxSubArray(int[] nums) {
        int cm=nums[0];
        int m=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            cm=cm+nums[i]>nums[i]?cm+nums[i]:nums[i];
            m=cm>m?cm:m;
        }
        return m;
    }
}