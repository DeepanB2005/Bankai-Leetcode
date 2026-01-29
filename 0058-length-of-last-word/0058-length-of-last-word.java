class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int c=0;
        for(int i=s.length()-1;i>0;i--)
        {
            c++;
            if(s.charAt(i)==' ')
            {
                return c-1;
            }
        }
        return c+1;
    }
}