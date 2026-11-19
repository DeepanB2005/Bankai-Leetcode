class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>l1=new ArrayList<>();
        HashMap<String,List<String>>map=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            char []a=strs[i].toCharArray();
            Arrays.sort(a);
            String s=new String(a);
            if(map.containsKey(s))
            {
                map.get(s).add(strs[i]);
            }
            else
            {
                map.put(s,new ArrayList<>());
                map.get(s).add(strs[i]);
            }
        }
        return new ArrayList<>(map.values());
    }
}