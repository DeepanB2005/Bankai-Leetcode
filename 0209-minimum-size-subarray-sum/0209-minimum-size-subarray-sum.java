class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int m=Integer.MAX_VALUE;
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
            while(s>=target)
            {
                m=m<i-l+1?m:i-l+1;
                s-=nums[l];
                l++;
            }
        }
        if(m==Integer.MAX_VALUE)return 0;
        return m;
    }
}