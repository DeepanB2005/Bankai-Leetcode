class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int m=1234567890;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            c+=nums[i];
            while(c>=target)
            {
                m=m>i-l+1?i-l+1:m;
                c-=nums[l];
                l++;
            }
        }
        return m==1234567890?0:m;
    }
}