class Solution {
    public boolean ispal(String ss)
    {
        int l=0;
        int r=ss.length()-1;
        while(l<r)
        {
            if(ss.charAt(l)!=ss.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int m=0;
        String a="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(ispal(s.substring(i,j+1)) && s.substring(i,j+1).length()>a.length())
                {
                    a=s.substring(i,j+1);
                }
            }
        }
        return a;
    }
}