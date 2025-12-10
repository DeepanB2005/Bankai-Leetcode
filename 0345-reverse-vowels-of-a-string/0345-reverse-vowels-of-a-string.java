class Solution {
    public String reverseVowels(String s) {
        int l=0;
        int r=s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        HashSet<Character>set=new HashSet<>();
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        String op="";
        while(l<r)
        {
            if(!set.contains(s.charAt(l)))
            {
                l++;
            }
            else if(!set.contains(s.charAt(r)))
            {
                r--;
            }
            else
            {

                char t=sb.charAt(l);
                sb.setCharAt(l,sb.charAt(r));
                sb.setCharAt(r,t);
                l++;
                r--;
            }
        }
        s=sb.toString();
        return s;
    }
}