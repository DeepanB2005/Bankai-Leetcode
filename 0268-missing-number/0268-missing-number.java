class Solution {
    public int missingNumber(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int s=0;
        for(int i=0;i<nums.length+1;i++)
        {
            if(!map.containsKey(i))
            {
                s=i;
            }
        }
        return s;

    }
}