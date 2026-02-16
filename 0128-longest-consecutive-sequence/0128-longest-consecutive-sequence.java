class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
        }
        int m=0;
        for(int i:set)
        {
            int c=0;
            if(!set.contains(i-1))
            {
                int t=i;
                
                while(set.contains(t))
                {
                    t++;
                    c++;
                }
            }
            m=m<c?c:m;
        }
        return m;
    }
}