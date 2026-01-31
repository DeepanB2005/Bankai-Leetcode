class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int m=0;
        int l=0;
        for(int i=0;i<s.length();i++)
        {
            while(set.contains(s.charAt(i)))
            {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(i));
            m=m>i-l+1?m:i-l+1;
        }  
        return m; 
    }
}