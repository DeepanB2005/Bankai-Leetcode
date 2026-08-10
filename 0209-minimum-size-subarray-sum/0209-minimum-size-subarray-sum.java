class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int m=Integer.MAX_VALUE;
        int l=0;
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
            while(s>=target)
            {
                m=i-l+1<m?i-l+1:m;
                s-=nums[l++];
            }
        }
        return m==Integer.MAX_VALUE?0:m;
    }
}