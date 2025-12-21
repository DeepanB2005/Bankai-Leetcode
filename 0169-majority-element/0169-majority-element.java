class Solution {
    public int majorityElement(int[] nums) {
        int e=nums[0];
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            if(s==0)
            {
                e=nums[i];
            }
            if(nums[i]==e)
            {
                s++;
            }
            else
            {
                s--;
            }
            
        }
        return e;
    }
}