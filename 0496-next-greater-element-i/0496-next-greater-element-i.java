class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer>s=new Stack<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        s.push(nums2[0]);
        for(int i=1;i<nums2.length;i++)
        {
            while(!s.isEmpty() && nums2[i]>s.peek())
            {
                map.put(s.pop(),nums2[i]);
            }
            s.push(nums2[i]);
        }
        int a[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            a[i]=map.getOrDefault(nums1[i],-1);
        }
        return a;
    }
}