class Solution {
    public int removeElement(int[] nums, int val) {
        int l=0;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[l++]=nums[i];
                c++;
            }
        }
        return c;
    }
}