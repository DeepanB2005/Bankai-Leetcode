class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer>s=new HashSet<>();
        for(int i:nums)
        {
            s.add(i);
        }
        int i=0;
        for(i=k;i<200;i+=k)
        {

            if(!s.contains(i))
            {
                break;
            }
        }
        return i;
    }
}