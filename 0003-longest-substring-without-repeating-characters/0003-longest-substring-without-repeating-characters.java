class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int l=0;
        int m=0;
        for(int i=0;i<s.length();i++)
        {
            while(set.contains(s.charAt(i)))
            {
                set.remove(s.charAt(l));
                l+=1;
            }
            set.add(s.charAt(i));
            m=m>set.size()?m:set.size();
        }
        return m;
    }
}