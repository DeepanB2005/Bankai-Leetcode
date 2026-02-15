class Solution {
    public int maxProduct(int[] nums) {
        int mp=nums[0];
        int mi=nums[0];
        int m=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int t=mp;
            mp=Math.max(nums[i],Math.max(mp*nums[i],mi*nums[i]));
            mi=Math.min(nums[i],Math.min(t*nums[i],mi*nums[i]));
            m=m>mp?m:mp;
        }
        return m;
    }
}