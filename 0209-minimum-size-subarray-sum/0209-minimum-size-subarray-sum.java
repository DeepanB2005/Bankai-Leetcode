class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int m=1234567890;
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
            while(s>=target)
            {
                s-=nums[l];
                l++;
                m=m>i-l+1?i-l+1:m;
            }

        }
        return m==1234567890?0:m+1;
    }
}