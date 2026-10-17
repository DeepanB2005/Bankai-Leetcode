class Solution {
    public int[] replaceElements(int[] nums) {
        int r[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int m=0;
            for(int j=i+1;j<nums.length;j++)
            {
                m=m>nums[j]?m:nums[j];
            }
            r[i]=m;
        }
        r[r.length-1]=-1;
        return r;
    }
}