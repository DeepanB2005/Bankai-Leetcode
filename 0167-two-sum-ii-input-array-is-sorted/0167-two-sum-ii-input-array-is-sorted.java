class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        while(l<r)
        {
            int t=nums[l]+nums[r];
            if(t==target)return new int[]{l+1,r+1};
            else if(t>target)r--;
            else l++;
        }
        return new int[]{};
    }
}