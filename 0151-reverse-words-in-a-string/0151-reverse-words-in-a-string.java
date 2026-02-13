class Solution {
    public String reverseWords(String s) {
    s=s.trim();
    String sa[]=s.split("\\s+");
    
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<sa.length;i++)
    {
        sb.append(sa[sa.length-1-i].trim());

        sb.append(" ");
    }
        return sb.toString().trim();
    }
}