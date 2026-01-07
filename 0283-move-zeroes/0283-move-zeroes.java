class Solution {
    public void moveZeroes(int[] nums) {
        int l=0;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[l]=nums[i];
                l++;
            }
            else
            {
                c++;
            }
        }
        for(int i=nums.length-c;i<nums.length;i++)
        {
            nums[i]=0;
        }
        
    }
}