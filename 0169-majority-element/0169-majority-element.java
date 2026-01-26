class Solution {
    public int majorityElement(int[] nums) {
        int cm=nums[0];
        int m=0;
        for(int i=0;i<nums.length;i++)
        {
            if(m==0)
            {
                cm=nums[i];
            }
            if(nums[i]==cm)
            {
                m++;
            }
            else
            {
                m--;
            }
            
        }
        return cm;
    }
}