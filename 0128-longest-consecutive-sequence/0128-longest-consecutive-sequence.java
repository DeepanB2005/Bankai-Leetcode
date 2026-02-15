class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Set<Integer>set=new HashSet<>();
        int c=0;
        int m=0;
        for(int i:nums)
        {
            set.add(i);
        }
        for(int i:set)
        {
            if(!set.contains(i-1))
            {
                int t=i;
                int l=0;
                while(set.contains(t+1))
                {
                    l++;
                    t++;
                }
            m=l<m?m:l;
                
            }
        }
        return m+1;
    }
}