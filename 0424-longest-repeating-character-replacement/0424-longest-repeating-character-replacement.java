class Solution {
    public int characterReplacement(String s, int k) {
        int a[]=new int[26];
        int l=0;
        int m=0;
        int mc=0;
        for(int i=0;i<s.length();i++)
        {
            a[s.charAt(i)-'A']++;
            mc=mc<a[s.charAt(i)-'A']?a[s.charAt(i)-'A']:mc;
            if((i-l+1)-mc>k)
            {
                a[s.charAt(l)-'A']--;
                l++;
            }
            m=m<i-l+1?i-l+1:m;
        }
        return m;

    }
}