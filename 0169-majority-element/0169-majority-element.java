class Solution {
    public int majorityElement(int[] nums) {
        int m=nums[0];
        int v=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==m)
            {
                v++;
            }
            else{
                v--;
            }
            if(v==0)
            {
                m=nums[i];
                v=1;
            }

        }
        return m;
    }
}