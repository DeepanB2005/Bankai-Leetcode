class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s=strs[0];
        String r="";
        for(int i=strs.length-1;i>0;i--)
        {
            while(strs[i].indexOf(s)!=0)
            {
                s=s.substring(0,s.length()-1);
            }
        }
        return s;
    }
}