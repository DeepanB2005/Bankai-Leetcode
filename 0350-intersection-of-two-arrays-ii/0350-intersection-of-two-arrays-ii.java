class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>l=new ArrayList<>();
        for(int i:nums1)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
    
        for(int i:nums2)
        {
            if(map.containsKey(i) && map.get(i)>0)
            {
                l.add(i);
                map.put(i,map.get(i)-1);
            }
        }
        int r[]=new int[l.size()];
        for(int i=0;i<l.size();i++)
        {
            r[i]=l.get(i);
        }
        return r;
    }
}