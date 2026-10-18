class Solution {
        public char[] asrt(String s)
        {
            char[]a=s.toCharArray();
            Arrays.sort(a);
            return a;
        }


    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>>l1=new ArrayList<>();
        int c=0;
        Map<String,Integer>map=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            String a=new String(asrt(strs[i]));
            if(map.containsKey(a))
            {
                l1.get(map.get(a)).add(strs[i]);
                System.out.println(map);
            }
            else
            {
                ArrayList<String>l=new ArrayList<>();
                l.add(strs[i]);
                l1.add(l);
                map.put(new String(asrt(strs[i])),c++);
            }
        }

        return l1;
    }
}