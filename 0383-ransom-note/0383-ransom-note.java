class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<magazine.length();i++)
        {
            char t=magazine.charAt(i);
            map.put(t,map.getOrDefault(t,0)+1);
        }
        for(int i=0;i<ransomNote.length();i++)
        {
            char t=ransomNote.charAt(i);
            if(map.containsKey(t) && map.get(t)!=0)
            {
                map.put(t,map.get(t)-1);
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}