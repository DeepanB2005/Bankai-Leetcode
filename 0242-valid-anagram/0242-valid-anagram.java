class Solution {
    public boolean isAnagram(String s, String t) {
        char[]ar=s.toCharArray();
        char[]ar2=t.toCharArray();
        Arrays.sort(ar);
        Arrays.sort(ar2);
        String s1=new String(ar);
        String s2=new String(ar2);
        return s1.equals(s2);

    }

}