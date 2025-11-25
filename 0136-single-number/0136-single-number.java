class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            boolean u=true;
            for(int j=0;j<nums.length;j++)
            {
                if(i!=j && nums[i]==nums[j])
                {
                    u=false;
                    break;
                }
                
            }
            if(u)
            {
                return nums[i];
            }

        }
        return -1;
    }
}