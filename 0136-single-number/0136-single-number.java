class Solution {
    public int singleNumber(int[] nums) {
        int a=0;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int ab=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            if(entry.getValue()==1)
            {
                ab= entry.getKey();
            }
        }
        return ab;
    }
}