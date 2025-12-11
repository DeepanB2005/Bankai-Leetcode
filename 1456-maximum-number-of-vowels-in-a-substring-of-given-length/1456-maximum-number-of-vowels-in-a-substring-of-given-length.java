class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character>set=new HashSet<>();
        set.add('o');
        set.add('i');
        set.add('a');
        set.add('e');
        set.add('u');
        int m=0;
        int c=0;

        for(int i=0;i<k;i++)
        {
            if(set.contains(s.charAt(i)))
            {
                c++;
            }
        }
        m=c;
        for(int i=k;i<s.length();i++)
        {
            if(set.contains(s.charAt(i-k)))
            {
                c--;
            }
            if(set.contains(s.charAt(i)))
            {
                c++;
            }
            m=m>c?m:c;
        }
        return m;
    }
}