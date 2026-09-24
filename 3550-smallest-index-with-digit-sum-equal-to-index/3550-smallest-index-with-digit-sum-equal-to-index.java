class Solution {
    public int ds(int d)
    {
        int s=0;
        while(d>0)
        {
            int t=d%10;
            s+=t;
            d/=10;
        }
        return s;
    }
    public int smallestIndex(int[] nums) {
    for(int i=0;i<nums.length;i++)
    {
        int s=nums[i]>9?ds(nums[i]):nums[i];
        if(s==i)return i;
    }
    return -1;
    }
}