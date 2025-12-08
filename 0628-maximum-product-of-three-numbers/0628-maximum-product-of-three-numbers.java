class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int mn=nums[0]*nums[1]*nums[nums.length-1];
        int pn=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int op=mn>pn?mn:pn;
        return op;
    }
}