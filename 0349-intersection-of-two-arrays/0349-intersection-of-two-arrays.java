class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         Set<Integer>set=new HashSet<>();
         for(int i:nums1)
         {
            set.add(i);
         }
         Set<Integer>set1=new HashSet<>();
         for(int i:nums2)
         {
            if(set.contains(i))
            {
                set1.add(i);
            }
         }
         int a[]=new int[set1.size()];
         int j=0;
         for(int i:set1)
         {
            a[j]=i;
            j++;
         }
         return a;
    }
}