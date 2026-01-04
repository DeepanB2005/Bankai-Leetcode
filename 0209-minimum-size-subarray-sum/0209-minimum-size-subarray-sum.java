class Solution {
    public int minSubArrayLen(int k, int[] nums) {
        int l=0;
        int m;
        int s=0;
        int t=0;

        for(m=0;m<nums.length;m++)
        {
            t+=nums[m];
            if(t>=k)
            {
                break;
            }
        }
        m++;
        if(t<k)return 0;
        

        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
            while(s>=k)
            {
                m=m<i-l+1?m:i-l+1;
                s-=nums[l];
                l++;
            }
        }
        return m;
    }
}