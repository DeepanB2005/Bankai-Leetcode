class Solution {
    public int maxSubArray(int[] nums) {
        int m=nums[0];
        int c=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            c=c+nums[i]>nums[i]?c+nums[i]:nums[i];
            m=m<c?c:m;
        }
        return m;
    }

}