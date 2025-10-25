class Solution {
    public int majorityElement(int[] nums) {
        int max=0;
        int e=nums[0];
        for(int i:nums)
        {
            if(max==0)
            {
                e=i;
            }
            if(e==i)
            {
                max++;

            }
            else
            {max--;}
        }
        return e;
    }
    
}