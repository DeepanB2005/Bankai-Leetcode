class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int a[]=new int[k];
        ArrayList<Map.Entry<Integer,Integer>>l=new ArrayList<>();
        for(Map.Entry<Integer,Integer> i:map.entrySet())
        {
            l.add(i);
        }
        l.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        for(int i=0;i<k;i++)
        {
            a[i]=l.get(i).getKey();
        }
        return a;
        
    }   
}