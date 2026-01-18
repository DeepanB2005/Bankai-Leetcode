class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>st=new HashSet<>();
        int l=0;
        int m=0;
        for(int i=0;i<s.length();i++)
        {
            while(st.contains(s.charAt(i)))
            {
                st.remove(s.charAt(l));
                l++;
            }
            st.add(s.charAt(i));
            m=m<i-l+1?i-l+1:m;
        }
        return m;
    }
}