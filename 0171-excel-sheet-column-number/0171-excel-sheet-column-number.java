class Solution {
    public int titleToNumber(String columnTitle) {
        int r=0;
        for(int i=0;i<columnTitle.length();i++)
        {
            int t=columnTitle.charAt(i)-'A'+1;
            r=r*26+t;
        }
        return r;
    }
}