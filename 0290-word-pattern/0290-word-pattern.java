class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String>map=new HashMap<>();
        Map<String,Character>rev=new HashMap<>();
        String sa[]=s.split(" ");
        if(pattern.length()!=sa.length)return false;
        for(int i=0;i<pattern.length();i++)
        {
            if(map.containsKey(pattern.charAt(i))) {
                if(!map.get(pattern.charAt(i)).equals(sa[i]))
            {
                return false;
            }
        }
            else
            {
                if(rev.containsKey(sa[i]))
                {
                    return false;
                }
                map.put(pattern.charAt(i),sa[i]);
                rev.put(sa[i],pattern.charAt(i));
            }
        }
        return true;
    }
}