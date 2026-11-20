class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int m=0;
        int mc=0;
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            mc=mc>map.get(s.charAt(i))?mc:map.get(s.charAt(i));
            if((i-l+1)-mc>k)
            {
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
            m=m>i-l+1?m:i-l+1;
        }
        return m;
    }
}