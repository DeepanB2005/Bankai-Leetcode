class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int m=nums[0];
        int mx=nums[0];
                List<Integer>l1=new ArrayList<>();

        for(int i:nums)
        {
            l1.add(i);
            if(m>i)
            {
                m=i;
            }
            if(mx<i)
            {
                mx=i;
            }
        }
        List<Integer>l2=new ArrayList<>();
        for(int i=m;i<mx;i++)
        {
            if(!l1.contains(i))
            {
                l2.add(i);
            }
        }
        return l2;

    }
}