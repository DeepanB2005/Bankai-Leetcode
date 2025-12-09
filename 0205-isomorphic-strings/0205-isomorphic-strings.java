class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>sm=new HashMap<>();
        HashMap<Character,Character>tm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ss=s.charAt(i);
            char tt=t.charAt(i);
            if(sm.containsKey(ss) && sm.get(ss)!=tt)
            {
                return false;
            }
            else{
                sm.put(ss,tt);
            }
            if(tm.containsKey(tt) && tm.get(tt)!=ss)
            {
                return false;
            }
            else{
                tm.put(tt,ss);
            }
        }
        return true;
    }
}