class Solution {
    boolean v(char a)
    {
        return a=='a'||a=='e'||a=='i'||a=='o'||a=='u';
    }
    int mv=0;
    int c=0;
    public int maxVowels(String s, int k) {
        for(int i=0;i<k;i++)
        {
            if(v(s.charAt(i))) c++;
        }
        mv=c;
        for(int i=k;i<s.length();i++)
        {
            if(v(s.charAt(i-k)))c--;
            if(v(s.charAt(i)))c++;
            mv=mv>c?mv:c;
        }
        return mv;
    }
}