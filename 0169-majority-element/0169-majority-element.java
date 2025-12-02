class Solution {
    public int majorityElement(int[] nums) {
        int mc=nums[0];
        int sc=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==mc)
            {
                sc++;
            }
            else
            {
                sc--;
            }
            if(sc==0)
            {
                mc=nums[i];
                sc=1;
            }
        }
        return mc;
    }
}