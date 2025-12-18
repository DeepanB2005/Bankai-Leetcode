class Solution {
    public int maxSubArray(int[] nums) {
        int min=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            min=min+nums[i]<nums[i]?nums[i]:min+nums[i];
            max=max>min?max:min;
        }
        return max;
    }
}