class Solution {
    public int maxDistance(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int ll=0;
        while(nums[ll]==nums[r])
        {
            ll++;
        }
        int c=r-ll;

        while(nums[l]==nums[r])
        {
            r--;

        }
        
        return (r-l)>c?r-l:c;
    }
}