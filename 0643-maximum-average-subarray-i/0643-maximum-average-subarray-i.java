class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=k;
        int r=0;
        double op=0;
        for(int i=0;i<k;i++)
        {
            r+=nums[i];
        }
        op=r;
        for(int i=1;i<nums.length-k+1;i++)
        {
            r-=nums[i-1];
            r+=nums[l];
            op=op<r?r:op;
            l++;
        }
        return op/k;
    }
}