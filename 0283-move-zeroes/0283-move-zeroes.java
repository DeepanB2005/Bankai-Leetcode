class Solution {
    public void moveZeroes(int[] nums) {
        int l=0;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)c++;
            else
            {
                nums[l++]=nums[i];
            }
        }
        for(int i=0;i<c;i++)
        {
            nums[nums.length-1-i]=0;
        }
    }
}