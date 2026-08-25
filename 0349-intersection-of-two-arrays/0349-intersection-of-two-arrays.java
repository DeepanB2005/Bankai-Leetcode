class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer>s1=new HashSet<>();
        List<Integer>a=new ArrayList<>();
        for(int i:nums1)
        {
            s1.add(i);
        }
        for(int i:nums2)
        {
            if(s1.contains(i))
            {
                s1.remove(i);
                a.add(i);
            }
        }
        int r[]=new int[a.size()];
        for(int i=0;i<a.size();i++)
        {
            r[i]=a.get(i);
        }
        return r;
    }
}