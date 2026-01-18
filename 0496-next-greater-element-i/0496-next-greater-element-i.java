class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int a[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            int mt=0;
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
mt=j;
break;
                }
            }
            int nn=-1;
            for(int j=mt+1;j<nums2.length;j++)
            {
                if(nums1[i]<nums2[j])
                {
                    nn=nums2[j];
                    break;
                }
            }
            a[i]=nn;
        }
        return a;
    }
}